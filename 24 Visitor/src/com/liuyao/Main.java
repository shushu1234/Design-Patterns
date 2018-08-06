package com.liuyao;

public class Main {

    public static void main(String[] args) {
        Park park=new Park();

        VisitorA visitorA=new VisitorA();
        park.accept(visitorA);

        System.out.println("==============================");
        VisitorB visitorB=new VisitorB();
        park.accept(visitorB);

        System.out.println("==============================");
        VisitorManager visitorManager=new VisitorManager();
        park.accept(visitorManager);
    }
}

//visitorA parkA
//==============================
//visitorB parkB
//==============================
//visitorManager park
//visitorManager parkA
//visitorManager parkB