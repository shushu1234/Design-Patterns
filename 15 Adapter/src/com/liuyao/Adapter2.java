package com.liuyao;

/**
 * @author liuyao
 * @date 2018/08/03
 */
public class Adapter2 implements Target {
    Resident resident;

    public Adapter2(Resident resident) {
        this.resident = resident;
    }

    @Override
    public void use18V() {
        resident.use220V();
        System.out.println("使用适配器转换");
    }
}
