package com.atguigu.java;
/*

���ڱ����ĸ�ֵ
    ��������ǻ����������ͣ���ʱ��ֵ���Ǳ��������������ֵ
    ��������������������ͣ���ʱ��ֵ���Ǳ�������������ݵĵ�ֵַ

 */

public class ValueTransfer {
    public static void main(String[] args) {

        System.out.println("**********������������**********");
        int m = 10;
        int n = m;

        System.out.println("m = " + m + " ,n=" + n);

        n = 20;

        System.out.println("m = " + m + " ,n=" + n);

        System.out.println("**********������������**********");

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
