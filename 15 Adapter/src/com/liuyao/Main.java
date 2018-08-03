package com.liuyao;

public class Main {

    public static void main(String[] args) {
        Adapter adapter=new Adapter();
        adapter.use18V();

        Resident resident=new Resident();
        Adapter2 adapter2=new Adapter2(resident);
        adapter2.use18V();
    }
}

//居民使用220V电
//使用适配器转换
//居民使用220V电
//使用适配器转换