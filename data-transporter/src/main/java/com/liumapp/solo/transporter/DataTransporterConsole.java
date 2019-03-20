package com.liumapp.solo.transporter;


import com.liumapp.solo.transporter.enums.DataEnums;
import org.beryx.textio.TextIO;
import org.beryx.textio.TextIoFactory;
import org.beryx.textio.system.SystemTextTerminal;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
@MapperScan("com.liumapp.solo.transporter.mapper")
public class DataTransporterConsole implements CommandLineRunner {

    private static Logger Logger = LoggerFactory.getLogger(DataTransporterConsole.class);

    public static TextIO textIO;

    public static void main (String[] args) {
        SpringApplication.run(DataTransporterConsole.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Logger.info("Starting Data Transporter Console program...");
        SystemTextTerminal systemTextTerminal = new SystemTextTerminal();
        textIO = new TextIO(systemTextTerminal);
        DataEnums datas = textIO.newEnumInputReader(DataEnums.class).read("先插入文章还是评论？");

    }
}
