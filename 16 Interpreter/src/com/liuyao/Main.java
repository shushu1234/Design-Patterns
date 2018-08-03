package com.liuyao;

public class Main {

    public static void main(String[] args) {
        Context context=new Context(10);
        Expression autoIncrExpression = new AutoIncrExpression();
        autoIncrExpression.interpert(context);
        System.out.println(context.getOptput());

        Expression autoDecExpression = new AutoDecExpression();
        autoDecExpression.interpert(context);
        System.out.println(context.getOptput());
    }
}

//auto incr
//11
//auto dec
//10