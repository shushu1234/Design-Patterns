package com.liuyao.general.replacesingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author liuyao 2020/4/19 16:57
 * @version 1.0
 */
public class SingletonFactory {
    private static Singleton singleton;

    static {
        try {
            Class c = Class.forName(Singleton.class.getName());
            // 获得无参构造
            Constructor constructor = c.getDeclaredConstructor();
            // 设置无参构造是可以访问的
            constructor.setAccessible(true);
            // 产生一个实例对象
            singleton = (Singleton) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
