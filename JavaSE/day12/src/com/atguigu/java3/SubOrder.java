package com.atguigu.java3;

import com.atguigu.java2.Order;

public class SubOrder extends Order {

    public void method() {
        OrderProtected = 3;
        OrderPublic = 4;

        methodProtected();
        methodPublic();
    }
}
