package com.atguigu.exer;

public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle triAngle = new TriAngle(5,4);
        double area = 0.5 * triAngle.getBase() * triAngle.getHeight();
        System.out.println("底为" + triAngle.getBase() + ",高为" + triAngle.getHeight() + "的三角形面积为" + area);
    }
}
