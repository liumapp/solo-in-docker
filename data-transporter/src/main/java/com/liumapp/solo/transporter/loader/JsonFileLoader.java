package com.liumapp.solo.transporter.loader;

import com.alibaba.fastjson.JSON;
import com.liumapp.qtools.file.basic.FileTool;
import com.liumapp.solo.transporter.contents.JsonFileContents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * file JsonFileLoader.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/3/20
 */
@Component
@Scope("prototype")//确保可以与其他component交互
public class JsonFileLoader implements Runnable {

    private static final Logger Logger = LoggerFactory.getLogger(JsonFileLoader.class);

    @Autowired
    private JsonFileContents jsonFileContents;

    @Override
    public void run() {
        Logger.info("JsonFileLoader begin...");
        try {
            String filepath = this.getClass().getResource("/csvjson.json").getPath();
            jsonFileContents.setJsonObject(JSON.parseObject(FileTool.readFileAsString(filepath)));
            Logger.info("JsonFileLoader done...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
