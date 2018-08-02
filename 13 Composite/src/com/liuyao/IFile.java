package com.liuyao;

import java.util.List;

/**
 * @author liuyao
 * @date 2018/08/02
 */
public interface IFile {
    public void display();

    public boolean add(IFile iFile);

    public boolean remove(IFile iFile);

    public List<IFile> getChild();
}
