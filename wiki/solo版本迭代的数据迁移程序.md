# solo版本迭代的数据迁移程序

> 考虑到solo版本迭代有点快，作为从solo1.X开始使用的用户，我依次经历了1.x -> 2.2 -> 3.3的两次惨痛更新经历，回收总结后发现，每次版本迭代最最麻烦的无非是D大又又又改数据库表结构，所以干脆用Java写一个通用的数据迁移程序，方便自己以后更新，也方便其他solo死忠粉使用

## 基本流程

首先在MySQL中建立一个名为solo_old的数据库，然后再建立一个新版本的solo数据库（需要先创建一个空的名为solo的数据库，随后再启动solo，系统会自动创建需要的数据表），solo_old将会包含我们老版本的博客数据，而solo数据库则是新版本的solo自动创建的数据库

solo_old数据库截图如下：

solo数据库截图如下：

通过运行Java代码，我们先将老版本的solo_old数据导出为json格式，然后再根据新版本的solo数据库表结构，用代码来读取json文件，并批量插入各个表中，当然，因为每个版本的不同，在执行之前，我们肯定是要对代码做一些调整的，所以这个程序并不会具有非常高的通用性，但json的导入导出这一步还是较为通用的。

## 在idea中调试最新代码

首先，编辑solo目录下的local.properties文件，主要是配置本地的mysql：

````properties
runtimeDatabase=MYSQL
jdbc.username=root
jdbc.password=adminadmin
jdbc.driver=com.mysql.cj.jdbc.Driver
jdbc.URL=jdbc:mysql://localhost:3306/solo?useUnicode=yes&characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC
````

然后，我们直接将整个solo-in-docker项目导入idea中（选择maven管理依赖），再配置solo的启动类

截图如下：

启动后，授权GitHub登陆后，我们便能够在mysql数据库中，看到solo最新版本的数据库表结构已经生成成功







