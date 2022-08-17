package com.atguigu.java;
/*
定义类KidsTest，在类的main方法中实例化Kids的对象someKid，用该对象访问其父类的成员变量及方法。
 */

public class KidsTest {
    public static void main(String[] args) {
        Kids someKid = new Kids(18);
        someKid.setSex(0);
        someKid.setSalary(3000);
        someKid.manOrWoman();
        someKid.employeed();
        someKid.printAge();


    }
}
