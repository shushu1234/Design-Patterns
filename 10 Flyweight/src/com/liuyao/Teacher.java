package com.liuyao;

/**
 * @author liuyao
 * @date 2018/08/01
 */
public class Teacher extends Person {
    private String no;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Teacher(String name, int age, String no) {
        super(name, age);
        this.no = no;
    }

    public Teacher() {
    }
}
