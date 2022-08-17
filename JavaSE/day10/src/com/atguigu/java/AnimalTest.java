package com.atguigu.java;

/*
面向对象的特征之一：封装与隐藏

封装性的体现，需要权限修饰符来配合。
1.Java规定的4种权限（从小到大排列）：private,缺省,protected,public
2.4种权限可以用来修饰类及类的内部结构：属性、方法、构造器、内部类
3.具体的，4种权限都可以用来修饰类的内部结构：属性、方法、构造器、内部类
、       修饰类的话只能用：缺省、public
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
//        animal.name = "大黄";
//        animal.age = 1;
//        animal.legs = 2;
        animal.setLegs(6);
        animal.setName("大黄");
        animal.setAge(1);
        animal.show();
    }
}

class Animal {
    private String name;
    private int age;
    private int legs;

    //对于属性的设置
    public void setLegs(int l) {
        if (l >= 0 && l % 2 == 0) {
            legs = l;
        } else {
            legs = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //对于属性的获取
    public int getLegs() {
        return legs;
    }


    public void eat() {
        System.out.println("动物进食");
    }

    public void show() {
        System.out.println("name:" + name + ", age:" + age + ", legs:" + legs);
    }
}
