package com.liuyao;

/**
 * @author liuyao
 * @date 2018/07/30
 */
public class PingFangBuilder implements HouseBuilder {
    private House house=new House();
    @Override
    public void makeFloor() {
        house.setFloor("PingFang ==> Floor");
    }

    @Override
    public void makeWall() {
        house.setWall("PingFang ==> Wall");
    }

    @Override
    public void makeWindow() {
        house.setWindow("PingFang ==> Window");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
