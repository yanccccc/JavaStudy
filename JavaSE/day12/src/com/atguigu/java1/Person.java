package com.atguigu.java1;

public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("�Է�");
    }

    public void walk(int distance){
        System.out.println("��·,�ߵľ�����" + distance + "����");
        show();
    }

    private void show(){
        System.out.println("����һ����");
    }
    public Object test(){
        return null;
    }
}
