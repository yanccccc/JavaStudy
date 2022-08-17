package com.atguigu.java;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class ClassLoaderTest {

    @Test
    public void test1(){
        //对于自定义类，使用系统加载器进行加载
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);

        //调用系统类加载器的getParent():获取扩展类加载器
        ClassLoader classLoader1 = classLoader.getParent();
        System.out.println(classLoader1);

        //调用扩展类加载器的getParent():无法获取引导类加载器
        ClassLoader classLoader2 = classLoader1.getParent();
        System.out.println(classLoader2);
    }

    /*
    Properties:用来读取配置文件
     */
    @Test
    public void test2() throws Exception {
        Properties properties = new Properties();

        //读取配置文件的方式一：
        //读取的文件路径是相对于module下的
//        FileInputStream fis = new FileInputStream(new File("jdbc.properties"));
//        properties.load(fis);

        //读取配置文件的方式一：
        //读取的文件路径是相对于src下的
        //getResourceAsStream(String str):获取类路径下的指定文件的输入流
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("jdbc1.properties");
        properties.load(is);

        String name = properties.getProperty("user");
        String password = properties.getProperty("password");
        System.out.println("name = " + name + ",password = " + password);
    }
}
