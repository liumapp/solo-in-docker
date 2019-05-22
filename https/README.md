# https

> nginx部署let's encrypt证书，然后反向代理solo

## 1. 前提准备

### 1.1 安装docker

确保系统环境具有docker + docker-compose

检查命令：

  ```
  docker -v
  docker-compose -v
  ```

安装命令  :

* CentOS: 

  ````
  yum install docker
  yum install docker-compose
  ````

* MacOS:

  请参考这篇博客：[MacOS安装docker](http://www.liumapp.com/articles/2017/12/27/1514347974172.html)      

### 1.2 获取证书

ssl证书我们选用let's encrypt证书，获取工具我们选用[acme.sh](https://github.com/Neilpang/acme.sh)

关于acme.sh的下载和使用非常简单，官方[wiki](https://github.com/Neilpang/acme.sh/wiki/%E8%AF%B4%E6%98%8E)上有非常详细的介绍，这里不做多余赘述

操作步骤：

获取txt解析记录

````shell
~/.acme.sh/acme.sh --issue -d liumapp.com --dns --yes-I-know-dns-manual-mode-enough-go-ahead-please
````

请注意将域名换成您自己的

没出意外，可以获取以下结果

````shell
[Wed May 22 16:28:54 CST 2019] Creating domain key
[Wed May 22 16:28:54 CST 2019] The domain key is here: /root/.acme.sh/liumapp.com/liumapp.com.key
[Wed May 22 16:28:54 CST 2019] Single domain='liumapp.com'
[Wed May 22 16:28:54 CST 2019] Getting domain auth token for each domain
[Wed May 22 16:28:56 CST 2019] Getting webroot for domain='liumapp.com'
[Wed May 22 16:28:56 CST 2019] Add the following TXT record:
[Wed May 22 16:28:56 CST 2019] Domain: '_acme-challenge.liumapp.com'
[Wed May 22 16:28:56 CST 2019] TXT value: 'tzh7--4EldLpZUJlSAkxF6sZ63q7lxJdvnE2a-8IGF4'
[Wed May 22 16:28:56 CST 2019] Please be aware that you prepend _acme-challenge. before your domain
[Wed May 22 16:28:56 CST 2019] so the resulting subdomain will be: _acme-challenge.liumapp.com
[Wed May 22 16:28:56 CST 2019] Please add the TXT records to the domains, and re-run with --renew.
[Wed May 22 16:28:56 CST 2019] Please add '--debug' or '--log' to check more details.
[Wed May 22 16:28:56 CST 2019] See: https://github.com/Neilpang/acme.sh/wiki/How-to-debug-acme.sh
````

然后设置自己域名DNS解析记录即可，解析完成后证书也随之生效（证书路径也在上述提示信息中）












接下来我们

* 配置docker-compose.yml文件，需要注意的事项已经全部//备注好了

    ````yaml
    version: "2"
    
    services:
      mysql:
        container_name: mysql
        image: mysql:5.5.60
        restart: always
        volumes:
          - ./mysql/data:/var/lib/mysql //mysql的数据文件存放地址
          - ./mysql/conf/mysqld.conf:/etc/mysql/mysql.conf.d/mysqld.cnf //mysql的配置文件存放地址
        ports:
          - "6603:3306" //6603代表宿主机端口，3306代编容器的端口
        environment:
          - MYSQL_ROOT_PASSWORD=adminadmin //mysql的root账号密码
      solo:
        container_name: solo
        image: b3log/solo //直接使用最新版本的solo镜像
        restart: always
        ports:
          - "8080:8080" //如果要部署到线上的话，请改为"80:80"，同时修改下面的--listen_port=80
        environment: //此处配置solo跟mysql的连接设置，来源为上面启动的mysql容器，如果要用自己的mysql服务，那么请将mysql的servcie去掉
          RUNTIME_DB: "MYSQL"
          JDBC_USERNAME: "root"
          JDBC_PASSWORD: "adminadmin"
          JDBC_DRIVER: "com.mysql.jdbc.Driver"
          JDBC_URL: "jdbc:mysql://mysql:3306/solo?useUnicode=yes&characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC" //此处，因为solo跟mysql同为docker容器，所以可以直接使用容器名 + 容器端口来访问
        command: --listen_port=8080 --server_scheme=http --server_host=www.liumapp.com //按照solo官方要求，在solo启动之初，配置solo的域名、端口，如果是本地测试的话，将host改为localhost即可
    ````    
        
* 启动命令

    ````shell
    docker-compose up -d
    ````
    
* 停止命令

    ````shell
    docker-compose down
    ````
    
* 查看solo日志的命令

    ```
    docker logs -t -f --tail 100 solo
    ```                                
    
## 效果展示

http://www.liumapp.com    

## 注意事项

* docker-compose 只是一个 docker 容器的编排工具，本质还是 docker 容器在运行

* 每一次命令 docker-compose 启动的时候，都会自动拉取最新 solo 的镜像，所以自动更新非常简单

* 数据备份问题，docker 容器死亡的时候，容器内数据会自动清除，除非我们使用 volumes 构建映射关系，这里我只将最重要的 mysql 数据库文件映射在 mysql/data 目录下

