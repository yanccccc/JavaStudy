package com.atguigu.Java2;
/*
this�ؼ��ֵ�ʹ��
1.this�����������Σ����ԡ�������������

2.this��������
    this���Ϊ����ǰ����

    ����ķ����У����ǿ���ʹ��"this.����"��"this.����"���õ�ǰ�����Ի򷽷�
    ͨ������£����Ƕ�ѡ��ʡ��"this"����������£�����������βκ��������ͬ��ʱ�����Ǳ�����ʾ��
    ʹ��"this",���������������ԣ������βΡ�

3.this���ù�����
    3.1 ��������Ĺ������У�������ʾ��ʹ��"this(�β��б�)"��ʽ�����ñ�����ָ��������������
    3.2 �������в���ͨ��"this(�β��б�)"��ʽ�����Լ�
    3.3 ���һ��������n�����������������n-1��������ʹ��"this(�β��б�)"
    3.4 "this(�β��б�)"���������ڹ�����������
    3.5 �������ڲ������ֻ������һ��"this(�β��б�)"�ķ�ʽ������������������

 */
public class PeersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(2);
        System.out.println(p.getAge());
        p.eat();
    }
}

class Person{
    private String name;
    private int age;

    public Person(){
        this.eat();
        //40�д���
    }

    public Person(String name){
        this();
        this.name = name;

    }

    public Person(int age){
        this.age = age;
    }

    public Person(String name,int age){
        this(age);
        this.name = name;
        //this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void eat(){
        System.out.println("�˳Է�");
        study();
    }

    public void study(){
        System.out.println("��ѧϰ");
    }

}
