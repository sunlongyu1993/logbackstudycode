package com.reflectclass;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

/**
 * @author 孙珑瑜
 * @version 220225
 * 反射的应用，通用框架
 */
public class reflectUtil {
    public static void save(Object obj){
        try(PrintStream ps = new PrintStream(new FileOutputStream("D:///code/slycode/logbackcode/reflectclasscode/src/data.txt",true))) {
        Class<?> c = obj.getClass();//获取权限名：包名+类名
            ps.println("=================="+ c.getSimpleName()+"=====================");//获取当前类名
        Field[] declaredFields = c.getDeclaredFields();//提取对象的全部成员变量
        for (Field declaredField : declaredFields) {
            String name = declaredField.getName();//获取成员变量信息-名字
            declaredField.setAccessible(true);//暴力获取成员变量的权限，可以获取私有成员变量
                String value = declaredField.get(obj)+"";//获取成员变量的值
            ps.println(name+"="+value);
            }
        }
        catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
