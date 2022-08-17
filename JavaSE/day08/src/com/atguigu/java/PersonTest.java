package com.atguigu.java;
/*
一、设计类就是设计类的成员
属性 = 成员变量 = filed = 域、字段
方法 = 成员方法 = 函数 = method

二、类和对象的使用
1.创建类、设计类的成员
2.创建类的对象
3.通过对象.属性调用对象的结构

三、如果创建了一个类的多个对象，每个对象都独立的拥有一套类的属性(非static的)
如果我们修改一个对象的属性a，则不影响另外对象的属性值
 */
//测试类
public class PersonTest {
    public static void main(String[] args) {
        //创建Person类的对象
        Person p1 = new Person();

        //调用对象的结构：属性和方法
        p1.name = "Tom";
        p1.isMale = true;
        System.out.println(p1.name);

        //方法
        p1.sleep();
        p1.talk("English");

        //********************
        Person p2 = new Person();
        System.out.println(p2.name);//null 默认初始化值

        //********************
        Person p3 = p1;//地址值赋值给p3
        System.out.println(p3.name);//Tom
    }

}

class Person{
    //属性
    String name;
    int age;
    boolean isMale;
    //方法
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void sleep(){
        System.out.println("人可以睡觉");
    }

    public void talk(String language){
        System.out.println("人可以说话，说的是" + language);
    }

}
