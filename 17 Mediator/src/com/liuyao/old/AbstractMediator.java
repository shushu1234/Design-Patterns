package com.liuyao.old;

/**
 * @author liuyao
 * @date 2018/08/04
 */
public abstract class AbstractMediator {
    private Man man;
    private Woman woman;


    public void setMan(Man man) {
        this.man = man;
    }

    public void setWoman(Woman woman) {
        this.woman = woman;
    }

    public Man getMan() {
        return man;
    }

    public Woman getWoman() {
        return woman;
    }

    public abstract void getPartner(Person person);
}
