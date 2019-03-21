package com.liumapp.solo.transporter.services.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.liumapp.solo.transporter.contents.JsonFileContents;
import com.liumapp.solo.transporter.db.entity.B3SoloArticle;
import com.liumapp.solo.transporter.db.mapper.B3SoloArticleMapper;
import com.liumapp.solo.transporter.services.HandDataService;
import org.springframework.beans.factory.annotation.Autowired;
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
        B3SoloArticle b3SoloArticle = new B3SoloArticle();
        for (Iterator iterator = articles.iterator(); iterator.hasNext();) {
            JSONObject article = (JSONObject) iterator.next();

            b3SoloArticle.setOId(article.get("oId").toString());//主键
            b3SoloArticle.setArticleTitle(article.get("articleTitle").toString());
            b3SoloArticle.setArticleAbstract(article.get("articleAbstract").toString());
            b3SoloArticle.setArticleAbstractText(article.get("articleAbstract").toString());//老版本对摘要并没有做markdown和纯文本的区分
            b3SoloArticle.setArticleTags(article.get("articleTags").toString());
            b3SoloArticle.setArticleAuthorId("1552984888476");
            b3SoloArticle.setArticleCommentCount(Integer.parseInt(article.get("articleCommentCount").toString()));
            b3SoloArticle.setArticleViewCount(Integer.parseInt(article.get("articleViewCount").toString()));
            b3SoloArticle.setArticleContent(article.get("articleContent").toString());
            b3SoloArticle.setArticlePermalink(article.get("articlePermalink").toString());
            b3SoloArticle.setArticlePutTop(article.get("articlePutTop").toString());
//            b3SoloArticle.setArticleCreated()
        }
    }

}
