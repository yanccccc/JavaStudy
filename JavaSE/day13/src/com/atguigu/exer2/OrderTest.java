package com.atguigu.exer2;

public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order(1001,"Tom");
        Order order2 = new Order(1001,"To");


        System.out.println(order1.equals(order2));

        String s1 = new String("AA");
        String s2 = new String("AA");

        String s3 = "AA";
        String s4 = "AA";

        System.out.println(s1==s2);//false
        System.out.println(s3==s4);//true

    }




}
