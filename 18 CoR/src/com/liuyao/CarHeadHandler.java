package com.liuyao;

/**
 * @author liuyao
 * @date 2018/08/04
 */
public class CarHeadHandler extends CarHandler {
    @Override
    public void doSomething() {
        System.out.println("组装车头");
        if (super.carHandler != null){
            super.carHandler.doSomething();
        }
    }
}
