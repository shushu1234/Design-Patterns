package com.liuyao;

/**
 * @author liuyao
 * @date 2018/07/29
 */
public class DogFactory implements AnimalFactory {
    @Override
    public Dog createAnimal() {
        return new Dog();
    }
}
