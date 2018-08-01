package com.liuyao;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuyao
 * @date 2018/08/01
 */
public class TeacherFactory {
    private Map<String,Teacher> pool;

    public TeacherFactory() {
        pool=new HashMap<String,Teacher>();
    }

    public Teacher getTeacher(String no){
        Teacher teacher=pool.get(no);
        if (teacher == null){
            teacher = new Teacher();
            teacher.setNo(no);
            pool.put(no,teacher);
        }
        return teacher;
    }
}
