package com.atguigu.exer2;
/*
����һ��������InterfaceTest����������ComparableCircle���󣬵���compareTo
�����Ƚ�������İ뾶��С��

 */
public class InterfaceTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(1.2);
        ComparableCircle c2 = new ComparableCircle(0.5);
        int i = c1.compareTo(c2);
        if(i > 0){
            System.out.println("c1�뾶��");
        }else if(i == 0){
            System.out.println("����Բ�뾶һ����");
        }else {
            System.out.println("c2�뾶��");
        }


    }
}
