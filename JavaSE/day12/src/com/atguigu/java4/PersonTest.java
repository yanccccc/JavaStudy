package com.atguigu.java4;
/*
�����������֮������̬��

1.�����̬�ԣ���������Ϊһ������Ķ�����̬
2.��Ϊ��̬�ԣ�
        ����Ķ�̬�ԣ����������ָ������Ķ���
3.��̬��ʹ�ã����ⷽ���ĵ���
        ���˶���Ķ�̬���Ժ������ڱ�����ֻ�ܵ��ø��������ķ��������������ڣ�����ʵ��ִ�еĵ���������д����ķ���
        �ܽ᣺���뿴��ߣ�ִ�п��ұ�
4.��̬�Ե�ʹ��ǰ��
        4.1 Ҫ����ļ̳й�ϵ
        4.2 ��������д

5.����Ķ�̬��ֻ�����뷽��������������
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();

        Man man = new Man();
        man.eat();
        man.age = 22;
        man.earnMoney();
        System.out.println("**************");

        //*************************
        //��̬�ԣ����������ָ������Ķ���
        Person p2 = new Man();
        //��̬��ʹ�ã��������Ӹ���ͬ��ͬ�����ķ���ʱ��ʵ��ִ�е���������д����ķ���--���ⷽ������
        p2.eat();
        p2.walk();

        //p2.earnMoney();

    }
}