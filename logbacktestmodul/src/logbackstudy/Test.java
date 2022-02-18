package logbackstudy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

