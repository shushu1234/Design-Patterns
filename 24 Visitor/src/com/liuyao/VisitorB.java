package com.liuyao;

/**
 * @author liuyao
 * @date 2018/08/06
 */
public class VisitorB implements Visitor{
    @Override
    public void visit(Park park) {

    }

    @Override
    public void visit(ParkA parkA) {

    }

    @Override
    public void visit(ParkB parkB) {
        System.out.println("visitorB parkB");
    }
}
