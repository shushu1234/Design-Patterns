package com.liuyao;

/**
 * @author liuyao
 * @date 2018/07/31
 */
public class FlyCarDecorator extends CarDecorator{

    public FlyCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void show() {
        super.show();
        this.fly();
    }

    public void fly(){
        System.out.println("Fly");
    }
}
