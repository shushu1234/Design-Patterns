package com.liuyao;

/**
 * @author liuyao
 * @date 2018/08/05
 */
public abstract class MakeCar {
    /**
     * 抽象方法
     */
    public abstract void makeHead();
    public abstract void makeBody();
    public abstract void makeTail();

    /**
     * 模板方法
     */
    public void make(){
        makeHead();
        makeBody();
        makeTail();
    }

    /**
     * 钩子方法
     */
    public void run(){
        System.out.println("run");
    }
}
