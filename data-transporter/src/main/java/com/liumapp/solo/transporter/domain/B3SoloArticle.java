package com.liumapp.solo.transporter.domain;

import java.util.Date;

public class B3SoloArticle {
    private String oId;

    private String articleTitle;

    private String articleAuthorEmail;

    private Integer articleCommentCount;

    private Integer articleViewCount;

    private String articlePermalink;

    private String articleHadBeenPublished;

    private String articleIsPublished;

    private String articlePutTop;

    private Date articleCreateDate;

    private Date articleUpdateDate;

    private Double articleRandomDouble;

    private String articleSignId;

    private String articleCommentable;

    private String articleViewPwd;

    private String articleEditorType;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId == null ? null : oId.trim();
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public String getArticleAuthorEmail() {
        return articleAuthorEmail;
    }

    public void setArticleAuthorEmail(String articleAuthorEmail) {
        this.articleAuthorEmail = articleAuthorEmail == null ? null : articleAuthorEmail.trim();
    }

    public Integer getArticleCommentCount() {
        return articleCommentCount;
    }

    public void setArticleCommentCount(Integer articleCommentCount) {
        this.articleCommentCount = articleCommentCount;
    }

    public Integer getArticleViewCount() {
        return articleViewCount;
    }

    public void setArticleViewCount(Integer articleViewCount) {
        this.articleViewCount = articleViewCount;
    }

    public String getArticlePermalink() {
        return articlePermalink;
    }

    public void setArticlePermalink(String articlePermalink) {
        this.articlePermalink = articlePermalink == null ? null : articlePermalink.trim();
    }

    public String getArticleHadBeenPublished() {
        return articleHadBeenPublished;
    }

    public void setArticleHadBeenPublished(String articleHadBeenPublished) {
        this.articleHadBeenPublished = articleHadBeenPublished == null ? null : articleHadBeenPublished.trim();
    }

    public String getArticleIsPublished() {
        return articleIsPublished;
    }

    public void setArticleIsPublished(String articleIsPublished) {
        this.articleIsPublished = articleIsPublished == null ? null : articleIsPublished.trim();
    }

    public String getArticlePutTop() {
        return articlePutTop;
    }

    public void setArticlePutTop(String articlePutTop) {
        this.articlePutTop = articlePutTop == null ? null : articlePutTop.trim();
    }

    public Date getArticleCreateDate() {
        return articleCreateDate;
    }

    public void setArticleCreateDate(Date articleCreateDate) {
        this.articleCreateDate = articleCreateDate;
    }

    public Date getArticleUpdateDate() {
        return articleUpdateDate;
    }

    public void setArticleUpdateDate(Date articleUpdateDate) {
        this.articleUpdateDate = articleUpdateDate;
    }

    public Double getArticleRandomDouble() {
        return articleRandomDouble;
    }

    public void setArticleRandomDouble(Double articleRandomDouble) {
        this.articleRandomDouble = articleRandomDouble;
    }

    public String getArticleSignId() {
        return articleSignId;
    }

    public void setArticleSignId(String articleSignId) {
        this.articleSignId = articleSignId == null ? null : articleSignId.trim();
    }

    public String getArticleCommentable() {
        return articleCommentable;
    }

    public void setArticleCommentable(String articleCommentable) {
        this.articleCommentable = articleCommentable == null ? null : articleCommentable.trim();
    }

    public String getArticleViewPwd() {
        return articleViewPwd;
    }

    public void setArticleViewPwd(String articleViewPwd) {
        this.articleViewPwd = articleViewPwd == null ? null : articleViewPwd.trim();
    }

    public String getArticleEditorType() {
        return articleEditorType;
    }

    public void setArticleEditorType(String articleEditorType) {
        this.articleEditorType = articleEditorType == null ? null : articleEditorType.trim();
    }
}