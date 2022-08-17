package com.atguigu.java;
/*
abstract关键字的使用

abstract可以用来修饰的结构：类、方法

abstract修饰类：抽象类
    > 此类不能实例化
    > 抽象类中一定有构造器，便于子类对象实例化调用
    > 开发中，都会提供抽象类的子类，让子类对象实例化，完成相关的操作

abstract修饰方法
    > 抽象方法只有方法的声明，没有方法体
    > 包含抽象方法的类，一定是抽象类。反之，抽象类中可以没有抽象方法的。
    > 若子类重写了父类中所有的抽象方法后，此子类才可以实例化
    > 子类没有重写父类中所有的抽象方法后，此子类还是一个抽象类
 */
public class AbstractTest {
    public static void main(String[] args) {


    }

}

abstract class Person{
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //抽象方法
    public abstract void eat();

    public void walk(){
        System.out.println("走路");
    }
}

class Student extends Person{
    public Student() {
    }

    public Student(String name, int age){
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("学生多吃有营养的食物");
    }
}
