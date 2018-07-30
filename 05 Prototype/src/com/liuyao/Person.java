package com.liuyao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuyao
 * @date 2018/07/30
 */

@Data
@AllArgsConstructor
@ToString
public class Person implements Cloneable{
    private int age;
    private String name;
    private List<String> firendsName;

    /**
     * 浅克隆，对于引用，直接复制地址，不会新建对象，多个对象公用一个引用对象
     * @return
     */
    @Override
    protected Person clone(){
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 深克隆，需处理引用类型的复制
     * @return
     */
    protected Person cloneDeep(){
        try {
            Person person= (Person) super.clone();
//            新建List对象
            List<String > firends=new ArrayList<>();
            for (String f:person.getFirendsName()) {
                firends.add(f);
            }
            person.setFirendsName(firends);
            return person;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
