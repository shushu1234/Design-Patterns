package com.liuyao.old;

public class Main {

    public static void main(String[] args) {
        Mediator mediator=new Mediator();
        Person zhangsan =new Man("张三",25,mediator);
        Person lisi =new Man("李四",24,mediator);
        Person xiaofang=new Woman("小芳",25,mediator);
        Person xiaoding=new Woman("小丁",23,mediator);

        zhangsan.getPartner(lisi);
        zhangsan.getPartner(xiaofang);
        zhangsan.getPartner(xiaoding);
    }
}

//性别相同
//张三 和 小芳 相配
//张三 和 小丁 不相配
