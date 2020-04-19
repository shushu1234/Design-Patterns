package com.liuyao.general;

/**
 * 抽象模板类
 * @author liuyao 2020/4/19 21:10
 * @version 1.0
 */
public abstract class AbstractTemplate {
    /**
     * 基本方法
     */
    protected abstract void doSomething();

    /**
     * 基本方法
     */
    protected abstract void doAnything();

    /**
     * 模板方法
     */
    final public void templateMethod(){
        // 调用基本方法，完成相关逻辑
        this.doSomething();
        this.doAnything();
    }
}
