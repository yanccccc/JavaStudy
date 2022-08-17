package com.atguigu.java3;

public class Student extends Person{
    String major;
    int id = 1002;
    public Student(){

    }

    public Student(String major) {
        this.major = major;
    }

    public Student(String name,int age,String major){
        super(name,age);
        this.major = major;
    }

    public void eat(){
        System.out.println("学生吃饭");
    }

    public void study(){
        System.out.println("学生学习知识");
    }

    public void show(){
        System.out.println("name = " + this.name + ", age = " + super.age);
        System.out.println("major = " + major);
        System.out.println("id = " + id);
        System.out.println("id = " + super.id);
    }
}
