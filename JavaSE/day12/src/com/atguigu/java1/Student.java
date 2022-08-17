package com.atguigu.java1;

public class Student extends Person{
    String major;

    public Student(){

    }

    public Student(String major){
        this.major = major;
    }

    public void study(String major){
        System.out.println("学习，专业是" + major);
    }

    //对父类中eat方法进行重写
    public void eat(){
        System.out.println("学生吃有营养的食物");
    }

    //不是重写
    public void show(){
        System.out.println("我是一个学生");
    }

    public String test(){
        return null;
    }

}
