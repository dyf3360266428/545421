package com.pojo;

/**
 * @author zjzhou
 * @version 1.0
 */

public class Content {
    private long contentId;
    private String contentName;
    private int contentHours;
    private int contentSid;
    private String picPath;

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public long getContentId() {
        return this.contentId;
    }

    public void setContentId(long contentId) {
        this.contentId = contentId;
    }

    public String getContentName() {
        return this.contentName;
    }

    public void setContentName(String contentName) {
        this.contentName = contentName;
    }

    public int getContentHours() {
        return contentHours;
    }

    public void setContentHours(int contentHours) {
        this.contentHours = contentHours;
    }

    public int getContentSid() {
        return contentSid;
    }

    public void setContentSid(int contentSid) {
        this.contentSid = contentSid;
    }

    @Override
    public String toString() {
        return "Content{" +
                "contentId=" + contentId +
                ", contentName='" + contentName + '\'' +
                ", contentNum=" + contentHours +
                ", contentDetail='" + contentSid + '\'' +
                '}';
    }
}