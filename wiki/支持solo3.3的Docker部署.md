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





