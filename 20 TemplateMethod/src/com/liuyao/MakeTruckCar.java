package com.liuyao;

/**
 * @author liuyao
 * @date 2018/08/05
 */
public class MakeTruckCar extends MakeCar{

    @Override
    public void makeHead() {
        System.out.println("truck head");
    }

    @Override
    public void makeBody() {
        System.out.println("truck body");
    }

    @Override
    public void makeTail() {
        System.out.println("truck tail");
    }

    @Override
    public void run() {
        System.out.println("run in countryside");
    }
}
