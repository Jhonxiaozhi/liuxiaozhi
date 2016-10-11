package com.oneofive.api.ResponeseEntity;

/**
 * Created by 1509a on 2016/8/29.
 */
public class ProductsBean {
    private  String pname;
    private  String pdetials;
    private  String imgurl;
    private  String id;
    private  String updatedAt;
    private  String createdAt;

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPdetials() {
        return pdetials;
    }

    public void setPdetials(String pdetials) {
        this.pdetials = pdetials;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
