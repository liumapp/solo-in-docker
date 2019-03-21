package com.liumapp.solo.transporter;

import com.liumapp.solo.transporter.contents.JsonFileContents;
import com.liumapp.solo.transporter.enums.DataEnums;
import com.liumapp.solo.transporter.loader.start.StartLoadingFile;
import com.liumapp.solo.transporter.services.impl.ArticleHandler;
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
        DataEnums datas = textIO.newEnumInputReader(DataEnums.class).read("先插入文章还是评论？");

        switch (datas) {
            case Article:
                this.handleArticle();
                break;
            case Comment:
                this.handleComment();
                break;
            default:
        }
    }

    /**
     * 处理文章数据，插入solo数据库中
     */
    private void handleArticle () {
        int length = jsonFileContents.getArticle().size();
        if (length == 0) {
            Logger.error("未能捕获到文章信息，结束");
            return ;
        }
        Logger.info("开始处理文章插入逻辑");
        Logger.info("首先插入article数据");
//        articleHandler.handle();

    }

    /**
     * 处理评论数据
     */
    private void handleComment () {

    }
}
