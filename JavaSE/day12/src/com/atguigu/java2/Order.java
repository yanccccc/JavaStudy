package com.atguigu.java2;

public class Order {

    private int OrderPrivate;
    int OrderDefault;
    protected int OrderProtected;
    public int OrderPublic;

    private void methodPrivate(){
        OrderPrivate = 1;
        OrderDefault = 2;
        OrderProtected = 3;
        OrderPublic = 4;

    }

    void methodDefault(){
        OrderPrivate = 1;
        OrderDefault = 2;
        OrderProtected = 3;
        OrderPublic = 4;
    }

    protected void methodProtected(){
        OrderPrivate = 1;
        OrderDefault = 2;
        OrderProtected = 3;
        OrderPublic = 4;
    }

    public void methodPublic(){
        OrderPrivate = 1;
        OrderDefault = 2;
        OrderProtected = 3;
        OrderPublic = 4;
    }
}
