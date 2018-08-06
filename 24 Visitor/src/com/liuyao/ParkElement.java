package com.liuyao;

/**
 * 公园每一部分的抽象
 *
 * @author liuyao
 * @date 2018/08/06
 */
public interface ParkElement {
    /**
     * 用来接纳访问者类
     */
    public void accept(Visitor visitor);
}
