package com.atguigu.java;
//static关键字的应用
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        Circle c2 = new Circle();

        Circle c3 = new Circle(3.4);

        System.out.println("c1的id：" + c1.getId());
        System.out.println("c2的id：" + c2.getId());
        System.out.println("c3的id：" + c3.getId());

        System.out.println("创建圆的个数为：" + Circle.getTotal());

    }

}

class Circle{
    private double radius;
    private int id;

    public Circle(){
        id = init++;
        total++;
    }

    public Circle(double radius){
        this();
        this.radius = radius;
    }

    private static int total;//创建圆的个数
    private static int init = 1001;//所有对象共享

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getTotal() {
        return total;
    }

    public double findArea(){
        return Math.PI * radius * radius;
    }
}
