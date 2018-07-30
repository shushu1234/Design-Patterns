package com.liuyao;

/**
 * @author liuyao
 * @date 2018/07/30
 */

/**
 * Holder模式
 */
public class Person3 {
    private static class Person3Holder{
        private static final Person3 PERSON_3=new Person3();
        private Person3Holder(){}
    }

    private Person3(){}

    public static Person3 getPerson3(){
        return Person3Holder.PERSON_3;
    }
}
