package com.liuyao.general.extend;

/**
 * @author liuyao 2020/4/19 21:21
 * @version 1.0
 */
public abstract class AbstractTemplateExtend {
    private boolean runFlag = true;
    /**
     * 基本方法
     */
    protected abstract void doSomething();

    /**
     * 基本方法
     */
    protected abstract void doAnything();

    /**
     * 设置 flag
     * @param runFlag
     */
    public void setRunFlag(boolean runFlag){
        this.runFlag=runFlag;
    }

    /**
     * 钩子方法
     * @return
     */
    protected boolean isRun(){
        return runFlag;
    }

    /**
     * 模板方法
     */
    final public void templateMethod(){
        // 调用基本方法，完成相关逻辑
        this.doSomething();
        if (isRun()) {
            this.doAnything();
        }
    }
}
