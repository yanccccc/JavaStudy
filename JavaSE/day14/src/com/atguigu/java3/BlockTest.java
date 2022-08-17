package com.atguigu.java3;
/*
�����

1.���������ã�������ʼ���ࡢ����
2.��������������ֻ����static
3.���ࣺ��̬����� vs �Ǿ�̬�����

4.��̬�����
    >�ڲ�������������
    >������ļ��ض�ִ��,����ִֻ��һ��
    >���ã���ʼ�������Ϣ
    >��̬�������ֻ�ܵ��þ�̬�����Ժͷ��������ܵ��÷Ǿ�̬�����Ժͷ���

5.�Ǿ�̬�����
    >�ڲ�������������
    >���Ŷ���Ĵ�����ִ��
    >ÿ����һ�������ִ��һ��
    >�����ڴ�������ʱ���Զ�������Խ��г�ʼ��
    >�Ǿ�̬������ڿ��Ե��þ�̬�����Ժͷ�����Ҳ���Ե��÷Ǿ�̬�����Ժͷ���
 */
public class BlockTest {
    public static void main(String[] args) {
        String desc = Person.desc;
        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(desc);

    }
}

class Person{
    String name;
    int age;
    static String desc = "����һ����";

    public Person(){

    }

    //������
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("�Է�");
    }

    //��̬�����
    static {
        System.out.println("hello,static block");
        desc = "����һ����ѧϰ����";
    }

    //�Ǿ�̬�����
    {
        System.out.println("hello,block");
    }

    public static void info(){
        System.out.println("����һ�����ֵ���");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}