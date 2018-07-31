package com.liuyao;

public class Main {

    public static void main(String[] args) {
        Context md5Context=new Context(new MD5Encrypt());
        md5Context.doEncrypt();

        Context aesContext=new Context(new AESEncrypt());
        aesContext.doEncrypt();
    }
}

//    MD5 Encrypt
//    AES Encrypt