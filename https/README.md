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

ssl证书一开始我打算选用let's encrypt证书（获取证书步骤请参考这里:[acme.sh获取Let's encrypt证书](https://www.liumapp.com/articles/2019/05/23/1558574698880.html)），但经过实际测试发现，如果域名不绑定在cloudflare提供的DNS解析服务地址上，浏览器会提示证书是不可信的，所以最后还是选择了赛门铁克的证书

证书获取非常简单，步骤省略，请您自行获取，然后将证书文件拷贝到服务器的/root/cert/目录下（其他目录也行，换目录的请自行修改nginx.conf跟docker-compose.yml文件，确保nginx知道证书在哪）

## 2. 修改配置文件



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

