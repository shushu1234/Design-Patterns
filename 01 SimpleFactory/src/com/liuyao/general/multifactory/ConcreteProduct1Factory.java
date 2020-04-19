package com.liuyao.general.multifactory;

import com.liuyao.general.ConcreteProduct1;
import com.liuyao.general.Product;

/**
 * @author liuyao 2020/4/19 16:49
 * @version 1.0
 */
public class ConcreteProduct1Factory extends AbstractProductFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct1();
    }
}
