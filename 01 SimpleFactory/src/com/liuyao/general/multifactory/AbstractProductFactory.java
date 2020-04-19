package com.liuyao.general.multifactory;

import com.liuyao.general.Product;

/**
 * 多工厂模式的抽象类
 *
 * @author liuyao 2020/4/19 16:48
 * @version 1.0
 */
public abstract class AbstractProductFactory {
    /**
     * 抽象工厂方法
     *
     * @return
     */
    public abstract Product createProduct();
}
