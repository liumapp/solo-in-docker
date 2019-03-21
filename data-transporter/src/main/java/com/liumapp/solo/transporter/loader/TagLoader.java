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
 * file TagLoader.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/3/21
 */
@Component
@Scope("prototype")
public class TagLoader implements Runnable {

    private static final Logger Logger = LoggerFactory.getLogger(ArticleLoader.class);

    @Autowired
    private JsonFileContents jsonFileContents;

    @Override
    public void run() {
        Logger.info("TagLoader begin...");
        try {
            String filepath = this.getClass().getResource("/json/b3_solo_tag.json").getPath();
            jsonFileContents.setTag(JSON.parseObject(FileTool.readFileAsString(filepath)));
            Logger.info("TagLoader done...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
