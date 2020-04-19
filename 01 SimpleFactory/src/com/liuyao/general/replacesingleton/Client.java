package com.liuyao.general.replacesingleton;

import com.liuyao.general.ConcreteProduct1;
import com.liuyao.general.Product;

/**
 * @author liuyao 2020/4/19 17:00
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // Singleton singleton = SingletonFactory.getSingleton();
        // singleton.doSomething();

        Singleton singleton1 = SingletonFactory2.createSingleton(Singleton.class);
        System.out.println(singleton1);
        Singleton singleton2 = SingletonFactory2.createSingleton(Singleton.class);
        System.out.println(singleton2);

        Singleton2 product1 = SingletonFactory2.createSingleton(Singleton2.class);
        System.out.println(product1);
        Singleton2 product2 = SingletonFactory2.createSingleton(Singleton2.class);
        System.out.println(product2);
    }
}
