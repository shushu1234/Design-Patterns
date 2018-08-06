package com.liuyao;

/**
 * @author liuyao
 * @date 2018/08/06
 */
public class ConcreteCommand extends Command{
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
