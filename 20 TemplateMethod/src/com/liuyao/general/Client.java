package com.liuyao.general;

/**
 * @author liuyao 2020/4/19 21:15
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        ConcreteClass1 class1 = new ConcreteClass1();
        ConcreteClass2 class2 = new ConcreteClass2();
        class1.templateMethod();
        class2.templateMethod();
    }
}
