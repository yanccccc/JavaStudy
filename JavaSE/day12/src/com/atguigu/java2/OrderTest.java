package com.atguigu.java2;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.OrderDefault = 2;
        order.OrderProtected = 3;
        order.OrderPublic = 4;

        order.methodDefault();
        order.methodProtected();
        order.methodPublic();
    }
}
