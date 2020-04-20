package com.liuyao.general;

/**
 * @author liuyao 2020/4/20 23:46
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        Product aProduct = director.getAProduct(new ConcreteProductBuilder());
        aProduct.doSomething();
    }
}
