package com.liuyao;

public class Main {

    public static void main(String[] args) {
        Receiver receiver=new Receiver();
        Command command=new ConcreteCommand(receiver);
//        客户端可以直接执行具体的命令
        command.execute();

//        客户端通过调用者类执行命令
        Invoker invoker=new Invoker();
        invoker.setCommand(command);
        invoker.action();
    }
}

//Receiver doSomething
//Receiver doSomething
