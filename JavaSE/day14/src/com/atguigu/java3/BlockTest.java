package com.atguigu.java3;
/*
代码块

1.代码块的作用：用来初始化类、对象
2.代码块如果有修饰只能用static
3.分类：静态代码块 vs 非静态代码块

4.静态代码块
    >内部可以有输出语句
    >随着类的加载而执行,而且只执行一次
    >作用：初始化类的信息
    >静态代码块内只能调用静态的属性和方法，不能调用非静态的属性和方法

5.非静态代码块
    >内部可以有输出语句
    >随着对象的创建而执行
    >每创建一个对象就执行一次
    >可以在创建对象时，对对象的属性进行初始化
    >非静态代码块内可以调用静态的属性和方法，也可以调用非静态的属性和方法
 */
public class BlockTest {
    public static void main(String[] args) {
        String desc = Person.desc;
        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(desc);

    }
}

class Person{
    String name;
    int age;
    static String desc = "我是一个人";

    public Person(){

    }

    //构造器
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭");
    }

    //静态代码块
    static {
        System.out.println("hello,static block");
        desc = "我是一个爱学习的人";
    }

    //非静态代码块
    {
        System.out.println("hello,block");
    }

    public static void info(){
        System.out.println("我是一个快乐的人");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}