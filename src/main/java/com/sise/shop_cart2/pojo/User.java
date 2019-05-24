package com.sise.shop_cart2.pojo;

public class User {
    private Integer id;

    private String user;

    private String password;

    private String email;

    private  String  name;

    private String gender;

    public User(Integer id, String user, String password) {
        this.id = id;
        this.user = user;
        this.password = password;
    }

    public User(Integer id, String user, String password, String email, String name, String gender) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.email = email;
        this.name = name;
        this.gender = gender;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}