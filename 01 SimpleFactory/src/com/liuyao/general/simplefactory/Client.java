package com.liuyao.general.simplefactory;

import com.liuyao.general.ConcreteProduct1;

/**
 * @author liuyao 2020/4/19 16:40
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        final ConcreteProduct1 product = ProductFactory.createProduct(ConcreteProduct1.class);
        product.method1();
        product.method2();
    }
}
