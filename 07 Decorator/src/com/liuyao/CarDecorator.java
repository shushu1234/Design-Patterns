package com.liuyao;

/**
 * @author liuyao
 * @date 2018/07/31
 */
public abstract class CarDecorator implements Car{
    private Car car;

    public CarDecorator(Car car) {
        this.car=car;
    }

    @Override
    public void show() {
        car.show();
    }
}
