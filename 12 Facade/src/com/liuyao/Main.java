package com.liuyao;

public class Main {

    public static void main(String[] args) {
        Facade facade=new Facade();
        facade.doABC();
        System.out.println("===============");
        Facade facade1=new Facade();
        facade1.doAC();
    }
}

//A do something
//B do something
//C do something
//===============
//A do something
//C do something
