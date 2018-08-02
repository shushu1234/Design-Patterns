package com.liuyao;

        import java.util.List;

public class Main {

    public static void main(String[] args) {
        MyFolder rootFolder=new MyFolder("C:");
        MyFolder testFolder=new MyFolder("testFolder");
        MyFile myFile=new MyFile("test.txt");

        rootFolder.add(testFolder);
        rootFolder.add(myFile);

        MyFolder test2Folder=new MyFolder("test2Folder");
        MyFile myFile1=new MyFile("myFile1");
        testFolder.add(test2Folder);
        test2Folder.add(myFile1);

        displayTree(rootFolder,0);

    }

    private static void displayTree(IFile rootFolder,int deep) {
        for (int i = 0; i < deep; i++) {
            System.out.print("--");
        }
        rootFolder.display();
        List<IFile> childFile=rootFolder.getChild();
        for (IFile ifile: childFile) {
            if (ifile instanceof MyFile){
                for (int i = 0; i <= deep; i++) {
                    System.out.print("--");
                }
                ifile.display();
            }else {
                displayTree(ifile,deep+1);
            }
        }
    }
}

//C:
//--testFolder
//----test2Folder
//------myFile1
//--test.txt