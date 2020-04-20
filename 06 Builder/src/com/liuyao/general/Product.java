package com.liuyao.general;

/**
 * 产品类
 *
 * @author liuyao 2020/4/19 22:03
 * @version 1.0
 */
public class Product {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void doSomething() {
        System.out.println(name + " do some thing");
    }
}
