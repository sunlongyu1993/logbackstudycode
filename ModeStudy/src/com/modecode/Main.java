package com.modecode;

/**
 * @author 孙珑瑜
 * @version 20220323
 */
public class Main {
    public static void main(String[] args) {
        Computer c = FactoryCode.createComputer("Huawei");
        System.out.println(c.getName());
        System.out.println(c.getPrice());
        c.start();
    }
}
