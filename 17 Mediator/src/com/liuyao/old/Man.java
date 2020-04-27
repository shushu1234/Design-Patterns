package com.liuyao.old;

/**
 * @author liuyao
 * @date 2018/08/04
 */
public class Man extends Person {

    public Man(String name, int age, Mediator mediator) {
        super(name, age, mediator);
    }

    @Override
    public void getPartner(Person person) {
        super.getMediator().setMan(this);
        super.getMediator().getPartner(person);
    }
}
