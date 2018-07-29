package com.liuyao;

public class Main {

    public static void main(String[] args) throws Exception {
	    Dog dog=new DogFactory().createAnimal();
        dog.eat();
        Cat cat=new CatFactory().createAnimal();
        cat.eat();
    }
}

// dog eat
// cat eat