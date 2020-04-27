package com.liuyao.general;

/**
 * @author liuyao 2020/4/23 23:39
 * @version 1.0
 */
public class ConcreteMediator extends Mediator {

    @Override
    public void doSomething1() {
        concreteColleague2.selfMethod();
    }

    @Override
    public void doSomething2() {
        concreteColleague1.selfMethod();
    }
}
