package com.liuyao.constraint;

/**
 * @author liuyao 2020/4/23 22:37
 * @version 1.0
 */
public class ProxySubject implements Subject{
    private Subject subject=null;
    public ProxySubject(Subject subject){
        this.subject=subject;
    }

    @Override
    public void sellBook() {
        this.subject.sellBook();
    }

    @Override
    public Subject getProxy() {
        return this;
    }
}
