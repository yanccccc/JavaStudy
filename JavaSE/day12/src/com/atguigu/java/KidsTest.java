package com.atguigu.java;
/*
������KidsTest�������main������ʵ����Kids�Ķ���someKid���øö�������丸��ĳ�Ա������������
 */

public class KidsTest {
    public static void main(String[] args) {
        Kids someKid = new Kids(18);
        someKid.setSex(0);
        someKid.setSalary(3000);
        someKid.manOrWoman();
        someKid.employeed();
        someKid.printAge();


    }
}
