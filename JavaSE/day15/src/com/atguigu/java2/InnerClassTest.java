package com.atguigu.java2;
/*
类的成员之五：内部类
1.Java中允许将一个类A声明在另一个类B中，则类A是内部类，类B是外部类

2.内部类的分类：成员内部类（静态、非静态） vs 局部内部类

3.成员内部类：
    一方面，作为外部类的成员：
        > 调用外部类的结构
        > 可以用static修饰
        > 可以被4种不同的权限修饰

    另一方面，作为一个类：
        > 类可以定义属性、方法、构造器
        > 可以被final修饰，表示此类不能被继承
        > 可以被abstract修饰

4.关注如下的3个问题
    4.1 如何实例化成员内部类对象
    4.2 如何在成员内部类中区分调用外部类的结构
    4.3 开发中局部内部类的使用
 */
public class InnerClassTest {
    public static void main(String[] args) {

        //创建Dog实例（静态成员内部类）
        Person.Dog dog = new Person.Dog();
        dog.show();
        //创建Bird实例（非静态成员内部类）
        Person p = new Person();
        Person.Bird bird = p.new Bird();
        bird.sing();

        System.out.println("***********");
        bird.display("形参");
    }
}

class Person {

    String name = "Person";
    int age;

    public void eat(){
        System.out.println("人吃饭");
    }

    //静态成员内部类
    static class Dog{
        String name;
        int age;

        public void show(){
            System.out.println("汪汪汪！");
        }

    }

    //非静态成员内部类
    final class Bird{
        String name = "Bird";

        public void sing(){
            System.out.println("我是一只小小鸟");
            eat();
            System.out.println(age);
        }

        public void display(String name){
            System.out.println(name);//方法的形参
            System.out.println(this.name);//内部类的属性
            System.out.println(Person.this.name);//外部类的属性
        }
    }



    public void method(){
        //局部内部类
        class AA{

        }
    }

    {
        //局部内部类
        class BB{

        }
    }
}
