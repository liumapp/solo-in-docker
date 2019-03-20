package com.liumapp.solo.transporter.domain;

public class B3SoloArchivedateArticle {
    private String oId;

    private String archiveDate_oId;

    private String article_oId;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId == null ? null : oId.trim();
    }

    public String getArchiveDate_oId() {
        return archiveDate_oId;
    }

    public void setArchiveDate_oId(String archiveDate_oId) {
        this.archiveDate_oId = archiveDate_oId == null ? null : archiveDate_oId.trim();
    }

    public String getArticle_oId() {
        return article_oId;
    }

    public void setArticle_oId(String article_oId) {
        this.article_oId = article_oId == null ? null : article_oId.trim();
    }
}