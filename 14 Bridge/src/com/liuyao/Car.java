package com.liuyao;

/**
 * @author liuyao
 * @date 2018/08/02
 */
public abstract class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public abstract void installEngineForCar();
}
