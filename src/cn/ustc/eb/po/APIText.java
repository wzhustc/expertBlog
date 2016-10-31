package cn.ustc.eb.po;

import java.util.Date;

public class APIText {
    private Integer id;

    private Integer pageView;

    private Date publishTime;

    private Date modifyTime;

    private String prepared;

    private String apitext;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPageView() {
        return pageView;
    }

    public void setPageView(Integer pageView) {
        this.pageView = pageView;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getPrepared() {
        return prepared;
    }

    public void setPrepared(String prepared) {
        this.prepared = prepared == null ? null : prepared.trim();
    }

    public String getApitext() {
        return apitext;
    }

    public void setApitext(String apitext) {
        this.apitext = apitext == null ? null : apitext.trim();
    }
}