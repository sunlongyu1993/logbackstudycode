package com.reflectclass;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @author 孙珑瑜
 * @version 220222
 */
public class TestStudent1 {
    @Test//获取public 的构造器
    public void test1getConstructor(){
        Class c = Student.class;
        Constructor[] constructors = c.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName()+"====="+constructor.getParameterCount());
        }
    }
    @Test//获取全部（public + private）的构造器
    public void test1getDeclaredConstructor(){
        Class c = Student.class;
        Constructor[] constructors = c.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName()+"====="+constructor.getParameterCount());
        }

    }

}
