package com.liumapp.solo.transporter.contents;

import com.alibaba.fastjson.JSONArray;
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

    private JSONArray article;

    private JSONArray archivedateArticle;

    private JSONArray comment;

    private JSONArray link;

    private JSONArray tag;

    private JSONArray tagArticle;

    public JsonFileContents() {
    }

    public JsonFileContents(JSONArray article, JSONArray archivedateArticle, JSONArray comment, JSONArray link, JSONArray tag, JSONArray tagArticle) {
        this.article = article;
        this.archivedateArticle = archivedateArticle;
        this.comment = comment;
        this.link = link;
        this.tag = tag;
        this.tagArticle = tagArticle;
    }

    public JSONArray getArticle() {
        return article;
    }

    public void setArticle(JSONArray article) {
        this.article = article;
    }

    public JSONArray getArchivedateArticle() {
        return archivedateArticle;
    }

    public void setArchivedateArticle(JSONArray archivedateArticle) {
        this.archivedateArticle = archivedateArticle;
    }

    public JSONArray getComment() {
        return comment;
    }

    public void setComment(JSONArray comment) {
        this.comment = comment;
    }

    public JSONArray getLink() {
        return link;
    }

    public void setLink(JSONArray link) {
        this.link = link;
    }

    public JSONArray getTag() {
        return tag;
    }

    public void setTag(JSONArray tag) {
        this.tag = tag;
    }

    public JSONArray getTagArticle() {
        return tagArticle;
    }

    public void setTagArticle(JSONArray tagArticle) {
        this.tagArticle = tagArticle;
    }
}
