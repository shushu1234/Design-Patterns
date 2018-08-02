package com.liuyao;

/**
 * @author liuyao
 * @date 2018/08/02
 */
public class Taxi extends Car {
    public Taxi(Engine engine) {
        super(engine);
    }

    @Override
    public void installEngineForCar() {
        System.out.print("Taxi:");
        super.getEngine().installEngine();
    }
}
