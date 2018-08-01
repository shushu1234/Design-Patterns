package com.liuyao;

public class Main {

    public static void main(String[] args) {
        TeacherFactory factory = new TeacherFactory();
        Teacher teacher = factory.getTeacher("1234");
        Teacher teacher1 = factory.getTeacher("1235");
        Teacher teacher2 = factory.getTeacher("1234");

        System.out.println(teacher.getNo());
        System.out.println(teacher1.getNo());
        System.out.println(teacher2.getNo());

        System.out.println(teacher == teacher1);
        System.out.println(teacher == teacher2);
    }
}

//1234
//1235
//1234
//false
//true