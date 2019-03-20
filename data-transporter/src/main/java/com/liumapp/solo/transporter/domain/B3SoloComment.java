package com.liumapp.solo.transporter.domain;

public class B3SoloComment {
    private String oId;

    private Long commentCreated;

    private String commentName;

    private String commentOnId;

    private String commentOnType;

    private String commentSharpURL;

    private String commentURL;

    private String commentOriginalCommentId;

    private String commentOriginalCommentName;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId == null ? null : oId.trim();
    }

    public Long getCommentCreated() {
        return commentCreated;
    }

    public void setCommentCreated(Long commentCreated) {
        this.commentCreated = commentCreated;
    }

    public String getCommentName() {
        return commentName;
    }

    public void setCommentName(String commentName) {
        this.commentName = commentName == null ? null : commentName.trim();
    }

    public String getCommentOnId() {
        return commentOnId;
    }

    public void setCommentOnId(String commentOnId) {
        this.commentOnId = commentOnId == null ? null : commentOnId.trim();
    }

    public String getCommentOnType() {
        return commentOnType;
    }

    public void setCommentOnType(String commentOnType) {
        this.commentOnType = commentOnType == null ? null : commentOnType.trim();
    }

    public String getCommentSharpURL() {
        return commentSharpURL;
    }

    public void setCommentSharpURL(String commentSharpURL) {
        this.commentSharpURL = commentSharpURL == null ? null : commentSharpURL.trim();
    }

    public String getCommentURL() {
        return commentURL;
    }

    public void setCommentURL(String commentURL) {
        this.commentURL = commentURL == null ? null : commentURL.trim();
    }

    public String getCommentOriginalCommentId() {
        return commentOriginalCommentId;
    }

    public void setCommentOriginalCommentId(String commentOriginalCommentId) {
        this.commentOriginalCommentId = commentOriginalCommentId == null ? null : commentOriginalCommentId.trim();
    }

    public String getCommentOriginalCommentName() {
        return commentOriginalCommentName;
    }

    public void setCommentOriginalCommentName(String commentOriginalCommentName) {
        this.commentOriginalCommentName = commentOriginalCommentName == null ? null : commentOriginalCommentName.trim();
    }
}