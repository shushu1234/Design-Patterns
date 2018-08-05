package com.liuyao;

public class Main {

    public static void main(String[] args) {
        Person person=new Person("aaa",24);
        Caretaker caretaker=new Caretaker();
        caretaker.setMemento(person.createMemento());

        System.out.println(person);

        person.setName("bbb");
        person.setAge(12);
        System.out.println(person);

        person.restoreFromMemento(caretaker.getMemento());
        System.out.println(person);
    }
}

//Person{name='aaa', age=24}
//Person{name='bbb', age=12}
//Person{name='aaa', age=24}