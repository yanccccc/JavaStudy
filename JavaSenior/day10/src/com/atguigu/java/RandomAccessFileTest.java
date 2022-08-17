package com.atguigu.java;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RandomAccessFile的使用
 * 1.RandomAccessFile直接继承于Object类，实现了DataInput和DataOutput接口
 * 2.RandomAccessFile既可以作为一个输入流，又可以作为一个输出流
 *
 * 3.如果RandomAccessFile作为输出流时，写出到的文件如果不存在，则在执行过程中自动创建
 *   如果写出的文件存在，则会对原有的文件进行覆盖。（默认情况下，从头覆盖）
 */
public class RandomAccessFileTest {

    @Test
    public void test1(){
        RandomAccessFile ra = null;
        RandomAccessFile rw = null;
        try {
            ra = new RandomAccessFile(new File("taiwan.jpg"),"r");
            rw = new RandomAccessFile(new File("taiwan1.jpg"),"rw");

            byte[] buffer = new byte[1024];
            int len;
            while ((len = ra.read(buffer)) != -1){
                rw.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(ra != null){
                try {
                    ra.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(rw != null){
                try {
                    rw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test2() throws IOException {
        RandomAccessFile raf1 = new RandomAccessFile("hello.txt","rw");

        raf1.seek(3);
        byte[] buffer = new byte[10];
        int len;
        //保存指针后面的所有数据到builder中
        StringBuilder builder = new StringBuilder((int) new File("hello.txt").length());
        while ((len = raf1.read(buffer)) != -1){
            builder.append(new String(buffer,0,len));
        }

        //调回指针
        raf1.seek(3);
        raf1.write("xyz".getBytes());
        //将后面的字符串复制到新增后面
        raf1.write(builder.toString().getBytes());

        raf1.close();

    }
}
