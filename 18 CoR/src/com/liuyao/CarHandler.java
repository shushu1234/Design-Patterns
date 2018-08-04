package com.liuyao;

/**
 * @author liuyao
 * @date 2018/08/04
 */
public abstract class CarHandler {
    protected  CarHandler carHandler;

    public void setNextHandler(CarHandler carHandler){
        this.carHandler=carHandler;
    }
    public abstract void doSomething();
}
