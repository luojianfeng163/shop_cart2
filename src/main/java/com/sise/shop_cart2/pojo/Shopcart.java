package com.sise.shop_cart2.pojo;

public class Shopcart {
    private Integer id;

    private Integer itemid;

    private Integer num;

    private Integer userId;

    public Shopcart(Integer id, Integer itemid, Integer num, Integer userId) {
        this.id = id;
        this.itemid = itemid;
        this.num = num;
        this.userId = userId;
    }

    public Shopcart() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}