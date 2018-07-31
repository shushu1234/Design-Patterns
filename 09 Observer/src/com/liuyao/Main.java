package com.liuyao;

public class Main {

    public static void main(String[] args) {
        Admin admin=new Admin();
        admin.addObserver(new User());
        admin.publishArticle("AAA","BBB");
    }
}

//    Admin publish an article, title: AAA content: BBB
//    User gets new article, title :AAA content: BBB