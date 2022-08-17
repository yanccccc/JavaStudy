package com.atguigu.java4;

public class Man extends Person{
    boolean isSmoking;

    public void earnMoney(){
        System.out.println("男人负责赚钱养家");
    }

    @Override
    public void eat() {
        System.out.println("男人多吃肉");
    }

    @Override
    public void walk() {
        System.out.println("男人霸气的走路");
    }
}

