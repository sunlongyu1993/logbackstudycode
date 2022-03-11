package com.ProxyTest;

/**
 * @author 孙珑瑜
 * @version 20220304
 * 接口的实现类
 */
public class UserServiceImpl implements UserService{
    @Override
    public String login(String name, String pwd) {
//        long starttime = System.currentTimeMillis();
//        try {
//            Thread.sleep(1000);
//            if("admin".equals(name) && "12345".equals(pwd)){
//                return "success";
//            }
//            return "用户名或者密码异常";
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//            return "系统异常";
//        }
//        finally {
//            long endtime = System.currentTimeMillis();
//            System.out.println("login方法耗时："+(endtime-starttime)/1000.0 + "s");
//        }
//    }


        try {
            Thread.sleep(1000);
            if("admin".equals(name) && "12345".equals(pwd)){
                return "success";
            }
            return "用户名或者密码异常";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }

    }

    @Override
    public void selectUser() {
//        long starttime = System.currentTimeMillis();
//        try {
//            Thread.sleep(1000);
//            System.out.println("查询100个用户");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        finally {
//            long endtime = System.currentTimeMillis();
//            System.out.println("selectUser方法耗时："+(endtime-starttime)/1000.0 + "s");
//        }
//    }

        try {
            Thread.sleep(1000);
            System.out.println("查询100个用户");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Boolean deletedUser()  {
//        long starttime = System.currentTimeMillis();
//        try {
//            Thread.sleep(1000);
//            System.out.println("查询100个用户");
//            return true;
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//            return false;
//        }
//        finally {
//            long endtime = System.currentTimeMillis();
//            System.out.println("deletedUser方法耗时："+(endtime-starttime)/1000.0 + "s");
//        }


        try {
            Thread.sleep(1000);
            System.out.println("查询100个用户");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
