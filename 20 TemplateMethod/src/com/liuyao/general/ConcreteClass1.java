package com.liuyao.general;

/**
 * 具体模板类
 * @author liuyao 2020/4/19 21:14
 * @version 1.0
 */
public class ConcreteClass1 extends AbstractTemplate {
    @Override
    protected void doSomething() {
        System.out.println("class1 doSomething");
    }

    @Override
    protected void doAnything() {
        System.out.println("class1 doAnything");
    }
}
