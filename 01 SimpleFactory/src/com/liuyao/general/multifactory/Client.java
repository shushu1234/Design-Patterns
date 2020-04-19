package com.liuyao.general.multifactory;

import com.liuyao.general.ConcreteProduct1;

/**
 * @author liuyao 2020/4/19 16:51
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        ConcreteProduct1 concreteProduct1 = (ConcreteProduct1) new ConcreteProduct1Factory().createProduct();
        concreteProduct1.method1();
        concreteProduct1.method2();
    }
}
