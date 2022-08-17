package com.atguigu.exer;

public class Person {
    String name;
    int age;
    /**
     * sex=1标明为男；
     * sex=0标明为女；
     */
    int sex;

    public void study(){
        System.out.println("studying");
    }

    public void showAge(){
        System.out.println("当年年龄:" + age);
    }

    public int addAge(int i){
        age += i;
        return age;
    }
}
