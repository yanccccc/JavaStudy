package com.atguigu.exer;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        double volume = cylinder.findVolume();
        System.out.println("半径为" + cylinder.getRadius() + "高为" +cylinder.getLength() +  "的圆柱体积为" + volume);

        cylinder.setRadius(2);
        volume = cylinder.findVolume();
        System.out.println("半径为" + cylinder.getRadius() + "高为" +cylinder.getLength() +  "的圆柱体积为" + volume);

    }

}
