package com.atguigu.java1;
/*
��Ľṹ֮���������������췽����constructor����ʹ��

һ�������������ã�
1.��������
2.��ʼ�����������

����˵��
1.���û����ʾ�Ķ�����Ĺ���������ϵͳ��Ĭ���ṩһ���ղεĹ�����
2.���幹�����ĸ�ʽ��Ȩ�����η� ����(�β��б�){}
3.һ�����еĶ����������������
4.һ����ʾ�Ķ�������Ĺ�������ϵͳ�����ṩĬ�ϵĿղι�����
5.һ�����У�������һ��������

 */
public class PersonTest {
    public static void main(String[] args) {
        //������Ķ���new + ������
        Person p = new Person();
        p.eat();
    }
}

class Person{
    //����
    String name;
    int age;
    //������
    public Person(){
        System.out.println("Person()....");
    }

    //����
    public void eat(){
        System.out.println("�˳Է�");
    }

    public void study(){
        System.out.println("�˿���ѧϰ");
    }
}
