package com.atguigu.java;

/*
������������֮һ����װ������

��װ�Ե����֣���ҪȨ�����η�����ϡ�
1.Java�涨��4��Ȩ�ޣ���С�������У���private,ȱʡ,protected,public
2.4��Ȩ�޿������������༰����ڲ��ṹ�����ԡ����������������ڲ���
3.����ģ�4��Ȩ�޶�����������������ڲ��ṹ�����ԡ����������������ڲ���
��       ������Ļ�ֻ���ã�ȱʡ��public
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
//        animal.name = "���";
//        animal.age = 1;
//        animal.legs = 2;
        animal.setLegs(6);
        animal.setName("���");
        animal.setAge(1);
        animal.show();
    }
}

class Animal {
    private String name;
    private int age;
    private int legs;

    //�������Ե�����
    public void setLegs(int l) {
        if (l >= 0 && l % 2 == 0) {
            legs = l;
        } else {
            legs = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //�������ԵĻ�ȡ
    public int getLegs() {
        return legs;
    }


    public void eat() {
        System.out.println("�����ʳ");
    }

    public void show() {
        System.out.println("name:" + name + ", age:" + age + ", legs:" + legs);
    }
}
