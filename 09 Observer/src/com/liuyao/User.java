package com.liuyao;

import java.util.Observable;
import java.util.Observer;

/**
 * @author liuyao
 * @date 2018/07/31
 */
public class User implements Observer {
    @Override
    public void update(Observable o, Object arg) {
       Article article= (Article) arg;
        System.out.println("User gets new article, title :"+article.getTitle()+" content: "+article.getContent());
    }
}
