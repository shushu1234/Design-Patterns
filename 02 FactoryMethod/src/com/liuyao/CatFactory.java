package com.liuyao;

/**
 * @author liuyao
 * @date 2018/07/29
 */
public class CatFactory implements AnimalFactory {
    @Override
    public Cat createAnimal() {
        return new Cat();
    }
}
