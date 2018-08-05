package com.liuyao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author liuyao
 * @date 2018/08/05
 */
public class PersonListImpl implements PersonList{
    private List<Person> personList;
    private int index;

    public PersonListImpl() {
        personList=new ArrayList<>();
    }

    @Override
    public void addPerson(Person person){
        personList.add(person);
    }

    @Override
    public void delPerson(Person person){
        personList.remove(person);
    }

    @Override
    public Iterator iterator(){
        return new Itr();
    }

    private class Itr implements Iterator {

        @Override
        public boolean hasNext() {
            if (index >= personList.size()){
                return false;
            }else {
                return true;
            }
        }

        @Override
        public Object next() {
            return personList.get(index++);
        }

        @Override
        public void remove() {

        }
    }
}
