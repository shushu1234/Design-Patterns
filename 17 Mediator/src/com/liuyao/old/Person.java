package com.liuyao.old;

/**
 * @author liuyao
 * @date 2018/08/04
 */
public abstract class Person {
    private String name;
    private int age;
    private Mediator mediator;

    public Person(String name, int age, Mediator mediator) {
        this.name = name;
        this.age = age;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void getPartner(Person person);
}
