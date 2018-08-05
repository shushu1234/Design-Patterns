package com.liuyao;

public class Main {

    public static void main(String[] args) {
        MakeCar bus=new MakeBusCar();
        MakeCar truck=new MakeTruckCar();
        MakeCar suv=new MakeSUVCar();

        bus.make();
        bus.run();

        System.out.println("===========================");
        truck.make();
        truck.run();

        System.out.println("===========================");
        suv.make();
        suv.run();
    }
}

//bus head
//bus body
//bus tail
//run in city
//===========================
//truck head
//truck body
//truck tail
//run in countryside
//===========================
//suv head
//suv body
//suv tail
//run