package com.liuyao;

/**
 * @author liuyao
 * @date 2018/07/30
 */

/**
 * 饱汉模式
 * 优点：懒加载，节约资源
 * 缺点：线程不安全
 */
public class Person1 {
    public static Person1 person1=null;

    private Person1(){}

    public static Person1 getPerson1(){
        if (person1 == null){
            person1 = new Person1();
        }
        return person1;
    }
}
