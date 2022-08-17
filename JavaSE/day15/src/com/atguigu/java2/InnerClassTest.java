package com.atguigu.java2;
/*
��ĳ�Ա֮�壺�ڲ���
1.Java������һ����A��������һ����B�У�����A���ڲ��࣬��B���ⲿ��

2.�ڲ���ķ��ࣺ��Ա�ڲ��ࣨ��̬���Ǿ�̬�� vs �ֲ��ڲ���

3.��Ա�ڲ��ࣺ
    һ���棬��Ϊ�ⲿ��ĳ�Ա��
        > �����ⲿ��Ľṹ
        > ������static����
        > ���Ա�4�ֲ�ͬ��Ȩ������

    ��һ���棬��Ϊһ���ࣺ
        > ����Զ������ԡ�������������
        > ���Ա�final���Σ���ʾ���಻�ܱ��̳�
        > ���Ա�abstract����

4.��ע���µ�3������
    4.1 ���ʵ������Ա�ڲ������
    4.2 ����ڳ�Ա�ڲ��������ֵ����ⲿ��Ľṹ
    4.3 �����оֲ��ڲ����ʹ��
 */
public class InnerClassTest {
    public static void main(String[] args) {

        //����Dogʵ������̬��Ա�ڲ��ࣩ
        Person.Dog dog = new Person.Dog();
        dog.show();
        //����Birdʵ�����Ǿ�̬��Ա�ڲ��ࣩ
        Person p = new Person();
        Person.Bird bird = p.new Bird();
        bird.sing();

        System.out.println("***********");
        bird.display("�β�");
    }
}

class Person {

    String name = "Person";
    int age;

    public void eat(){
        System.out.println("�˳Է�");
    }

    //��̬��Ա�ڲ���
    static class Dog{
        String name;
        int age;

        public void show(){
            System.out.println("��������");
        }

    }

    //�Ǿ�̬��Ա�ڲ���
    final class Bird{
        String name = "Bird";

        public void sing(){
            System.out.println("����һֻСС��");
            eat();
            System.out.println(age);
        }

        public void display(String name){
            System.out.println(name);//�������β�
            System.out.println(this.name);//�ڲ��������
            System.out.println(Person.this.name);//�ⲿ�������
        }
    }



    public void method(){
        //�ֲ��ڲ���
        class AA{

        }
    }

    {
        //�ֲ��ڲ���
        class BB{

        }
    }
}
