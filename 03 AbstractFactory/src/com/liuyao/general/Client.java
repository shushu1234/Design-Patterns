package com.liuyao.general;

/**
 * @author liuyao 2020/4/19 19:09
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        AbstractCreator creator = new Creator1();
        CreateProduct(creator);
        creator = new Creator2();
        CreateProduct(creator);
    }

    private static void CreateProduct(AbstractCreator abstractCreator) {
        AbstractProductA productA = abstractCreator.createProductA();
        AbstractProductB productB = abstractCreator.createProductB();
        productA.doSomething();
        productB.doSomething();
    }
}
