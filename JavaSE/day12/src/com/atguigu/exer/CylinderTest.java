package com.atguigu.exer;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        double volume = cylinder.findVolume();
        System.out.println("�뾶Ϊ" + cylinder.getRadius() + "��Ϊ" +cylinder.getLength() +  "��Բ�����Ϊ" + volume);

        cylinder.setRadius(2);
        volume = cylinder.findVolume();
        System.out.println("�뾶Ϊ" + cylinder.getRadius() + "��Ϊ" +cylinder.getLength() +  "��Բ�����Ϊ" + volume);

    }

}
