package com.atguigu.java;
/*
һ���������������ĳ�Ա
���� = ��Ա���� = filed = ���ֶ�
���� = ��Ա���� = ���� = method

������Ͷ����ʹ��
1.�����ࡢ�����ĳ�Ա
2.������Ķ���
3.ͨ������.���Ե��ö���Ľṹ

�������������һ����Ķ������ÿ�����󶼶�����ӵ��һ���������(��static��)
��������޸�һ�����������a����Ӱ��������������ֵ
 */
//������
public class PersonTest {
    public static void main(String[] args) {
        //����Person��Ķ���
        Person p1 = new Person();

        //���ö���Ľṹ�����Ժͷ���
        p1.name = "Tom";
        p1.isMale = true;
        System.out.println(p1.name);

        //����
        p1.sleep();
        p1.talk("English");

        //********************
        Person p2 = new Person();
        System.out.println(p2.name);//null Ĭ�ϳ�ʼ��ֵ

        //********************
        Person p3 = p1;//��ֵַ��ֵ��p3
        System.out.println(p3.name);//Tom
    }

}

class Person{
    //����
    String name;
    int age;
    boolean isMale;
    //����
    public void eat(){
        System.out.println("�˿��ԳԷ�");
    }
    public void sleep(){
        System.out.println("�˿���˯��");
    }

    public void talk(String language){
        System.out.println("�˿���˵����˵����" + language);
    }

}
