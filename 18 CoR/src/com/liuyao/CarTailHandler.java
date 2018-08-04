package com.liuyao;

/**
 * @author liuyao
 * @date 2018/08/04
 */
public class CarTailHandler extends CarHandler {
    @Override
    public void doSomething() {
        System.out.println("组装车尾");
        if (super.carHandler != null){
            super.carHandler.doSomething();
        }
    }
}
