package security;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Singleton singleton=Singleton.getSingleton();

        Constructor constructor=Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton singleton1= (Singleton) constructor.newInstance();
        System.out.println(singleton == singleton1);

    }
}
