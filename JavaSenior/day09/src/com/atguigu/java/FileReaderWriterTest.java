package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 * 一、流的分类
 * 1.操作数据单位：字节流、字符流
 * 2.数据的流向：输入流、输出流
 * 3.流的角色：角色流、处理流
 *
 * 二、流的体系结构
 * 抽象基类             节点流（文件流）                                    缓冲流（处理流的一种）
 * InputStream          FileInputStream (read(byte[] buffer))             BufferInputStream (read(byte[] buffer))
 * OutputStream         FileOutputStream (write(byte[] buffer,0,len))     BufferOutputStream (write(byte[] buffer,0,len))
 * Reader               FileReader (read(char[] cbuf))                    BufferReader (read(char[] cbuf)/readLine())
 * Writer               FileWriter (write(char[] buffer,0,len))           BufferWriter (write(char[] buffer,0,len))
 *
 *
 *
 */
public class FileReaderWriterTest {
    public static void main(String[] args) {
        File file = new File("hello.txt");
        System.out.println(file.getAbsoluteFile());

        File file1 = new File("day09\\hello.txt");
        System.out.println(file1.getAbsoluteFile());
    }

    /*
    将day09下的hello.txt文件读入程序中，并输出到控制台

    1.read():返回读入一个字符，如果到达文件末尾，返回-1
    2.异常的处理：为了保证流资源可以关闭，需要使用try-catch-finally处理
    3.读入的文件一定要存在，否则会报异常
     */
    @Test
    public void testFileReader(){
        FileReader fr = null;
        try {
            //1.实例化File类的对象，指明要操作的文件
            File file = new File("hello.txt");
            //2.提供工具体的流
            fr = new FileReader(file);

            //3.数据的读入
            //read():返回读入一个字符，如果到达文件末尾，返回-1
            //方式一
//        int data = fr.read();
//        while (data != -1){
//            System.out.print((char)data);
//            data = fr.read();
//        }
            int data;
            while ((data = fr.read()) != -1){
                System.out.print((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //4.流的关闭
                if(fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    //对read()操作升级，使用read的重载方法
    @Test
    public void testFileReader1(){
        FileReader fr = null;
        try {
            //1.File的数理化
            File file = new File("hello.txt");

            //2.FileReader的实例化
            fr = new FileReader(file);

            //3.读入的操作
            //read(char[] cbuf):返回每次读入cbuf中的字符个数
            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1) {
                //错误的写法
//                for (int i = 0; i < cbuf.length; i++) {
//                    System.out.print(cbuf[i]);
//                }
                //正确的
//                for (int i = 0; i < len; i++) {
//                    System.out.print(cbuf[i]);
//                }
//
//                //方式二错误：
//                String str = new String(cbuf);
//                System.out.print(str);
                //正确的写法
                String str = new String(cbuf,0,len);
                System.out.print(str);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //4.资源的关闭
                if(fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
    从内存中写出数据到硬盘的文件里

    1.输出操作，对应的file是可以不存在的
        如果不存在，在输入的过程中，会自动创建此文件
        如果存在:
            如果流使用的构造器是：FileWriter(file,false)/FileWriter(file):对原有文件的覆盖
            如果流使用的构造器是：FileWriter(file,true)：不会对原有文件覆盖，而是往原文件后面添加内容
     */
    @Test
    public void testFileWriter(){
        FileWriter fw = null;
        try {
            //1.提供File类的对象，指明写出的文件
            File file = new File("hello1.txt");

            //2.提供FileWriter的对象，用于数据的写出
            fw = new FileWriter(file,false);

            //3.写出的操作
            fw.write("I hava a dream\n".toCharArray());
            fw.write("you also hava a dream");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //4.流资源的关闭
                if(fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


    @Test
    public void testFileReaderWriter(){
        FileReader fr = null;
        FileWriter fw = null;
        try {
            //1.创建File对象，指明要读入和写出的文件
            File srcFile = new File("hello.txt");
            File destFile = new File("hello2.txt");

            //2.创建输入流和输出流的对象
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);

            //3.数据的读入和写出操作
            char[] cbuf = new char[5];
            int len;//记录每次入读到cbuf数组中字符的个数
            while ((len = fr.read(cbuf)) != -1){
                //每次写出len个字符
                fw.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //4.关闭流资源
                if(fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                //4.关闭流资源
                if(fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




    }

}
