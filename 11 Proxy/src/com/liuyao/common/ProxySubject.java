package com.liuyao.common;

/**
 * 普通代理
 *
 * @author liuyao
 * @date 2018/08/01
 */
public class ProxySubject implements Subject {
    private RealSubject realSubject;

    @Override
    public void sellBook() {
        // 前置处理
        disCount();
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.sellBook();
        // 后置处理
        giveCoupon();
    }

    public void disCount() {
        System.out.println("Discount");
    }

    public void giveCoupon() {
        System.out.println("Give coupon");
    }

}
