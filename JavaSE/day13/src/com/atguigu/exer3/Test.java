package com.atguigu.exer3;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.0,"white",2.0);
        Circle c2 = new Circle(2.0,"white",2.0);
        Circle c3 = new Circle(1.0,"black",2.0);

        System.out.println(c1.color.equals(c2.color));
        System.out.println(c1.equals(c3));
        System.out.println(c1.toString());
    }
}
