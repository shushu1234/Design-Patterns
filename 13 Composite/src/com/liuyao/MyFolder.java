package com.liuyao;

import java.util.LinkedList;
import java.util.List;

/**
 * @author liuyao
 * @date 2018/08/02
 */
public class MyFolder implements IFile{
    private String foldername;
    private List<IFile> childFile;

    public MyFolder(String foldername) {
        this.foldername = foldername;
        childFile=new LinkedList<>();
    }

    @Override
    public void display() {
        System.out.println(foldername);
    }

    @Override
    public boolean add(IFile iFile) {
        return childFile.add(iFile);
    }

    @Override
    public boolean remove(IFile iFile) {
        return childFile.remove(iFile);
    }

    @Override
    public List<IFile> getChild() {
        return childFile;
    }
}
