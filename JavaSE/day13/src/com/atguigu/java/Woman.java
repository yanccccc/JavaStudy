package com.atguigu.java;

public class Woman extends Person{

    boolean isBeauty;

    public void goShopping(){
        System.out.println("Ů��ϲ������");
    }

    @Override
    public void eat() {
        System.out.println("Ů���ٳ�Ϊ�˼���");
    }

    @Override
    public void walk() {
        System.out.println("Ů�������·");
    }
}
