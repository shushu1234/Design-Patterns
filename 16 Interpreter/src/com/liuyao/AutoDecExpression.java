package com.liuyao;

/**
 * @author liuyao
 * @date 2018/08/03
 */
public class AutoDecExpression extends Expression {
    @Override
    public void interpert(Context context) {
        System.out.println("auto dec");
        int input=context.getInput();
        input--;
//        要对上下文环境进行重新赋值
        context.setInput(input);
        context.setOptput(input);
    }
}
