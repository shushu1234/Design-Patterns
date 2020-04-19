package com.liuyao.general;

/**
 * 抽象工厂类
 *
 * @author liuyao 2020/4/19 16:14
 * @version 1.0
 */
public abstract class Creator {
    /**
     * 创建一个产品对象，起输入参数类型可以自行设置
     * 通常为 String、Enum、Class 等，当日也可以为空
     *
     * @param c
     * @param <T>
     * @return
     */
    public abstract <T extends Product> T createProduct(Class<T> c);

}
