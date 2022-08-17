package com.atguigu.java;

import org.junit.Test;

import java.util.Random;

/**
 *
 */
public class NewInstance {

    @Test
    public void test1() throws InstantiationException, IllegalAccessException {
        Class<Person> clazz = Person.class;

        /*
        要想此方法正常的创建运行时类的对象，要求：
        1.运行时类必须提供空参的构造器
        2.空参的构造器的权限必须得够，一般为public

        在javabean中一般要提供一个空参的构造器。原因：
        1.便于通过反射，创建运行时类的对象
        2.便于子类继承此运行类时，可以调用super()时，有此父类构造器
         */
        Person p = clazz.newInstance();
        System.out.println(p);

    }

    //体会反射的动态性
    @Test
    public void test2() throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        for (int i = 0; i < 100; i++) {
            int num = new Random().nextInt(3);//0,1,2
            String path = "";
            switch (num){
                case 0:
                    path = "java.util.Date";
                    break;
                case 1:
                    path = "java.lang.Object";
                    break;
                case 2:
                    path = "com.atguigu.java.Person";
                    break;
            }
            Object obj = getInstance(path);
            System.out.println(obj);

        }

    }

    //创建指定类的对象
    public Object getInstance(String path) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName(path);
        return clazz.newInstance();
    }
}
