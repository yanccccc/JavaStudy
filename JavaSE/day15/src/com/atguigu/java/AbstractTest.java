package com.atguigu.java;
/*
abstract�ؼ��ֵ�ʹ��

abstract�����������εĽṹ���ࡢ����

abstract�����ࣺ������
    > ���಻��ʵ����
    > ��������һ���й������������������ʵ��������
    > �����У������ṩ����������࣬���������ʵ�����������صĲ���

abstract���η���
    > ���󷽷�ֻ�з�����������û�з�����
    > �������󷽷����࣬һ���ǳ����ࡣ��֮���������п���û�г��󷽷��ġ�
    > ��������д�˸��������еĳ��󷽷��󣬴�����ſ���ʵ����
    > ����û����д���������еĳ��󷽷��󣬴����໹��һ��������
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

    //���󷽷�
    public abstract void eat();

    public void walk(){
        System.out.println("��·");
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
        System.out.println("ѧ�������Ӫ����ʳ��");
    }
}
