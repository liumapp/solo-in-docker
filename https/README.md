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

ssl证书一开始我打算选用let's encrypt证书（获取证书步骤请参考这里:[acme.sh获取Let's encrypt证书](https://www.liumapp.com/articles/2019/05/23/1558574698880.html)，或者直接使用certbot），但我最后还是选择了赛门铁克的证书...

证书获取非常简单，步骤省略，请您自行获取，然后将证书文件拷贝到服务器的/root/cert/目录下（其他目录也行，换目录的请自行修改nginx.conf跟docker-compose.yml文件，确保nginx知道证书在哪）

## 2. 修改配置文件

在启动需要修改两个配置文件

* nginx/conf/nginx.conf

* docker-compose.yml

### 2.1 配置Nginx

编辑nginx/conf/nginx.conf文件

将所有www.liumapp.com与liumapp.com替换为您自己的站点

然后修改下述两块证书文件名称(路径不用改，直接改证书名即可)

````
ssl_certificate /etc/nginx/conf.d/liumapp.com/2246381_www.liumapp.com.pem;
ssl_certificate_key /etc/nginx/conf.d/liumapp.com/2246381_www.liumapp.com.key;
````

### 2.2 配置docker-compose

编辑docker-compose.yml文件

按照"//"后面的备注进行修改


````yaml
version: "2"

services:
  mysql:
    container_name: mysql
    image: mysql:5.5.60
    restart: always
    volumes:
      - ./mysql/conf/mysqld.conf:/etc/mysql/mysql.conf.d/mysqld.cnf //mysql的配置文件存放地址
    ports:
      - "6603:3306" //6603代表宿主机端口，3306代编容器的端口
    environment:
      - MYSQL_ROOT_PASSWORD=adminadmin //mysql的root账号密码
    command: --max_allowed_packet=32505856 //在这里配置mysql的全局参数  
  solo:
    container_name: solo
    image: b3log/solo //直接使用最新版本的solo镜像
    restart: always
    ports:
      - "8080:8080" //https部署的方式不需要修改此处
    environment: //此处配置solo跟mysql的连接设置，来源为上面启动的mysql容器，如果要用自己的mysql服务，那么请将mysql的servcie去掉
      RUNTIME_DB: "MYSQL"
      JDBC_USERNAME: "root"
      JDBC_PASSWORD: "adminadmin"
      JDBC_DRIVER: "com.mysql.jdbc.Driver"
      JDBC_URL: "jdbc:mysql://mysql:3306/solo?useUnicode=yes&characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC" //此处，因为solo跟mysql同为docker容器，所以可以直接使用容器名 + 容器端口来访问
    command: --listen_port=8080 --server_port=80 --server_scheme=https --server_host=www.liumapp.com //按照solo官方要求，在solo启动之初，配置solo的域名、端口，如
    果是本地测试的话，将host改为localhost即可
  nginx: 
    container_name: nginx
    image: nginx:latest
    restart: always
    ports:
      - "80:80"
      - "443:443"
    volumes:
      - "./nginx/conf:/etc/nginx/conf.d" //映射nginx目录到docker容器中
      - "/root/cert/:/etc/nginx/conf.d/liumapp.com" //映射服务器的证书目录到docker容器中
      - "./nginx/www/:/var/www/" //映射www目录到docker容器中，后期您可以在这里部署自己的静态站点或者php站点

````    

## 启动

* 启动命令

    ````shell
    docker-compose up -d
    ````
    
* 停止命令

    ````shell
    docker-compose down
    ````
    
* 查看日志的命令

  solo: 

    ```
    docker logs -t -f --tail 100 solo
    ```                                

  nginx: nginx的日志会直接输出在nginx/conf/目录下的文件中
    
## 效果展示

https://www.liumapp.com    

## 注意事项

* docker-compose 只是一个 docker 容器的编排工具，本质还是 docker 容器在运行

* 每一次命令 docker-compose 启动的时候，都会自动拉取最新 solo 的镜像，所以自动更新非常简单

* 数据备份问题，docker 容器死亡的时候，容器内数据会自动清除，除非我们使用 volumes 构建映射关系，这里我只将最重要的 mysql 数据库文件映射在 mysql/data 目录下

