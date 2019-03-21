package com.liumapp.solo.transporter.services.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.liumapp.solo.transporter.contents.JsonFileContents;
import com.liumapp.solo.transporter.services.HandDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;

/**
 * file TagHandler.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/3/21
 */
@Service
public class TagHandler implements HandDataService {
    @Autowired
    private JsonFileContents jsonFileContents;
    @Override
    public void handle() {
        JSONArray tags = jsonFileContents.getTag();
        for (Iterator iterator = tags.iterator(); iterator.hasNext();) {
            JSONObject tag = (JSONObject) iterator.next();
        }
    }
}
