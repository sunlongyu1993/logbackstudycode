package com.movie.bean;

import java.util.Date;

/**
 * @author 孙珑瑜
 * @version 20220325
 * 电影对象
 */
public class Movie {
    private String name;
    private String actor;//主演
    private double time;//片长
    private double price;//票价
    private double score;//评分
    private Date starttime;//开始播放时间
    private int number;//余票

    public Movie() {
    }

    public Movie(String name, String actor, double time, double price, double score, Date starttime, int number) {
        this.name = name;
        this.actor = actor;
        this.time = time;
        this.price = price;
        this.score = score;
        this.starttime = starttime;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", actor='" + actor + '\'' +
                ", time=" + time +
                ", price=" + price +
                ", score=" + score +
                ", starttime=" + starttime +
                ", number=" + number +
                '}';
    }
}
