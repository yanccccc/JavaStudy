package com.atguigu.java;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderDefault = 1;
        order.orderPublic = 2;
        //除了Order类后，私有的属性就不可以调用了
        //order.orderPrivate = 3;


    }
}
