package com.liumapp.solo.transporter.services.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.liumapp.solo.transporter.contents.JsonFileContents;
import com.liumapp.solo.transporter.domain.B3SoloArticle;
import com.liumapp.solo.transporter.domain.B3SoloArticleExample;
import com.liumapp.solo.transporter.domain.B3SoloArticleWithBLOBs;
import com.liumapp.solo.transporter.mapper.B3SoloArticleMapper;
import com.liumapp.solo.transporter.services.HandDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Iterator;

/**
 * file ArticleService.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/3/21
 */
@Service
public class ArticleHandler implements HandDataService {

    @Autowired
    private JsonFileContents jsonFileContents;

    @Autowired
    private B3SoloArticleMapper b3SoloArticleMapper;

    @Override
    public void handle() {
        JSONArray articles = jsonFileContents.getArticle();
        B3SoloArticleWithBLOBs b3SoloArticle = new B3SoloArticleWithBLOBs();
        for (Iterator iterator = articles.iterator(); iterator.hasNext();) {
            JSONObject article = (JSONObject) iterator.next();
            b3SoloArticle.setoId(article.get("oId").toString());//主键
            b3SoloArticle.setArticleTitle(article.get("articleTitle").toString());//文章标题
            b3SoloArticle.setArticleAbstract(article.get("articleAbstract").toString());//文章摘要
//            b3SoloArticle.setarticleabs
        }
    }


}
