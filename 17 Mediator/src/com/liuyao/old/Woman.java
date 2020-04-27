package com.liuyao.old;

/**
 * @author liuyao
 * @date 2018/08/04
 */
public class Woman extends Person{

    public Woman(String name, int age, Mediator mediator) {
        super(name, age, mediator);
    }

    @Override
    public void getPartner(Person person) {
        super.getMediator().setWoman(this);
        super.getMediator().getPartner(person);
    }
}
