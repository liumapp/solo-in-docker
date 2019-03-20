package com.liumapp.solo.transporter.domain;

public class B3SoloCommentWithBLOBs extends B3SoloComment {
    private String commentContent;

    private String commentThumbnailURL;

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public String getCommentThumbnailURL() {
        return commentThumbnailURL;
    }

    public void setCommentThumbnailURL(String commentThumbnailURL) {
        this.commentThumbnailURL = commentThumbnailURL == null ? null : commentThumbnailURL.trim();
    }
}