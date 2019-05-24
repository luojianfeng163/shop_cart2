package com.sise.shop_cart2.pojo;

public class Order {
    private Integer orderid;

    private Integer itemid;

    private Integer num;

    public Order(Integer orderid, Integer itemid, Integer num) {
        this.orderid = orderid;
        this.itemid = itemid;
        this.num = num;
    }

    public Order() {
        super();
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
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
}