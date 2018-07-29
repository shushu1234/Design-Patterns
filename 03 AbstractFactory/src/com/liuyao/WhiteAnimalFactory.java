package com.liuyao;

/**
 * @author liuyao
 * @date 2018/07/29
 */
public class WhiteAnimalFactory implements AnimalFactory {
    @Override
    public Dog creatDog() {
        return new WhiteDog();
    }

    @Override
    public Cat createCat() {
        return new WhiteCat();
    }
}
