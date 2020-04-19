package com.liuyao.general;

/**
 * 抽象产品类 A
 *
 * @author liuyao 2020/4/19 19:01
 * @version 1.0
 */
public abstract class AbstractProductA {
    /**
     * 每个产品共有的方法
     */
    public void shareMethod() {
        System.out.println("productA share method");
    }

    public abstract void doSomething();
}
