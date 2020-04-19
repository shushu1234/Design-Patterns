package com.liuyao.general;

/**
 * 具体工厂类
 *
 * @author liuyao 2020/4/19 16:20
 * @version 1.0
 */
public class ConcreteCreator extends Creator {
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
