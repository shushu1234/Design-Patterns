package com.liuyao.general;

/**
 * 抽象中介者
 * @author liuyao 2020/4/23 23:38
 * @version 1.0
 */
public abstract class Mediator {
    //定义同事类
    ConcreteColleague1 concreteColleague1;
    ConcreteColleague2 concreteColleague2;
    // 通过 get 和 set 方法把同事注入进来
    public ConcreteColleague1 getConcreteColleague1() {
        return concreteColleague1;
    }

    public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {
        this.concreteColleague1 = concreteColleague1;
    }

    public ConcreteColleague2 getConcreteColleague2() {
        return concreteColleague2;
    }

    public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {
        this.concreteColleague2 = concreteColleague2;
    }
    // 中介者模式的业务逻辑
    public abstract void doSomething1();
    public abstract void doSomething2();
}
