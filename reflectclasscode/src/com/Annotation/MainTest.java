package com.Annotation;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author 孙珑瑜
 * @version 20220301
 *
 */
public class MainTest {
    @Test
    public void test1(){
      Class c =  BookStore.class;//1、得到类对象
      if (c.isAnnotationPresent(BookAnnotation.class)){//判断C这个类上是否有BookAnnotation这个注解；
          //获取该类的注解对象
          BookAnnotation book = (BookAnnotation) c.getDeclaredAnnotation(BookAnnotation.class);
          System.out.println(book.value());
          System.out.println(book.price());
          System.out.println(Arrays.toString(book.author()));
      }
    }
    @Test
    public void test2(){
        try {
            Class<BookStore> c = BookStore.class;
            Method b = c.getDeclaredMethod("bookmethod");//方法名称
            if(b.isAnnotationPresent(BookAnnotation.class)){//判断注解b中是否存在BookAnnotation的注解
                BookAnnotation d = b.getDeclaredAnnotation(BookAnnotation.class);
                System.out.println(d.value());
                System.out.println(d.price());
                System.out.println(Arrays.toString(d.author()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
