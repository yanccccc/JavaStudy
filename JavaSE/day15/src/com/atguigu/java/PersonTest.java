package com.atguigu.java;
/*
���������������ʹ��
 */
public class PersonTest {
    public static void main(String[] args) {
        method(new Student());

        Work work = new Work();
        method1(work);//����������������Ķ���

        method1(new Work());//���������������Ķ���

        //�����������
        Person p = new Person() {
            @Override
            public void eat() {
                System.out.println("��������ĳԶ���");
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
        System.out.println("���˳Զ���");
    }
}
