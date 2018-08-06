package com.liuyao;

/**
 * @author liuyao
 * @date 2018/08/06
 */
public class ParkA implements ParkElement{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
