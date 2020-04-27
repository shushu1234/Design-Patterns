package com.liuyao.general;

/**
 * @author liuyao 2020/4/23 23:40
 * @version 1.0
 */
public class ConcreteColleague1 extends Colleague{
    // 通过构造函数传递中介者
    public ConcreteColleague1(Mediator _mediator) {
        super(_mediator);
    }
    // 自有方法 self-method
    public void selfMethod(){
        // 处理自己的业务逻辑
        System.out.println("colleague1 do");
    }
    // 依赖方法 dep-method
    public void depMethod(){
        // 处理自己的业务逻辑
        // 自己不能处理的业务逻辑，委托给中介者处理
        super.mediator.doSomething2();
    }
}
