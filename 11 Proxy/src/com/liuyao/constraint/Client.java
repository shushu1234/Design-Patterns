package com.liuyao.constraint;

/**
 * 强制代理场景类
 * @author liuyao 2020/4/23 22:41
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Subject subject=new RealSubject("real");
        subject.sellBook();

        Subject subjectProxy = subject.getProxy();
        subjectProxy.sellBook();
    }

}
