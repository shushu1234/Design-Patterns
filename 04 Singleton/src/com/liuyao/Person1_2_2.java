package com.liuyao;

/**
 * @author liuyao
 * @date 2018/07/30
 */


public class Person1_2_2 {
    public static volatile Person1_2_2 person1_2 =null;

    private Person1_2_2(){}

    public static Person1_2_2 getPerson1_2(){
        if (person1_2 == null){
            synchronized (Person1_2_2.class){
                if (person1_2 == null){
                    person1_2 = new Person1_2_2();
                }
            }
        }
        return person1_2;
    }
}
