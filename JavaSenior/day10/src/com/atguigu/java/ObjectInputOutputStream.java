package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 * 对象流的使用
 * 1.ObjectInputStream和ObjectOutputStream
 * 2.作用用于存储和读取基本数据类型数据或对象的处理流。它的强大之处就是可
 * 以把Java中的对象写入到数据源中，也能把对象从数据源中还原回来。
 *
 * 3.要想一个java对象是可序列化的，需要满足要求。见Person.java
 *
 * 4.对象序列化机制允许把内存中的Java对象转换成平台无关的二进制流，从
 * 而允许把这种二进制流持久地保存在磁盘上，或通过网络将这种二进制流传
 * 输到另一个网络节点。//当其它程序获取了这种二进制流，就可以恢复成原
 * 来的Java对象
 *
 */
public class ObjectInputOutputStream {

    /*
    序列化过程：将内存中的java对象保存在磁盘中通过网络传输出去
    使用ObjectOutputStream实现
     */
    @Test
    public void testObjectOutputStream(){

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("object.txt"));

            oos.writeObject(new String("我爱北京天安门"));
            oos.flush();

            oos.writeObject(new Person("Tom",12));
            oos.flush();

            oos.writeObject(new Person("Jerry",12,new Account(1000)));
            oos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(oos != null){

                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /*
    反序列化：将磁盘中的对象还原成java中的一个对象
     */
    @Test
    public void testObjectInputStream(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("object.txt"));

            Object o = ois.readObject();
            String data = (String) o;

            Person p = (Person) ois.readObject();
            Person p1 = (Person) ois.readObject();
            System.out.println(p);
            System.out.println(o);
            System.out.println(p1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(ois != null){

                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
