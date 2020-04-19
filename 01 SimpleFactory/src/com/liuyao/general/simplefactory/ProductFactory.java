package com.liuyao.general.simplefactory;

import com.liuyao.general.Product;

/**
 * 简单工厂模式工厂类
 *
 * @author liuyao 2020/4/19 16:37
 * @version 1.0
 */
public class ProductFactory {
    public static <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
