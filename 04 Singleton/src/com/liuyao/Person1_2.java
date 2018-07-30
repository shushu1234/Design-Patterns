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
public class Person1_2 {
    public static Person1_2 person1_2 =null;

    private Person1_2(){}

    public static Person1_2 getPerson1_2(){
        if (person1_2 == null){
            synchronized (Person1_2.class){
                if (person1_2 == null){
                    person1_2 = new Person1_2();
                }
            }
        }
        return person1_2;
    }
}
