package com.liuyao;

public class Main {

    public static void main(String[] args) {
        Car runCar=new RunCar();
        runCar.show();
        System.out.println("===============");
        Car flyCar= new FlyCarDecorator(runCar);
        flyCar.show();
        System.out.println("===============");
        Car swimCar = new SwimCarDecorator(flyCar);
        swimCar.show();
    }
}

//Run
//===============
//Run
//Fly
//===============
//Run
//Fly
//Swim

