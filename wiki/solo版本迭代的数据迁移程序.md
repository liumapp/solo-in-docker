# solo版本迭代的数据迁移程序

> 考虑到solo版本迭代有点快，作为从solo1.X开始使用的用户，我依次经历了1.x -> 2.2 -> 3.3的两次惨痛更新经历，回收总结后发现，每次版本迭代最最麻烦的无非是D大又又又改数据库表结构，所以干脆用Java写一个通用的数据迁移程序，方便自己以后更新，也方便其他solo死忠粉使用

## 基本流程

首先把老版本的数据导出为sql文件，再利用这个项目： https://github.com/martindrapeau/csvjson-app 将sql转为json文件

可能有人会问，solo本身不是已经提供了数据导出为json吗？为什么要这么折腾呢？

回答：因为老版本的solo，比如2.2.0版本的，就不支持数据导出为json

然后通过data-transporter这个项目的代码，将json文件的数据根据新版本的逻辑插入数据库中（不同的solo版本需要使用不同的逻辑，到时候再去改吧...）

附上sql转换为json的效果图：

下载这个json文件后，保存到data-transport项目的resources目录下，假设它的名字为csvjson.json

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

用debug模式启动后，我们便能够在mysql数据库中，看到solo最新版本的数据库表结构已经生成成功

接下来授权GitHub登陆，步骤省略

因为我们只关心文章和评论的数据迁移，所以最终需要关心的表便是：tag_article（标签与文章的关联表）, tag（标签）, article, archivedate_article（文章创建日期）,comment

其中最复杂的便是文章的处理逻辑

先来了解最新版本的solo是如何处理文章和评论的逻辑

### 添加文章的流程

首先进入管理后台，走一遍发起文章的流程

因为最新版本的solo支持社区提供文章封面图片，所以我们可以在idea的console中看到这样一串提示：

````shell
[ERROR]-[2019-03-19 16:43:02]-[org.b3log.solo.util.Solos:211]: 如果你需要使用社区提供的图床，请将博客账号和社区账号的 B3 Key 设置成一致
````

那么不需要多解释了，去社区找到自己的b3log key，拷贝过来，打开本地数据库的b3_solo_user，插入userB3Key即可

插曲：我本人实际操作过程中，即使b3log key已经一致，还是会产生这个问题，经过检查，发现不仅仅要求key要一致，username也要相同（本地的solo跟社区的用户名要一致，既然本地是用的github的用户名，那么社区的用户名也必须是GitHub的用户名，而我在社区注册的比较早...）

通过前端的network，我们可以知道，本地发布文章的api地址是：http://localhost:8080/console/article/

新版本的solo发布文章跟老版本最大的区别，在于新版本新增了一个articleImg1URL这个字段，里面存储的内容便是文章的封面图片url地址，我们老版本的文章并没有这条数据，所以需要动态生成它

那么如何动态生成呢？其实很简单，我们可以直接用solo中的这一段代码：

````java
public static String randImage() {
    try {
        final long min = DateUtils.parseDate("20171104", new String[]{"yyyyMMdd"}).getTime();
        final long max = System.currentTimeMillis();
        final long delta = max - min;
        final long time = ThreadLocalRandom.current().nextLong(0, delta) + min;

        return "https://img.hacpai.com/bing/" + DateFormatUtils.format(time, "yyyyMMdd") + ".jpg";
    } catch (final Exception e) {
        LOGGER.log(Level.ERROR, "Generates random image URL failed", e);

        return "https://img.hacpai.com/bing/20171104.jpg";
    }
}

返回的结果便是得到的图片地址，在这个值得基础上增加"?imageView2/1/w/768/h/432/interlace/1/q/100"便可

最终得到得结果将是："https://img.hacpai.com/bing/20171204.jpg?imageView2/1/w/768/h/432/interlace/1/q/100"










### 添加评论的流程





