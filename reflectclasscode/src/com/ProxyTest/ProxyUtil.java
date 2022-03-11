package com.ProxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 孙珑瑜
 * @version 220307
 */
public class ProxyUtil {
    public static UserService getProxy(UserService obj) {

        return (UserService)Proxy.newProxyInstance(obj.getClass().getClassLoader(),//类加载器，负责加载代理类到内存中使用
                obj.getClass().getInterfaces(),//获取代理对象实现的全部接口，代理要为全部接口的全部方法进行代理
                new InvocationHandler() {//代理的核心处理逻辑
                    @Override
                    public Object invoke(Object proxy,
                                         Method method,
                                         Object[] args) throws Throwable {
                        //参数1：代理对象本身，一般不管
                        //参数2：正在被代理的方法
                        //参数3：被代理方法，应该传入的参数
                        long starttime = System.currentTimeMillis();
                        Object result = method.invoke(obj, args);//触发方法的真正执行
                        long endtime = System.currentTimeMillis();
                        System.out.println(method.getName()+"方法耗时："+(endtime-starttime)/1000.0 + "s");

                        return null;
                    }
                });
    }
}

