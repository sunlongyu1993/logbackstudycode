package com.JunitTest;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 孙珑瑜
 * @version 220303
 */
public class AnnotationTest1 {
    @Mytest
    public void test1(){
        System.out.println("===========Test1==============");
    }
    public void test2(){
        System.out.println("===========test2==============");
    }
    @Mytest
    public void test3(){
        System.out.println("===========Test3==============");
    }
    public static void main(String[] args) throws Exception {
        AnnotationTest1 annotationTest1 = new AnnotationTest1();//new一个对象
        Class<AnnotationTest1> c = AnnotationTest1.class;//获取类对象
        Method[] ms = c.getDeclaredMethods();//获取类中所有的方法
        //方法所有的方法，是否有注解Mytest
        for (Method m : ms) {
            if(m.isAnnotationPresent(Mytest.class)){//判断所有的方法是否有注解
            //执行有注解mytest的方法
                m.invoke(annotationTest1);//方法拿对象触发
            }
        }
    }
}
