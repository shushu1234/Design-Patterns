package com.liuyao;

/**
 * @author liuyao
 * @date 2018/07/30
 */

/**
 * 饿汉模式
 * 优点：线程安全，使用没有延迟
 * 缺点：可能造成资源浪费
 */
public class Person2 {
    public static final Person2 person2=new Person2();

    private Person2(){}

    public static Person2 getPerson2(){
        return person2;
    }
}
