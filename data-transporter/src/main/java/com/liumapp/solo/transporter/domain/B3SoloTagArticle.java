package com.liumapp.solo.transporter.domain;

public class B3SoloTagArticle {
    private String oId;

    private String article_oId;

    private String tag_oId;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId == null ? null : oId.trim();
    }

    public String getArticle_oId() {
        return article_oId;
    }

    public void setArticle_oId(String article_oId) {
        this.article_oId = article_oId == null ? null : article_oId.trim();
    }

    public String getTag_oId() {
        return tag_oId;
    }

    public void setTag_oId(String tag_oId) {
        this.tag_oId = tag_oId == null ? null : tag_oId.trim();
    }
}