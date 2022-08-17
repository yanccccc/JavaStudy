package com.atguigu.java1;
/*
类的结构之三：构造器（或构造方法、constructor）的使用

一、构造器的作用：
1.创建对象
2.初始化对象的属性

二、说明
1.如果没有显示的定义类的构造器，则系统会默认提供一个空参的构造器
2.定义构造器的格式：权限修饰符 类名(形参列表){}
3.一个类中的多个构造器构成重载
4.一旦显示的定义了类的构造器，系统不在提供默认的空参构造器
5.一个类中，至少有一个构造器

 */
public class PersonTest {
    public static void main(String[] args) {
        //创建类的对象：new + 构造器
        Person p = new Person();
        p.eat();
    }
}

class Person{
    //属性
    String name;
    int age;
    //构造器
    public Person(){
        System.out.println("Person()....");
    }

    //方法
    public void eat(){
        System.out.println("人吃饭");
    }

    public void study(){
        System.out.println("人可以学习");
    }
}
