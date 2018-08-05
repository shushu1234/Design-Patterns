package com.liuyao;

/**
 * @author liuyao
 * @date 2018/08/05
 */
public class Memento {
    private String name;
    private int age;

    public Memento(String name, int age) {
        this.name = name;
        this.age = age;
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
}
