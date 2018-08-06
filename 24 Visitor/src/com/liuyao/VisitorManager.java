package com.liuyao;

/**
 * @author liuyao
 * @date 2018/08/06
 */
public class VisitorManager implements Visitor {
    @Override
    public void visit(Park park) {
        System.out.println("visitorManager park");
    }

    @Override
    public void visit(ParkA parkA) {
        System.out.println("visitorManager parkA");
    }

    @Override
    public void visit(ParkB parkB) {
        System.out.println("visitorManager parkB");
    }
}
