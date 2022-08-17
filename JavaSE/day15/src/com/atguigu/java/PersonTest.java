package com.atguigu.java;
/*
抽象类的匿名子类使用
 */
public class PersonTest {
    public static void main(String[] args) {
        method(new Student());

        Work work = new Work();
        method1(work);//非匿名的类非匿名的对象

        method1(new Work());//非匿名的类匿名的对象

        //匿名子类对象
        Person p = new Person() {
            @Override
            public void eat() {
                System.out.println("匿名子类的吃东西");
            }

        };

        method1(p);

    }

    public static void method(Student s){

    }
    public static void method1(Person p){
        p.eat();
        p.walk();
    }
}

class Work extends Person{
    public Work() {
    }

    @Override
    public void eat() {
        System.out.println("工人吃东西");
    }
}
