package com.liuyao.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author liuyao
 * @date 2018/08/01
 */
public class MyHandler implements InvocationHandler {
    private RealSubject realSubject;

    public MyHandler(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    public Subject createProxySubject(){
        return (Subject) Proxy.newProxyInstance(this.getClass().getClassLoader(),realSubject.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res = null;
        if (method.getName().equals("sellBook")){
            disCount();
            res=method.invoke(realSubject,args);
            giveCoupon();
        }
        return res;
    }

    public void disCount() {
        System.out.println("Discount");
    }

    public void giveCoupon() {
        System.out.println("Give coupon");
    }

}
