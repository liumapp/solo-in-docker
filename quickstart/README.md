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

### 自行编译caddy1镜像

curl https://getcaddy.com | bash -s personal consul,dns,hook.service,http.authz,http.cache,http.cgi,http.cors,http.datadog,http.expires,http.filter,http.forwardproxy,http.geoip,http.git,http.gopkg,http.grpc,http.ipfilter,http.jwt,http.locale,http.login,http.mailout,http.minify,http.nobots,http.permission,http.prometheus,http.proxyprotocol,http.pubsub,http.ratelimit,http.realip,http.reauth,http.recaptcha,http.restic,http.s3browser,http.supervisor,http.torproxy,http.webdav,net,redis,supervisor,tls.dns.cloudflare

cp /usr/local/bin/caddy ./

docker build -t caddy .

### 1.2 获取证书


因为域名在cloudflare托管，所以我用了dns插件。
如果不需要cloudflare在Caddyfile中直接把tls那边修改为
tls <mail>{
  protocols tls1.1 tls1.2
}


## 2. 修改配置文件

在启动需要修改两个配置文件

* caddy/conf/Caddyfile

* docker-compose.yml

### 2.1 配置Caddy

编辑caddy/conf/Caddyfile文件

将所有solo.mufengs.com替换为您自己的站点

有静态页面需要跑的，直接caddyfile
添加root /data/
然后把页面放到 caddy/www

### 2.2 配置docker-compose

编辑docker-compose.yml文件

按照"//"后面的备注进行修改


````yaml
version: "2"

services:
  solo:
    container_name: solo
    image: b3log/solo:latest
    restart: always
    ports:
      - "8080:8080"
    volumes:
      - "/root/solo_h2/:/opt/solo/h2/"
    environment:
      RUNTIME_DB: "H2"
      JDBC_USERNAME: "root"
      JDBC_PASSWORD: "123456"
      JDBC_DRIVER: "org.h2.Driver"
      JDBC_URL: "jdbc:h2:/opt/solo/h2/db;MODE=MYSQL"
    command: --listen_port=8080 --server_port=80 --server_scheme=https --server_host=solo.mufengs.com
  caddy:
    container_name: caddy
    image: mufeng5619/caddy:latest //自建镜像修改这里
    restart: always
    environment: //不用cloudflare的这边可以去掉
      CLOUDFLARE_API_KEY: "be38b105926db0ad9"  
      CLOUDFLARE_EMAIL: "mufen@gmail.com"

    ports:
      - "80:80"
      - "443:443"
    volumes:
      - "./caddy/conf/Caddyfile:/etc/caddy/Caddyfile" //配置文件挂载
      - "./caddy/www:/data" //其他页面
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
## 效果展示

https://solo.mufengs.com    

## 注意事项

* docker-compose 只是一个 docker 容器的编排工具，本质还是 docker 容器在运行

* 每一次命令 docker-compose 启动的时候，都会自动拉取最新 solo 的镜像，所以自动更新非常简单



