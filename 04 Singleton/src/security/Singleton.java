package security;

/**
 * @author liuyao
 * @date 2018/08/08
 */
public class Singleton {
    public static Singleton singleton=new Singleton();

    private Singleton(){}

    public static Singleton getSingleton() {
        return singleton;
    }
}
