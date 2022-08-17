package com.atguigu.exer1;

public class Test {
    public static void main(String[] args) {
        Boy boy = new Boy("Tom",22);
        boy.shout();

        Girl girl = new Girl("Jerry",18);
        girl.marry(boy);

        Girl girl1 = new Girl("祝英台",19);
        int compare = girl.compare(girl1);
        System.out.println(compare);
    }
}
