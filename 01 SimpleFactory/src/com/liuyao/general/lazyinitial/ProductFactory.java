package com.liuyao.general.lazyinitial;

import com.liuyao.general.ConcreteProduct1;
import com.liuyao.general.ConcreteProduct2;
import com.liuyao.general.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuyao 2020/4/19 17:20
 * @version 1.0
 */
public class ProductFactory {
    private static final Map<String, Product> PRODUCT_MAP = new HashMap<>();

    public static synchronized Product createProduct(String type) {
        Product product;
        if (PRODUCT_MAP.containsKey(type)) {
            product = PRODUCT_MAP.get(type);
        } else {
            if (type.equals("Product1")) {
                product = new ConcreteProduct1();
            } else {
                product = new ConcreteProduct2();
            }
            PRODUCT_MAP.put(type, product);
        }
        return product;
    }
}
