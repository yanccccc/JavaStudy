package com.atguigu.java;
/*

关于变量的赋值
    如果变量是基本数据类型，此时赋值的是变量所保存的数据值
    如果变量是引用数据类型，此时赋值的是变量所保存的数据的地址值

 */

public class ValueTransfer {
    public static void main(String[] args) {

        System.out.println("**********基本数据类型**********");
        int m = 10;
        int n = m;

        System.out.println("m = " + m + " ,n=" + n);

        n = 20;

        System.out.println("m = " + m + " ,n=" + n);

        System.out.println("**********引用数据类型**********");

        Order order1 = new Order();
        order1.ordetId = 1001;
        Order order2 = order1;

        System.out.println("Order1.id = " + order1.ordetId + " ,Order2.id=" + order2.ordetId);

        order2.ordetId = 1002;
        System.out.println("Order1.id = " + order1.ordetId + " ,Order2.id=" + order2.ordetId);
    }
}

class Order{
    int ordetId;
}
