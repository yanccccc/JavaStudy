package com.atguigu.exer;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.r = 2;
        circle.area();
    }
}

class Circle{
    double r;
    public void area(){
        double area = Math.PI * r * r;
        System.out.println("圆的面积是" + area);
    }

}
