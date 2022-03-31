package com.movie.run;

import com.movie.bean.Business;
import com.movie.bean.Customer;
import com.movie.bean.Movie;
import com.movie.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author 孙珑瑜
 * @version 20220325
 * 启动类
 */
public class MovieSystem {
    /**
     * 定义系统的数据容器用户存储数据
     * 1、存储很多用户，商家，客户
     */
    public static final List<User> All_USERS = new ArrayList<>();
    /**
     * 2、存储系统全部商家和拍片信息
     * 商家1=【p1,p2,p3】
     */
    public static final Map<Business, List<Movie>> ALL_Movies = new HashMap<>();
    /**
     * 定义静态的系统扫描器,公共的方法
     */
    public static final Scanner SYS_SC = new Scanner(System.in);
    public static User LoginName;//当前系统唯一的登录用户

    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//时间格式化
    public static final Logger LOGGER = LoggerFactory.getLogger("MovieSystem.class"); //引入日志

    /**
     * 准备测试数据
     * @param args
     */
    static {
        //顾客
        Customer customer1 = new Customer();
        customer1.setLoginname("sly1");
        customer1.setUsername("孙1");
        customer1.setUsername("孙1");
        customer1.setMoney(99);
        customer1.setPwd("123456");
        customer1.setPhone("18810671111");
        customer1.setSex('女');
        All_USERS.add(customer1);

        Customer customer2 = new Customer();
        customer2.setLoginname("sly2");
        customer2.setUsername("孙2");
        customer2.setMoney(88);
        customer2.setPwd("123456");
        customer2.setPhone("18810672222");
        customer1.setSex('男');
        All_USERS.add(customer2);
        //商家
        Business business1 = new Business();
        business1.setLoginname("商家登录名1");
        business1.setUsername("商家用户名1");
        business1.setPwd("123456");
        business1.setPhone("18810673333");
        business1.setSex('女');
        business1.setAddress("北京市朝阳区高家园1");
        business1.setShopName("商家店铺1");
        business1.setMoney(1000);
        List<Movie> movie1 = new ArrayList<>();
        ALL_Movies.put(business1, movie1);

        Business business2 = new Business();
        business2.setLoginname("商家登录名1");
        business2.setUsername("商家用户名1");
        business2.setPwd("123456");
        business2.setPhone("18810673333");
        business2.setSex('女');
        business2.setAddress("北京市朝阳区高家园1");
        business2.setShopName("商家店铺1");
        business2.setMoney(1000);
        List<Movie> movie2 = new ArrayList<>();
        ALL_Movies.put(business2, movie2);

    }





    /**
     * 首页
     * @param args
     */
    public static void main(String[] args) {
        ShowMain();
    }
    /**
     * 登录首页展示
     */
    private static void ShowMain() {
        while (true){
            System.out.println("============电影平台首页===============");
            System.out.println("1、登录");
            System.out.println("2、用户注册");
            System.out.println("3、商家注册");
            System.out.println("4、请输入命令");
            String command = SYS_SC.nextLine();
            switch (command){
                case "1":
                    login();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("输入的命令有误，请重新输入");
            }
        }
    }
    /**
     * 登录功能
     */
    private static void login() {
        while (true){
            System.out.println("请输入登录的用户名");
            String loginname = SYS_SC.nextLine();
            System.out.println("请输入密码");
            String pwd = SYS_SC.nextLine();
            //根据登录名字查询用户对象
            User user = getUserByLoginName(loginname);
            //判断用户是否存在，存在说明登录名错误
            if(user != null){
                System.out.println("用户存在");
                //判断密码是否正确
                if(user.getPwd().equals(pwd)){
                    //登录成功----TODO
                    LoginName=user;//把user赋值给全量的用户
                    LOGGER.info(user.getUsername()+"用户登录了系统——日志打印");
                    //判断用户登录或者商家登录
                    if(user instanceof Customer){
                        System.out.println("普通客户登录成功");
                        showCustomerMainPage();
                    }
                    else {
                        System.out.println("商家登录成功");
                        showBusinessMainPage();
                    }
                    return;
                }
                else {
                    System.out.println("用户名密码错误，请确认");
                }
            }else {
                System.out.println("登录名错误或者不存在，请确认");
            }
        }
    }
    //普通客户首页
    private static void showCustomerMainPage() {
        System.out.println("==================黑马程序员用户首页======================");
        System.out.println(LoginName.getUsername()+(LoginName.getSex() == '男'?"先生":"女士"+"欢迎您进入客户首页"));
        System.out.println("请你选择要操作的功能");
        System.out.println("1、展示全部影片信息");
        System.out.println("2、根据电影名称查询电影信息");
        System.out.println("3、评分功能");
        System.out.println("4、购票功能");
        System.out.println("5、退出系统");
        while (true){
            System.out.println("请输入你要操作的命令");
            String command = SYS_SC.nextLine();
            switch (command){
                case "1": break;
                case "2": break;
                case "3": break;
                case "4": break;
                case "5": break;//退出系统
                default:
                    System.out.println("输入的命令有误，请重新输入");
                    break;
            }
        }
    }
    //商家首页
    private static void showBusinessMainPage() {
        System.out.println("==================商家首页======================");
        System.out.println(LoginName.getUsername()+(LoginName.getSex() == '男'?"先生":"女士"+"欢迎您进入商家首页"));
        System.out.println("请你选择要操作的功能");
        System.out.println("1、展示详情");
        System.out.println("2、上架电影");
        System.out.println("3、下架电影");
        System.out.println("4、修改电影");
        System.out.println("5、退出");
        while (true){
            System.out.println("请输入你要操作的命令");
            String command = SYS_SC.nextLine();
            switch (command){
                case "1":
                    showBusinessInfo();
                    break;
                case "2": break;
                case "3": break;
                case "4": break;
                case "5": break;//退出系统
                default:
                    System.out.println("输入的命令有误，请重新输入");
                    break;
            }
        }
    }

    //根据登录名字查询用户对象
    public static User getUserByLoginName(String loginname){
        for (User user : All_USERS) {
            //查询此用户是否在数据库中
            if(user.getLoginname().equals(loginname)){
                return user;
            }
        }
        return null;
    }

    /**
     * 当前商家的详细信息以及排片信息
     */
    private static void showBusinessInfo() {
        LOGGER.info(LoginName.getUsername()+"商家，可以看自己的排片情况——日志打印");
        
    }

}
