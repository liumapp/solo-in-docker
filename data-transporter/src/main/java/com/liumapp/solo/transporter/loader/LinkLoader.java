package com.liumapp.solo.transporter.loader;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.liumapp.qtools.file.basic.FileTool;
import com.liumapp.solo.transporter.contents.JsonFileContents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * file LinkLoader.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/3/21
 */
@Component
@Scope("prototype")
public class LinkLoader implements Runnable {
    private static final Logger Logger = LoggerFactory.getLogger(ArticleLoader.class);

    @Autowired
    private JsonFileContents jsonFileContents;

    @Override
    public void run() {
        Logger.info("LinkLoader begin...");
        try {
            String filepath = this.getClass().getResource("/json/b3_solo_link.json").getPath();
            JSONObject tmp = JSON.parseObject(FileTool.readFileAsString(filepath));
            jsonFileContents.setLink(tmp.getJSONArray("RECORDS"));
            Logger.info("LinkLoader done...");
            Logger.info("检测到有" + jsonFileContents.getLink().size() + "条友情链接数据");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
