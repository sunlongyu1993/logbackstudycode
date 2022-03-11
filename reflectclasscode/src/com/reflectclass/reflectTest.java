package com.reflectclass;

/**
 * @author 孙珑瑜
 * @version 20220301
 */
public class reflectTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("sly1");
        s.setAge(18);
        reflectUtil.save(s);

        Teacher t = new Teacher();
        t.setName("slyt");
        t.setSalay(1800);
        t.setSex('女');
    }
}
