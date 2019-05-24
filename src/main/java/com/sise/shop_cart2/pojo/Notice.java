package com.sise.shop_cart2.pojo;

import java.util.Date;

public class Notice {
    private Integer id;

    private String title;

    private String context;

    private Date time;

    public Notice(Integer id, String title, String context, Date time) {
        this.id = id;
        this.title = title;
        this.context = context;
        this.time = time;
    }

    public Notice() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}