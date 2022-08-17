package com.atguigu.java;
/*
继承性的好处：
1.减少了代码的冗余，提高了代码的复用性
2.便于功能的扩展
3.为之后多态性的使用提供了前提

二、继承性的格式：class A extends B
        A：子类、派生类、subclass
        B：父类、超类、superclass

        2.1体现：一旦子类A继承了父类B以后，子类A就获取了父类B中的所有属性和方法
        特别的，父类中声明为private的属性或方法，子类继承父类以后，仍然认为获取了父类中私有的结构。
        因为封装性的影响，使得子类不能调用父类的结构。
        2.2 子类继承父类以后，还可以声明自己特有的属性和方法，实现功能的扩展。

三、Java关于继承性的规定
    1.一个类可以被多个子类继承
    2.Java中的单继承性：一个子类只能有一个父类
    3.子父类是相对的概念
    4.子类继承父类后，可以获取直接父类和间接父类中声明的属性和方法

四、1.如果没有显示的声明一个类的父类，则此类继承于java.lang.Object类
    2.所有的Java类都直接或间接的继承于java.lang.Object类
    3.所有的类都具有java.lang.Object声明的功能
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 1;
        p1.eat();

        Student s1 = new Student();
        s1.eat();
        s1.sleep();
    }
}
