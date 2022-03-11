package com.ProxyTest;

/**
 * @author 孙珑瑜
 * @version 20220307
 */
public class Test {
    public static void main(String[] args) throws Exception {

        UserService userService = ProxyUtil.getProxy(new UserServiceImpl());
        System.out.println(userService.login("sly1","admin"));
        System.out.println(userService.deletedUser());
        userService.selectUser();

    }
}
