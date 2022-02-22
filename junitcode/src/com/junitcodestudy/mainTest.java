package com.junitcodestudy;

import org.junit.*;

/**
 * @author 孙珑瑜
 * @version 20220221
 * 测试类
 */
public class mainTest {
    @Before
    public void Before(){//每个方法前执行一次
        System.out.println("=========Before==========");
    }
    @After
    public void After(){//每个方法后执行一次
        System.out.println("=========After==========");
    }
    @BeforeClass
    public static void BeforeClass(){//一个类，前执行一次
        System.out.println("=========BeforeClass==========");
    }
    @AfterClass
    public static void AfterClass(){//一个类，后执行一次
        System.out.println("=========AfterClass==========");
    }

    @Test
   public void LoginTest(){
       UserService userService = new UserService();
        String re = userService.login("admin", "12345");
        Assert.assertEquals("登录业务异常","登录成功",re);
    }
    @Test
    public void SelectNameTest(){
        UserService userService = new UserService();
        userService.SelectName();
    }
}
