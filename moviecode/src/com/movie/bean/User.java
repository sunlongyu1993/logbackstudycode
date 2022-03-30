package com.movie.bean;

/**
 * @author 孙珑瑜
 * @version 20220325
 * 定义父类
 */
public class User {
    private String loginname;//登录名
    private String username;//用户名字真名
    private String pwd;//登录密码
    private char sex;//性别
    private String phone;//电话
    private double money;//账户金额

    public User() {
    }

    public User(String loginname, String username, String pwd, char sex, String phone, double money) {
        this.loginname = loginname;
        this.username = username;
        this.pwd = pwd;
        this.sex = sex;
        this.phone = phone;
        this.money = money;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
