package com.liuyao.general;

/**
 * @author liuyao 2020/4/19 16:22
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        product.method1();
        product.method2();
    }
}
