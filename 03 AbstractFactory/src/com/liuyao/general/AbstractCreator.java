package com.liuyao.general;

/**
 * @author liuyao 2020/4/19 19:05
 * @version 1.0
 */
public abstract class AbstractCreator {
    /**
     * 创建 A 产品家族
     *
     * @return
     */
    public abstract AbstractProductA createProductA();

    /**
     * 闯进 B 产品家族
     *
     * @return
     */
    public abstract AbstractProductB createProductB();
}
