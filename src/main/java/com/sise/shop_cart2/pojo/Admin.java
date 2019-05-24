package com.sise.shop_cart2.pojo;

public class Admin {
    private String user;

    private String password;

    public Admin(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public Admin() {
        super();
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}