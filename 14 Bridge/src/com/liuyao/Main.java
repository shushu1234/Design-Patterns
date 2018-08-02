package com.liuyao;

public class Main {

    public static void main(String[] args) {
        Engine enginea=new EngineA();
        Engine engineb=new EngineB();

        Car bus=new Bus(enginea);
        bus.installEngineForCar();

        Car taxi=new Taxi(engineb);
        taxi.installEngineForCar();
    }
}

//Bus:install engine A
//Taxi:install engine B