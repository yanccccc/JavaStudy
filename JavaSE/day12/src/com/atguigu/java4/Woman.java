package com.atguigu.java4;

public class Woman extends Person{

    boolean isBeauty;

    public void goShopping(){
        System.out.println("女人喜欢购物");
    }

    @Override
    public void eat() {
        System.out.println("女人少吃为了减肥");
    }

    @Override
    public void walk() {
        System.out.println("女人窈窕的走路");
    }
}
