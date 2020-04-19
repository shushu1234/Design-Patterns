package com.liuyao.general;

/**
 * 抽象产品类
 *
 * @author liuyao 2020/4/19 15:54
 * @version 1.0
 */
public abstract class Product {
    /**
     * 产品类的公共方法
     */
    public void method1() {
        System.out.println("method1");
        // 业务逻辑处理
    }

    /**
     * 抽象方法
     */
    public abstract void method2();
}
