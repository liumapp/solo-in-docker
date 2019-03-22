package com.liumapp.solo.transporter.services.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.liumapp.solo.transporter.contents.JsonFileContents;
import com.liumapp.solo.transporter.db.entity.B3SoloTagArticle;
import com.liumapp.solo.transporter.db.mapper.B3SoloTagArticleMapper;
import com.liumapp.solo.transporter.services.HandDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;

/**
 * file TagArticleHandler.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/3/21
 */
@Service
public class TagArticleHandler implements HandDataService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private JsonFileContents jsonFileContents;

    @Autowired
    private B3SoloTagArticleMapper mapper;

    @Override
    public void handle() {
        JSONArray tagArticles = jsonFileContents.getTagArticle();
        B3SoloTagArticle b3SoloTagArticle = new B3SoloTagArticle();
        for (Iterator iterator = tagArticles.iterator(); iterator.hasNext();) {
            JSONObject tagArticle = (JSONObject) iterator.next();
            b3SoloTagArticle.setOId(tagArticle.get("oId").toString());
            b3SoloTagArticle.setArticleOid(tagArticle.get("article_oId").toString());
            b3SoloTagArticle.setTagOid(tagArticle.get("tag_oId").toString());
            mapper.insert(b3SoloTagArticle);
        }
        logger.info("成功插入" + tagArticles.size() + "条标签与文章的关联数据");
    }

}
