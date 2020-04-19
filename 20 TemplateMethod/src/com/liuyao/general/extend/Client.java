package com.liuyao.general.extend;

/**
 * @author liuyao 2020/4/19 21:29
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        ExtendClass1 class1=new ExtendClass1();
        class1.setRunFlag(true);
        class1.templateMethod();
        ExtendClass2 class2=new ExtendClass2();
        class2.setRunFlag(false);
        class2.templateMethod();
    }
}
