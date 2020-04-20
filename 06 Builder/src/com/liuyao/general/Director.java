package com.liuyao.general;

/**
 * @author liuyao 2020/4/20 23:43
 * @version 1.0
 */
public class Director {
    /**
     * 构建不同的产品
     *
     * @return
     */
    public Product getAProduct(Builder builder) {
        builder.setPart();
        // 设置不同的零件，产生不同的产品
        return builder.buildProduct();
    }
}
