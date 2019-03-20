package com.liumapp.solo.transporter.domain;

public class B3SoloTag {
    private String oId;

    private Integer tagPublishedRefCount;

    private Integer tagReferenceCount;

    private String tagTitle;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId == null ? null : oId.trim();
    }

    public Integer getTagPublishedRefCount() {
        return tagPublishedRefCount;
    }

    public void setTagPublishedRefCount(Integer tagPublishedRefCount) {
        this.tagPublishedRefCount = tagPublishedRefCount;
    }

    public Integer getTagReferenceCount() {
        return tagReferenceCount;
    }

    public void setTagReferenceCount(Integer tagReferenceCount) {
        this.tagReferenceCount = tagReferenceCount;
    }

    public String getTagTitle() {
        return tagTitle;
    }

    public void setTagTitle(String tagTitle) {
        this.tagTitle = tagTitle == null ? null : tagTitle.trim();
    }
}