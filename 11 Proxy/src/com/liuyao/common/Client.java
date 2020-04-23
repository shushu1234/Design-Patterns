package com.liuyao.common;

public class Client {

    public static void main(String[] args) {
        // 普通代理，用户只知道代理类，不知道代理类背后的真实的类
        Subject proxySubject=new ProxySubject();
        proxySubject.sellBook();
    }
}

//Discount
//Sell Book
//Give coupon
