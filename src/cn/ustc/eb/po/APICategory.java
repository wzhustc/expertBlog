package cn.ustc.eb.po;

public class APICategory {
    private Integer id;

    private String name;

    private String prepared;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPrepared() {
        return prepared;
    }

    public void setPrepared(String prepared) {
        this.prepared = prepared == null ? null : prepared.trim();
    }
}