package com.liuyao.general;

/**
 * @author liuyao 2020/4/19 21:14
 * @version 1.0
 */
public class ConcreteClass2 extends AbstractTemplate {
    @Override
    protected void doSomething() {
        System.out.println("class2 doSomething");
    }

    @Override
    protected void doAnything() {
        System.out.println("class2 doAnything");
    }
}
