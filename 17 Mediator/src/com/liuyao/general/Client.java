package com.liuyao.general;

/**
 * @author liuyao 2020/4/27 23:41
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator=new ConcreteMediator();
        ConcreteColleague1 concreteColleague1 =new ConcreteColleague1(mediator);
        ConcreteColleague2 concreteColleague2 =new ConcreteColleague2(mediator);
        mediator.setConcreteColleague1(concreteColleague1);
        mediator.setConcreteColleague2(concreteColleague2);
        concreteColleague1.depMethod();
        concreteColleague2.depMethod();
    }
}
