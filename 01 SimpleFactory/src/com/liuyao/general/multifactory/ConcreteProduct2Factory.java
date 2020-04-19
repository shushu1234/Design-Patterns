package com.liuyao.general.multifactory;

import com.liuyao.general.ConcreteProduct2;
import com.liuyao.general.Product;

/**
 * @author liuyao 2020/4/19 16:50
 * @version 1.0
 */
public class ConcreteProduct2Factory extends AbstractProductFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct2();
    }
}
