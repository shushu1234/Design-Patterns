package com.liuyao;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        List<String> friends=new ArrayList<>();
        friends.add("aaa");
        friends.add("bbb");
        friends.add("ccc");
        Person person=new Person(10,"zhangsan",friends);
        System.out.println("person " + person);

        System.out.println("=== 克隆完 ===");
        Person shallowPerson=person.clone();
        System.out.println(shallowPerson);

        System.out.println("=== 对原型的基本类型修改 ===");
        person.setAge(12);
        System.out.println("person " +person);
        System.out.println("shallowPerson "+shallowPerson);

        System.out.println("=== 对原型的引用类型修改(浅克隆) ===");
        friends.add("ddd");
        System.out.println("person " +person);
        System.out.println("shallowPerson "+shallowPerson);

        System.out.println("=== 对原型的引用类型修改(深克隆) ===");
        Person deepPerson=person.cloneDeep();
        friends.add("fff");
        person.setAge(9);
        System.out.println("person " +person);
        System.out.println("shallowPerson "+shallowPerson);
        System.out.println("deepPerson "+deepPerson);
    }
}
