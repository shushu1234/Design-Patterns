package com.liuyao;

/**
 * @author liuyao
 * @date 2018/07/31
 */
public class Context {
    private Encrypt encrypt;

    public Context(Encrypt encrypt) {
        this.encrypt = encrypt;
    }

    public void doEncrypt(){
        this.encrypt.doEncrypt();
    }
}
