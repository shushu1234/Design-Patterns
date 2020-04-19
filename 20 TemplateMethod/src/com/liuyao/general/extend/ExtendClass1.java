package com.liuyao.general.extend;

/**
 * @author liuyao 2020/4/19 21:24
 * @version 1.0
 */
public class ExtendClass1 extends AbstractTemplateExtend {
    @Override
    protected void doSomething() {
        System.out.println("extend class1 doSomething");
    }

    @Override
    protected void doAnything() {
        System.out.println("extend class1 doAnything");
    }

}
