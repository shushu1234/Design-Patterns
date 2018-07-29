package com.liuyao;

public class Main {

    public static void main(String[] args) {
        AnimalFactory factory=new BluckAnimalFactory();
        Dog dog=factory.creatDog();
        Cat cat=factory.createCat();
        dog.eat();
        cat.eat();

        AnimalFactory factory1=new WhiteAnimalFactory();
        Dog dog1=factory1.creatDog();
        Cat cat1=factory1.createCat();
        dog1.eat();
        cat1.eat();
    }
}

//    BluckDog eat
//    BluckCat eat
//    WhiteDog eat
//    WhiteCat eat