package com.liuyao;

/**
 * @author liuyao
 * @date 2018/08/02
 */
public class Facade {
    private SystemA systemA;
    private SystemB systemB;
    private SystemC systemC;

    public Facade() {
        systemA=new SystemA();
        systemB=new SystemB();
        systemC=new SystemC();
    }

    public void doABC(){
        systemA.doA();
        systemB.doB();
        systemC.doC();
    }

    public void doAC(){
        systemA.doA();
        systemC.doC();
    }
}
