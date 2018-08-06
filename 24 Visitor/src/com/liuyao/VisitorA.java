package com.liuyao;

/**
 * @author liuyao
 * @date 2018/08/06
 */
public class VisitorA implements Visitor {
    @Override
    public void visit(Park park) {

    }

    @Override
    public void visit(ParkA parkA) {
        System.out.println("visitorA parkA");
    }

    @Override
    public void visit(ParkB parkB) {

    }
}
