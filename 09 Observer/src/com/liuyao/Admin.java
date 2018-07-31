package com.liuyao;

import java.util.Observable;

/**
 * @author liuyao
 * @date 2018/07/31
 */
public class Admin extends Observable{
    public void publishArticle(String title, String content){
        Article article=new Article();
        article.setTitle(title);
        article.setContent(content);
        System.out.println("Admin publish an article, title: "+title+" content: "+content);
        this.setChanged(); //设置状态变化
        this.notifyObservers(article); //通知观察者
    }
}
