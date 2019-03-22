package com.liumapp.solo.transporter;

import com.liumapp.solo.transporter.contents.JsonFileContents;
import com.liumapp.solo.transporter.loader.start.StartLoadingFile;
import com.liumapp.solo.transporter.services.impl.*;
import org.beryx.textio.TextIO;
import org.beryx.textio.system.SystemTextTerminal;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * file DataTransporterConsole.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/3/20
 */
@SpringBootApplication
@MapperScan("com.liumapp.solo.transporter.db.mapper")
public class DataTransporterConsole implements CommandLineRunner {

    private static Logger Logger = LoggerFactory.getLogger(DataTransporterConsole.class);

    public static TextIO textIO;

    @Autowired
    private StartLoadingFile startLoadingFile;

    @Autowired
    private JsonFileContents jsonFileContents;

    @Autowired
    private ArticleHandler articleHandler;

    @Autowired
    private CommentHandler commentHandler;

    @Autowired
    private ArchivedateArticleHandler archivedateArticleHandler;

    @Autowired
    private LinkHandler linkHandler;

    @Autowired
    private TagHandler tagHandler;

    @Autowired
    private TagArticleHandler tagArticleHandler;

    public static void main (String[] args) {
        SpringApplication.run(DataTransporterConsole.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Logger.info("Starting Data Transporter Console program...");
        SystemTextTerminal systemTextTerminal = new SystemTextTerminal();
        startLoadingFile.start();
        Thread.sleep(3000);
        textIO = new TextIO(systemTextTerminal);
        Boolean isDo = textIO.newBooleanInputReader().read("要开始导入数据吗？");
        if (isDo) {
            this.beginHandData();
        }
    }

    private void beginHandData () {
        int length = jsonFileContents.getArticle().size();
        if (length == 0) {
            Logger.error("未能捕获到文章信息，结束");
            return ;
        }
        Logger.info("开始处理文章插入逻辑");
        Logger.info("首先插入article数据");
//        articleHandler.handle();
        Logger.info("开始导入文章与创建时间的关联数据");
//        archivedateArticleHandler.handle();
        Logger.info("开始导入评论相关数据");
//        commentHandler.handle();
        Logger.info("开始导入友情链接相关数据");
//        linkHandler.handle();
        Logger.info("开始导入标签数据");
        tagHandler.handle();
        Logger.info("开始导入标签与文章的关联数据");
        tagArticleHandler.handle();
    }

}
