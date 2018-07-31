package com.liuyao;

/**
 * @author liuyao
 * @date 2018/07/31
 */
public class RunCar implements Car {
    @Override
    public void show() {
        this.run();
    }

    public void run() {
        System.out.println("Run");
    }
}
