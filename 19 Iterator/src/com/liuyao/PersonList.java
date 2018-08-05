package com.liuyao;

import java.util.Iterator;

/**
 * @author liuyao
 * @date 2018/08/05
 */
public interface PersonList {
    public void addPerson(Person person);

    public void delPerson(Person person);

    public Iterator iterator();
}
