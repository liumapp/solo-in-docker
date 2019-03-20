package com.liumapp.solo.transporter.contents;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

/**
 * file JsonFileContents.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/3/20
 */
@Component
public class JsonFileContents {

    private JSONObject jsonObject;

    public JsonFileContents() {
    }

    public JsonFileContents(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public JSONObject getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }
}
