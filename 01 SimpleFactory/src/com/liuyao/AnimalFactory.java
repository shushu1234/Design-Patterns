package com.liuyao;

/**
 * @author liuyao
 * @date 2018/07/29
 */
public class AnimalFactory {
    public static Animal createAnimal1(String type) throws Exception {
        if (type.equals("Dog")){
            return Dog.class.newInstance();
        }else if (type.equals("Cat")){
            return Cat.class.newInstance();
        }else{
            throw new Exception("type is illegal");
        }
    }

    public static Animal createAinmal2(String type) throws Exception {
        return (Animal) Class.forName(type).newInstance();
    }
}
