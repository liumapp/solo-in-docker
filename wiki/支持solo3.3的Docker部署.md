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

首先检查：mysql/data/目录下是否有solo这个文件夹，如果有的话则不需要走下面的配置

通过docker-compose先单独启动mysql

````shell
docker-compose up mysql -d
````

启动后，通过localhost:6603 root adminadmin 与mysql容器建立连接，并创建一个名为solo的数据库（不然直接启动的话，会报错：找不到solo数据库）

### 配置tomcat
 
直接编辑conf/server.xml文件

如果您要将solo部署到线上服务器的话，只需要根据自己的域名进行调整即可：

````xml
<Host name="localhost"  appBase="webapps"
    unpackWARs="true" autoDeploy="true">
	<Valve className="org.apache.catalina.valves.AccessLogValve" directory="logs"
	       prefix="localhost_access_log" suffix=".txt"
	       pattern="%h %l %u %t %r %s %b"/>
	<Context path="./solo" docBase="solo" reloadable="true"/>
</Host>
<Host name="liumapp.com"  appBase="webapps"
    unpackWARs="true" autoDeploy="true">
	<Alias>www.liumapp.com</Alias>
	<Valve className="org.apache.catalina.valves.AccessLogValve" directory="logs"
	       prefix="localhost_access_log" suffix=".txt"
	       pattern="%h %l %u %t %r %s %b"/>
	<Context path="./solo" docBase="solo" reloadable="true"/>
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

等待10秒左右，在浏览器中访问 http://localhost/solo

不出意外就能看到solo的欢迎界面

![3.png](https://github.com/liumapp/solo-in-docker/blob/master/pic/3.png?raw=true)

再来一张效果图

![4.png](https://github.com/liumapp/solo-in-docker/blob/master/pic/4.png?raw=true)

好，项目已经跑起来了，不过啥数据也没有，如果看官是第一次运行solo的话，那么看到这一步就可以了

如果是像我一样，纯粹是喜欢solo的最新版本皮肤（我绝不是被小萝莉吸引过来的！）而更新，那么就需要把自己以前的数据导入一遍

## 拷贝数据

新版本的solo:3.3.0跟以往的老版本相比，我也不知道里面的数据表有没有变动过，但是既然是从老版本升级到新版本，数据的迁移也肯定要搞的（我这里是从solo:2.2.0更新到3.3.0）

### 线上数据备份

因为我自己的线上solo也是直接用的这个项目脚本跑起来的，所以备份很简单，登陆线上，把./mysql/data目录下的数据打包下载到本地就完成了

如果看官是用的别的方式运行solo的，请自行备份数据库

### 导入数据

因为我比较懒，所以直接将老版本的./mysql/data/整个替换到了新版本的./mysql/data中...

然后重新启动一遍docker容器后完美运行...

好吧，我也不知道这样做会不会有什么坑存在，总之先这样了...

上个效果图：











