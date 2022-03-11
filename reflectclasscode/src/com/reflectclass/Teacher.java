package com.reflectclass;

/**
 * @author 孙珑瑜
 * @version 20220301
 */
public class Teacher {
    private String name;
    private char sex;
    private double salay;

    public Teacher() {
    }

    public Teacher(String name, char sex, double salay) {
        this.name = name;
        this.sex = sex;
        this.salay = salay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getSalay() {
        return salay;
    }

    public void setSalay(double salay) {
        this.salay = salay;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", salay=" + salay +
                '}';
    }
}
