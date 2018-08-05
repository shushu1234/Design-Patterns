package com.liuyao;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        PersonList personList=new PersonListImpl();
        Person person1=new Person("aaa",12);
        Person person2=new Person("bbb",14);
        Person person3=new Person("ccc",16);
        personList.addPerson(person1);
        personList.addPerson(person2);
        personList.addPerson(person3);

        Iterator iterator=personList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}


//Person{name='aaa', age=12}
//Person{name='bbb', age=14}
//Person{name='ccc', age=16}
