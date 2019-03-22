package com.liumapp.solo.transporter.services.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.liumapp.solo.transporter.contents.JsonFileContents;
import com.liumapp.solo.transporter.db.entity.B3SoloLink;
import com.liumapp.solo.transporter.db.mapper.B3SoloLinkMapper;
import com.liumapp.solo.transporter.services.HandDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;

/**
 * file LinkHandler.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/3/21
 */
@Service
public class LinkHandler implements HandDataService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private JsonFileContents jsonFileContents;

    @Autowired
    private B3SoloLinkMapper mapper;

    @Override
    public void handle() {
        JSONArray links = jsonFileContents.getLink();
        B3SoloLink b3SoloLink = new B3SoloLink();
        for (Iterator iterator = links.iterator(); iterator.hasNext();) {
            JSONObject link = (JSONObject) iterator.next();
            b3SoloLink.setOId(link.get("oId").toString());
            b3SoloLink.setLinkAddress(link.get("linkAddress").toString());
            b3SoloLink.setLinkDescription(link.get("linkDescription").toString());
            b3SoloLink.setLinkOrder(Integer.parseInt(link.get("linkOrder").toString()));//建议清空新版本link库后再插入
            b3SoloLink.setLinkTitle(link.get("linkTitle").toString());
            mapper.insert(b3SoloLink);
        }
        logger.info("已成功插入" + links.size() + "条link记录");
    }
}
