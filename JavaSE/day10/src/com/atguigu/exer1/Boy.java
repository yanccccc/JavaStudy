package com.atguigu.exer1;

public class Boy {
    private String name;
    private int age;

    public Boy() {
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void marry(Girl girl){
        System.out.println("����Ȣ" + girl.getName());
    }

    public void shout(){
        if(age >= 22){
            System.out.println("����ԵǼǽ��");
        }else {
            System.out.println("��̸̸����");
        }
    }
}

