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
        System.out.println("ѧ���Է�");
    }

    public void study(){
        System.out.println("ѧ��ѧϰ֪ʶ");
    }

    public void show(){
        System.out.println("name = " + this.name + ", age = " + super.age);
        System.out.println("major = " + major);
        System.out.println("id = " + id);
        System.out.println("id = " + super.id);
    }
}
