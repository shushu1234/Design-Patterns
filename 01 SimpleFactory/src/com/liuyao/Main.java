package com.liuyao;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        Dog dog= (Dog) AnimalFactory.createAnimal1("Dog");
        dog.eat();
        Cat cat= (Cat) AnimalFactory.createAinmal2("com.liuyao.Cat");
        cat.eat();
    }
}
