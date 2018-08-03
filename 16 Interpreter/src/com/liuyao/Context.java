package com.liuyao;

/**
 * 上下文环境，用来保存文法
 *
 * @author liuyao
 * @date 2018/08/03
 */
public class Context {
    private int input;
    private int optput;

    public Context(int input) {
        this.input = input;
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public int getOptput() {
        return optput;
    }

    public void setOptput(int optput) {
        this.optput = optput;
    }
}
