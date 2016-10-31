package cn.ustc.eb.po;

import java.util.Date;

public class Sponsor {
    private Integer id;

    private String name;

    private String email;

    private Long sposonrMoney;

    private Date sposonrTime;

    private String sposonrWay;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Long getSposonrMoney() {
        return sposonrMoney;
    }

    public void setSposonrMoney(Long sposonrMoney) {
        this.sposonrMoney = sposonrMoney;
    }

    public Date getSposonrTime() {
        return sposonrTime;
    }

    public void setSposonrTime(Date sposonrTime) {
        this.sposonrTime = sposonrTime;
    }

    public String getSposonrWay() {
        return sposonrWay;
    }

    public void setSposonrWay(String sposonrWay) {
        this.sposonrWay = sposonrWay == null ? null : sposonrWay.trim();
    }

    public String getPrepared() {
        return prepared;
    }

    public void setPrepared(String prepared) {
        this.prepared = prepared == null ? null : prepared.trim();
    }
}