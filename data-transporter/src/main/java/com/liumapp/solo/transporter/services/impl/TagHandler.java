package com.liumapp.solo.transporter.services.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.liumapp.solo.transporter.contents.JsonFileContents;
import com.liumapp.solo.transporter.db.entity.B3SoloTag;
import com.liumapp.solo.transporter.db.mapper.B3SoloTagMapper;
import com.liumapp.solo.transporter.services.HandDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private JsonFileContents jsonFileContents;

    @Autowired
    private B3SoloTagMapper mapper;

    @Override
    public void handle() {
        JSONArray tags = jsonFileContents.getTag();
        B3SoloTag b3SoloTag = new B3SoloTag();
        for (Iterator iterator = tags.iterator(); iterator.hasNext();) {
            JSONObject tag = (JSONObject) iterator.next();
            b3SoloTag.setOId(tag.get("oId").toString());
            b3SoloTag.setTagTitle(tag.get("tagTitle").toString());
            mapper.insert(b3SoloTag);
        }
        logger.info("成功插入" + tags.size() + "条tag记录");
    }

}
