package com.liuyao;

/**
 * @author liuyao
 * @date 2018/08/03
 */
public class Adapter extends Resident  implements Target {
    @Override
    public void use18V(){
        super.use220V();
        System.out.println("使用适配器转换");
    }
}
