# solo-in-docker

> 一条命令在docker中启动solo，所有麻烦的配置全部用docker-compose编排解决。One simple command to starts solo in docker, with all troublesome configurations solved by docker-compose orchestration.

## 1. HTTP部署

* clone项目，```cd http```进入http目录

* 按照http目录下的readme配置docker-compose，只需要修改自己的域名跟端口

* 启动，结束（启动、结束、查看日志等命令请参考http目录下的readme）

## 2. HTTPS部署

* 请自行获取ssl数字证书

* clone项目，```cd https```进入https目录

* 按照https目录下的readme配置nginx.conf与docker-compose，前者是让nginx找到证书，后者是修改自己的域名跟端口

* 启动，结束

## 3. 先部署HTTP再升级HTTPS

对于一些老用户，可能您之前用的http方式部署的项目，现在想升级到https的话，只需要做两件事情

* 按照https目录下的readme获取证书、配置

* 将老项目的mysql/data目录复制替换到https的mysql/data目录即可

## 4. 成功案例

欢迎发PR补充～

* https://www.liumapp.com/

* https://www.muyuanhuck.cn/

