package com.atguigu.exer;

public class Person {
    String name;
    int age;
    /**
     * sex=1����Ϊ�У�
     * sex=0����ΪŮ��
     */
    int sex;

    public void study(){
        System.out.println("studying");
    }

    public void showAge(){
        System.out.println("��������:" + age);
    }

    public int addAge(int i){
        age += i;
        return age;
    }
}
