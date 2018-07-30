package com.liuyao;

/**
 * @author liuyao
 * @date 2018/07/30
 */
public class Person1_1 {
    public static Person1_1 person1_1=null;

    private Person1_1(){}

    // 加锁在获得实例的方法外，并发性能差
    public synchronized static Person1_1 getPerson1(){
        if (person1_1 == null){
            person1_1 = new Person1_1();
        }
        return person1_1;
    }
}
