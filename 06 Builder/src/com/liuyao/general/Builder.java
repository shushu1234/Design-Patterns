package com.liuyao.general;

/**
 * 抽象建造者
 *
 * @author liuyao 2020/4/19 22:04
 * @version 1.0
 */
public abstract class Builder {
    /**
     * 设置产品的不同部分，以获得不提的产品
     */
    public abstract void setPart();

    /**
     * 建造产品
     *
     * @return
     */
    public abstract Product buildProduct();
}
