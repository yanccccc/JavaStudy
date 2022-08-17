package com.atguigu.Java2;
/*
this关键字的使用
1.this可以用来修饰：属性、方法、构造器

2.this修饰属性
    this理解为：当前对象

    在类的方法中，我们可以使用"this.属性"或"this.方法"调用当前的属性或方法
    通常情况下，我们都选择省略"this"，特殊情况下，如果方法的形参和类的属性同名时，我们必须显示的
    使用"this",表明此属性是属性，而非形参。

3.this调用构造器
    3.1 我们在类的构造器中，可以显示的使用"this(形参列表)"方式，调用本类中指定的其他构造器
    3.2 构造器中不能通过"this(形参列表)"方式调用自己
    3.3 如果一个类中有n个构造器，则最多有n-1个构造器使用"this(形参列表)"
    3.4 "this(形参列表)"必须声明在构造器的首行
    3.5 构造器内部，最多只能声明一个"this(形参列表)"的方式用来调用其他构造器

 */
public class PeersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(2);
        System.out.println(p.getAge());
        p.eat();
    }
}

class Person{
    private String name;
    private int age;

    public Person(){
        this.eat();
        //40行代码
    }

    public Person(String name){
        this();
        this.name = name;

    }

    public Person(int age){
        this.age = age;
    }

    public Person(String name,int age){
        this(age);
        this.name = name;
        //this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void eat(){
        System.out.println("人吃饭");
        study();
    }

    public void study(){
        System.out.println("人学习");
    }

}
