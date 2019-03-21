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

    private JSONObject article;

    private JSONObject archivedateArticle;

    private JSONObject comment;

    private JSONObject link;

    private JSONObject tag;

    private JSONObject tagArticle;

    public JsonFileContents() {
    }

    public JsonFileContents(JSONObject article, JSONObject archivedateArticle, JSONObject comment, JSONObject link, JSONObject tag, JSONObject tagArticle) {
        this.article = article;
        this.archivedateArticle = archivedateArticle;
        this.comment = comment;
        this.link = link;
        this.tag = tag;
        this.tagArticle = tagArticle;
    }

    public JSONObject getArticle() {
        return article;
    }

    public void setArticle(JSONObject article) {
        this.article = article;
    }

    public JSONObject getArchivedateArticle() {
        return archivedateArticle;
    }

    public void setArchivedateArticle(JSONObject archivedateArticle) {
        this.archivedateArticle = archivedateArticle;
    }

    public JSONObject getComment() {
        return comment;
    }

    public void setComment(JSONObject comment) {
        this.comment = comment;
    }

    public JSONObject getLink() {
        return link;
    }

    public void setLink(JSONObject link) {
        this.link = link;
    }

    public JSONObject getTag() {
        return tag;
    }

    public void setTag(JSONObject tag) {
        this.tag = tag;
    }

    public JSONObject getTagArticle() {
        return tagArticle;
    }

    public void setTagArticle(JSONObject tagArticle) {
        this.tagArticle = tagArticle;
    }
}
