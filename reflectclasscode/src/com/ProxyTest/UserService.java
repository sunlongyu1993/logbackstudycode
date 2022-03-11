package com.ProxyTest;

/**
 * @author 孙珑瑜
 * @version 20220304
 *
 */
public interface UserService{
    String login(String name,String pwd);
    void selectUser() throws InterruptedException;
    Boolean deletedUser() throws InterruptedException;
}
