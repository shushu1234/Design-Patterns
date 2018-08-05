package com.liuyao;

/**
 * @author liuyao
 * @date 2018/08/05
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 创建一个备份
     * @return
     */
    public Memento createMemento(){
        return new Memento(name,age);
    }

    /**
     * 恢复备份，还原
     * @param memento
     */
    public void restoreFromMemento(Memento memento){
        this.name=memento.getName();
        this.age=memento.getAge();
    }
}
