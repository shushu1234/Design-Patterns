package com.liuyao.general;

/**
 * @author liuyao 2020/4/19 19:07
 * @version 1.0
 */
public class Creator1 extends AbstractCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
