package cn.ustc.eb.po;

public class APIContent {
    private Integer id;

    private String contentName;

    private String contentUrl;

    private Integer apitextId;

    private Integer parentId;

    private Integer apicategoryId;

    private String prepared;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContentName() {
        return contentName;
    }

    public void setContentName(String contentName) {
        this.contentName = contentName == null ? null : contentName.trim();
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl == null ? null : contentUrl.trim();
    }

    public Integer getApitextId() {
        return apitextId;
    }

    public void setApitextId(Integer apitextId) {
        this.apitextId = apitextId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getApicategoryId() {
        return apicategoryId;
    }

    public void setApicategoryId(Integer apicategoryId) {
        this.apicategoryId = apicategoryId;
    }

    public String getPrepared() {
        return prepared;
    }

    public void setPrepared(String prepared) {
        this.prepared = prepared == null ? null : prepared.trim();
    }
}