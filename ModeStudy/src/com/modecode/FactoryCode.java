package com.modecode;

/**
 * @author 孙珑瑜
 * @version 20220323
 */
public class FactoryCode {
    public static Computer createComputer(String info){
        switch (info){
            case "Huawei":
                Computer c1 = new Hawei();
                c1.setName("Huawei");
                c1.setPrice(5000);
                return c1;
            case "Mac":
                Computer c2 = new Mac();
                c2.setName("Mac");
                c2.setPrice(10000);
                return c2;
            default:
                return null;
        }

    }
}
