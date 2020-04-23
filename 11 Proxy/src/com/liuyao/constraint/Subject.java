package com.liuyao.constraint;

/**
 * @author liuyao 2020/4/23 22:34
 * @version 1.0
 */
public interface Subject {
    /**
     * 业务操作
     */
    public void sellBook();

    /**
     * 找到自己的代理
     */
    public Subject getProxy();
}
