package com.liuyao;

/**
 * @author liuyao
 * @date 2018/07/30
 */
public class GongYuBuilder implements HouseBuilder {
    private House house=new House();
    @Override
    public void makeFloor() {
        house.setFloor("GongYu ==> Floor");
    }

    @Override
    public void makeWall() {
        house.setWall("GongYu ==> Wall");
    }

    @Override
    public void makeWindow() {
        house.setWindow("GongYu ==> Window");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
