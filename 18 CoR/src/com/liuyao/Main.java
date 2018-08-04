package com.liuyao;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CarHandler head=new CarHeadHandler();
        CarHandler body=new CarBodyHandler();
        CarHandler tail=new CarTailHandler();

        //设置顺序
        head.setNextHandler(body);
        body.setNextHandler(tail);

//        执行
        head.doSomething();
    }
}

//组装车头
//组装车身
//组装车尾
