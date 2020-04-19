package com.liuyao.general.replacesingleton;

import com.liuyao.general.Product;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * 通用单例工厂类
 *
 * @author liuyao 2020/4/19 17:08
 * @version 1.0
 */
public class SingletonFactory2 {
    private static final Map<String, Object> OBJECT_MAP = new HashMap<>();

    public synchronized static <T> T createSingleton(Class<T> c) {
        Object o;
        String className = c.getName();
        try {
            if (!OBJECT_MAP.containsKey(className)) {
                Class clazz = Class.forName(className);
                Constructor constructor = clazz.getDeclaredConstructor();
                constructor.setAccessible(true);
                o = constructor.newInstance();
                OBJECT_MAP.put(className, o);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) OBJECT_MAP.get(className);
    }
}
