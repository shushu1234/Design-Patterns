package com.liuyao;

/**
 * @author liuyao
 * @date 2018/08/05
 */
public class MakeBusCar extends MakeCar{

    @Override
    public void makeHead() {
        System.out.println("bus head");
    }

    @Override
    public void makeBody() {
        System.out.println("bus body");
    }

    @Override
    public void makeTail() {
        System.out.println("bus tail");
    }

    @Override
    public void run() {
        System.out.println("run in city");
    }
}
