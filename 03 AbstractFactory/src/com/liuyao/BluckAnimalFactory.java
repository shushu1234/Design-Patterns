package com.liuyao;

/**
 * @author liuyao
 * @date 2018/07/29
 */
public class BluckAnimalFactory implements AnimalFactory {

    @Override
    public Dog creatDog() {
        return new BluckDog();
    }

    @Override
    public Cat createCat() {
        return new BluckCat();
    }
}
