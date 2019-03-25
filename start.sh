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

# 

