package security;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author liuyao
 * @date 2018/08/08
 */
public class MainEnum {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        SingletonEnum singletonEnum=SingletonEnum.INSTANCE;
        Constructor constructor=SingletonEnum.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonEnum singletonEnum2= (SingletonEnum) constructor.newInstance();

        System.out.println(singletonEnum == singletonEnum2);
    }
}
