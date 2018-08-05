package com.liuyao;

/**
 * @author liuyao
 * @date 2018/08/05
 */
public class MakeSUVCar extends MakeCar{

    @Override
    public void makeHead() {
        System.out.println("suv head");
    }

    @Override
    public void makeBody() {
        System.out.println("suv body");
    }

    @Override
    public void makeTail() {
        System.out.println("suv tail");
    }

}
