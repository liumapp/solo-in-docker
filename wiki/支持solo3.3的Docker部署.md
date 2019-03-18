# solo3.3部署Docker环境

> solo3.3 + mysql + tomcat + nginx 整套环境部署在Docker的脚本项目

## 配置solo

### 配置mysql

进入solo/src/main/resources目录，编辑local.properties文件

````properties
#### MySQL runtime ####
runtimeDatabase=MYSQL
jdbc.username=root
jdbc.password=adminadmin
jdbc.driver=com.mysql.cj.jdbc.Driver
jdbc.URL=jdbc:mysql://mysql:3306/solo?useUnicode=yes&characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC
````

## 编译

````shell
cd solo

mvn clean install -Dmaven.test.skip=true

rm -rf ../webapps/solo.war
````

## 启动

在项目根目录下依次执行

````shell
./build-image.sh

docker-compose up -d
````

请注意，如果是在windows的环境下，请不要在gitbash等工具中使用，建议直接通过cmd输入命令，这样做的好处是： 在cmd下拉取docker的镜像，可以识别docker配置的其他源镜像地址

