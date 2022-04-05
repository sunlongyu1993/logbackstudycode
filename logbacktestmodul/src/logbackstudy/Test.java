package logbackstudy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.applet.Main;

/**
 * @author 孙珑瑜
 */
public class Test {
    public static final Logger LOGGER = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        try {
            LOGGER.debug("main方法开始执行————————————————————————————————————");//打印日志
            LOGGER.info("开始执行第二行代码。。。。。");//打印日志
            int a =10;
            int b =0;
            LOGGER.trace("a="+ a);//打印日志
            LOGGER.trace("b="+ b);

            System.out.println(a/b);
        }
        catch (Exception e){
            e.printStackTrace();
            LOGGER.error("功能异常："+e);

        }

    }
}

//class test1{
//    private String name;
//    public static void main(String[] args) {
//        Test t = new Test();
//        t.name = "111";
//        updateTest(t);
//        System.out.println(t.name);
//
//        String str = new String("111");
//        updateStr(str);
//        System.out.println(str);
//
//        int a =  1;
//        updateInt(a);
//        System.out.println(a);
//    }
//    public static void updateInt(int a){
//        a = 10;
//    }
//
//    public static void updateStr(String str){
//        str = "666";
//    }
//
//    public static void updateTest(Test t){
//        t.name = "666";
//    }
//}

