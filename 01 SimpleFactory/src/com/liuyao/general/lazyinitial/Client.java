package com.liuyao.general.lazyinitial;

import com.liuyao.general.Product;

/**
 * @author liuyao 2020/4/19 17:23
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Product product1 = ProductFactory.createProduct("Product1");
        product1.method1();
        product1.method2();
    }
}
