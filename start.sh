#!/bin/bash

echo '============================================================='
echo '$                                                           $'
echo '$                      liumapp                              $'
echo '$                                                           $'
echo '$                                                           $'
echo '$  email:    liumapp.com@gmail.com                          $'
echo '$  homePage: http://www.liumapp.com                         $'
echo '$  Github:   https://github.com/liumapp                     $'
echo '$                                                           $'
echo '============================================================='
echo '.'
echo '运行该脚本需要您本机具有 docker + docker-compose 环境！！！'

# 在docker中启动mysql容器
# 具体配置见docker-compose.yml文件

docker-compose up -d

# 拉取solo镜像

docker pull b3log/solo

# 启动solo，并在启动过程中配置使用mysql容器

docker run --detach --name solo --network=host \
    --env RUNTIME_DB="MYSQL" \
    --env JDBC_USERNAME="root" \
    --env JDBC_PASSWORD="adminadmin" \
    --env JDBC_DRIVER="com.mysql.cj.jdbc.Driver" \
    --env JDBC_URL="jdbc:mysql://127.0.0.1:6603/solo?useUnicode=yes&characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC" \
    b3log/solo --listen_port=8080 --server_scheme=http --server_host=localhost

# 启动成功后可通过以下命令查看运行情况
# 正确情况应该会有两个容器运行，一个mysql，一个solo，这种情况下solo是通过jetty舰艇8080端口
# 如果要发布到线上的话，将8080端口更改为80，并将host更改为自己的域名即可

docker ps




