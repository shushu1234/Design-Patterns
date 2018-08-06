package com.liuyao;

/**
 * @author liuyao
 * @date 2018/08/06
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action(){
        this.command.execute();
    }
}
