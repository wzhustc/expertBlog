package cn.ustc.eb.po;

import java.util.Date;

public class APIComment {
    private Integer id;

    private Integer userId;

    private Date commentTime;

    private Integer apitextId;

    private String prepared;

    private String commentText;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public Integer getApitextId() {
        return apitextId;
    }

    public void setApitextId(Integer apitextId) {
        this.apitextId = apitextId;
    }

    public String getPrepared() {
        return prepared;
    }

    public void setPrepared(String prepared) {
        this.prepared = prepared == null ? null : prepared.trim();
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText == null ? null : commentText.trim();
    }
}