package com.liuyao.dynamic;

/**
 * @author liuyao
 * @date 2018/08/01
 */
public class DynamicMain {
    public static void main(String[] args) {
        RealSubject realSubject=new RealSubject();
        MyHandler myHandler=new MyHandler(realSubject);
        Subject proxySubject =myHandler.createProxySubject();
        proxySubject.sellBook();
    }
}
