package com.atguigu.java1;

public class Student extends Person{
    String major;

    public Student(){

    }

    public Student(String major){
        this.major = major;
    }

    public void study(String major){
        System.out.println("ѧϰ��רҵ��" + major);
    }

    //�Ը�����eat����������д
    public void eat(){
        System.out.println("ѧ������Ӫ����ʳ��");
    }

    //������д
    public void show(){
        System.out.println("����һ��ѧ��");
    }

    public String test(){
        return null;
    }

}
