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

### 启动mysql容器

通过docker-compose先单独启动mysql

````shell
docker-compose up mysql -d
````

启动后，通过localhost:6603 root adminadmin 与mysql容器建立连接，并创建一个名为solo的数据库（不然直接启动的话，会报错：找不到solo数据库）

## 配置tomcat
 
直接编辑conf/server.xml文件

如果您要将solo部署到线上服务器的话，只需要根据自己的域名进行调整即可：

````xml
<Host name="localhost"  appBase="webapps"
            unpackWARs="true" autoDeploy="true"
            xmlValidation="false" xmlNamespaceAware="false">
        <Context path="ROOT" docBase="/ROOT"/>
      </Host>
      <Host name="localhost"  appBase="webapps"
            unpackWARs="true" autoDeploy="true"
            xmlValidation="false" xmlNamespaceAware="false">
        <Context path="" docBase="/solo"/>
      </Host>
      <Host name="*.liumapp.com"  appBase="webapps"
            unpackWARs="true" autoDeploy="true"
            xmlValidation="false" xmlNamespaceAware="false">
        <Context path="" docBase="/solo"/>
      </Host>
      <Host name="liumapp.com"  appBase="webapps"
            unpackWARs="true" autoDeploy="true"
            xmlValidation="false" xmlNamespaceAware="false">
        <Context path="" docBase="/solo"/>
      </Host>       
````

将上面liumapp.com等字符替换成自己的域名即可

## 编译

````shell
cd solo

mvn clean install -Dmaven.test.skip=true

rm -rf ../webapps/solo.war

cp ./target/solo.war ../webapps/
````

## 启动

在项目根目录下依次执行

````shell
./build-image.sh

docker-compose up -d
````

请注意，如果是在windows的环境下，请不要在gitbash等工具中使用，建议直接通过cmd输入命令，这样做的好处是： 在cmd下拉取docker的镜像，可以识别docker配置的其他源镜像地址

