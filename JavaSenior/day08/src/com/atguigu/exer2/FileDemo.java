package com.atguigu.exer2;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class FileDemo {


    /*
    1. 利用File构造器，new 一个文件目录file
    1)在其中创建多个文件和目录
    2)编写方法，实现删除file中指定文件的操作
     */
    @Test
    public void test1() throws IOException {
        File file1 = new File("D:\\Java\\JavaSE\\JavaSenior\\day08\\hi.txt");
        File file2 = new File(file1.getParent(),"haha.txt");

        boolean newFile = file2.createNewFile();
        if(newFile){
            System.out.println("创建成功");
        }

//        boolean delete = file2.delete();
//        if(delete){
//            System.out.println("删除成功");
//        }
    }
}
