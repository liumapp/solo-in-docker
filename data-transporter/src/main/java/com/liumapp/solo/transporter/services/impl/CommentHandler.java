package com.liumapp.solo.transporter.services.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.liumapp.solo.transporter.contents.JsonFileContents;
import com.liumapp.solo.transporter.db.mapper.B3SoloCommentMapper;
import com.liumapp.solo.transporter.services.HandDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;

/**
 * file CommentHandler.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/3/21
 */
@Service
public class CommentHandler implements HandDataService {

    @Autowired
    private JsonFileContents jsonFileContents;

    @Autowired
    private B3SoloCommentMapper mapper;

    @Override
    public void handle() {
        JSONArray comments = jsonFileContents.getComment();
        for (Iterator iterator = comments.iterator(); iterator.hasNext();) {
            JSONObject comment = (JSONObject) iterator.next();
            
        }
    }

}
