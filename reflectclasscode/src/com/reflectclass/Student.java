package com.reflectclass;

/**
 * @author 孙珑瑜
 * @version 220223
 */
public class Student {
    private String name;
    private int age;

    private Student(String name) {
        System.out.println("1个私有参构造器");
        this.name =name;
    }
    public Student() {
        System.out.println("无参构造器");
    }

    public Student(String name, int age) {
        System.out.println("有参构造器");

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}