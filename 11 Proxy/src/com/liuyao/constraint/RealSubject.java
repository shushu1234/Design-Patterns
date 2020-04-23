package com.liuyao.constraint;

/**
 * @author liuyao 2020/4/23 22:34
 * @version 1.0
 */
public class RealSubject implements Subject{
    private String name = "";

    private Subject proxy = null;

    public RealSubject (String _name){
        this.name = name;
    }

    @Override
    public Subject getProxy(){
        this.proxy=new ProxySubject(this);
        return this.proxy;
    }

    @Override
    public void sellBook() {
        if (isProxy()){
            System.out.println("proxy sell book");
        }else {
            System.out.println("please use proxy");
        }
    }


    public boolean isProxy(){
        return this.proxy != null;
    }
}
