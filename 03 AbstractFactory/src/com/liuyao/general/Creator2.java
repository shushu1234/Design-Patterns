package com.liuyao.general;

/**
 * @author liuyao 2020/4/19 19:08
 * @version 1.0
 */
public class Creator2 extends AbstractCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
