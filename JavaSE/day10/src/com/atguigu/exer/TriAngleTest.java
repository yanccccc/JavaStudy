package com.atguigu.exer;

public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle triAngle = new TriAngle(5,4);
        double area = 0.5 * triAngle.getBase() * triAngle.getHeight();
        System.out.println("��Ϊ" + triAngle.getBase() + ",��Ϊ" + triAngle.getHeight() + "�����������Ϊ" + area);
    }
}
