package com.liuyao;

public class Main {

    public static void main(String[] args) {
        Subject proxySubject=new ProxySubject();
        proxySubject.sellBook();
    }
}

//Discount
//Sell Book
//Give coupon