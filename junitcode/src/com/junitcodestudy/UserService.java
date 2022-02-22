package com.junitcodestudy;

/**
 * @author 孙珑瑜
 * @version 20220221
 */
public class UserService {
    public String login(String username,String pwd){
        if("admin".equals(username) && "12345".equals(pwd)){
            return "登录成功";
        }
        else {
            return "用户名或者密码错误";
        }
    }
    public void SelectName(){
        System.out.println(10/2);
        System.out.println("查询全部用户名成功");
    }
}
