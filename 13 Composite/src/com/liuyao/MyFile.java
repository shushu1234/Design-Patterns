package com.liuyao;

import java.util.List;

/**
 * @author liuyao
 * @date 2018/08/02
 */
public class MyFile implements IFile {
    private String name;

    public MyFile(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println(name);
    }

    @Override
    public boolean add(IFile iFile) {
        return false;
    }

    @Override
    public boolean remove(IFile iFile) {
        return false;
    }

    @Override
    public List<IFile> getChild() {
        return null;
    }
}
