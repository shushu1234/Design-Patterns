package com.liuyao;

/**
 * 访问者
 *
 * @author liuyao
 * @date 2018/08/06
 */
public interface Visitor {
    public void visit(Park park);
    public void visit(ParkA parkA);
    public void visit(ParkB parkB);
}
