package com.liuyao.general.replacesingleton;

/**
 * @author liuyao 2020/4/19 16:54
 * @version 1.0
 */
public class Singleton {
    /**
     * 不允许通过 new 产生一个对象
     */
    private Singleton() {

    }

    public void doSomething() {
        // 业务处理
        System.out.println("do some thing");
    }
}
