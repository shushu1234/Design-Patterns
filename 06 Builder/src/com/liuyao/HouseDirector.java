package com.liuyao;

/**
 * @author liuyao
 * @date 2018/07/30
 */
public class HouseDirector {
    public void makeHouse(HouseBuilder houseBuilder){
        houseBuilder.makeFloor();
        houseBuilder.makeWall();
        houseBuilder.makeWindow();
    }
}
