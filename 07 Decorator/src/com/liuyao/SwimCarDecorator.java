package com.liuyao;

/**
 * @author liuyao
 * @date 2018/07/31
 */
public class SwimCarDecorator extends CarDecorator{

    public SwimCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void show() {
        super.show();
        this.swim();
    }

    public void swim(){
        System.out.println("Swim");
    }
}
