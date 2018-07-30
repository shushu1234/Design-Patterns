package com.liuyao;

public class Main {

    public static void main(String[] args) {
//        创建工程队 建造平房
        HouseBuilder pingFangBuilder=new PingFangBuilder();
//        创建设计者
        HouseDirector director=new HouseDirector();
        director.makeHouse(pingFangBuilder);
        House pingFang=pingFangBuilder.getHouse();
        System.out.println(pingFang);

//        建造公寓
        HouseBuilder gongYuBuilder = new GongYuBuilder();
        director.makeHouse(gongYuBuilder);
        House gongYu=gongYuBuilder.getHouse();
        System.out.println(gongYu);
    }
}
