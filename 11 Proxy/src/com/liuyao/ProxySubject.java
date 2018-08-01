package com.liuyao;

/**
 * @author liuyao
 * @date 2018/08/01
 */
public class ProxySubject implements Subject {
    private RealSubject realSubject;

    @Override
    public void sellBook() {
        disCount();
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.sellBook();
        giveCoupon();
    }

    public void disCount() {
        System.out.println("Discount");
    }

    public void giveCoupon() {
        System.out.println("Give coupon");
    }

}
