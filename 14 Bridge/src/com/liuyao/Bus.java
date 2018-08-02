package com.liuyao;

/**
 * @author liuyao
 * @date 2018/08/02
 */
public class Bus extends Car {

    public Bus(Engine engine) {
        super(engine);
    }

    @Override
    public void installEngineForCar() {
        System.out.print("Bus:");
        super.getEngine().installEngine();
    }
}
