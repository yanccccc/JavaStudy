package com.atguigu.java1;

import com.atguigu.java.Order;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderPublic = 2;

        //出了Order类所属的包以后，私有的属性和缺省的就不可以调用了
        //order.orderDefault = 1;

        //出了Order类后，私有的属性就不可以调用了
        //order.orderPrivate = 3;
    }
}
