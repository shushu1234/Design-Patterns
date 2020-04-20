package com.liuyao.general;

/**
 * 具体建造者
 *
 * @author liuyao 2020/4/19 22:06
 * @version 1.0
 */
public class ConcreteProductBuilder extends Builder {
    private Product product = new Product();

    @Override
    public void setPart() {
        // 产品类内的逻辑处理
        product.setName("AProduct");
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
