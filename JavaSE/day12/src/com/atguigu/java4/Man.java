package com.atguigu.java4;

public class Man extends Person{
    boolean isSmoking;

    public void earnMoney(){
        System.out.println("���˸���׬Ǯ����");
    }

    @Override
    public void eat() {
        System.out.println("���˶����");
    }

    @Override
    public void walk() {
        System.out.println("���˰�������·");
    }
}

