package com.atguigu.java1;
/*
接口的使用
1.接口使用interface来定义
2.Java中，接口和类是并列的结构
3.如何定义接口：定义接口中的成员
    3.1 JDK7以以前：只能定义常量和抽象方法
        >全局常量：public static final的,书写时可以省略不写
        >抽象方法：public abstract的

    3.2 JDK8：除了定义常量和抽象方法之外，还可以定义静态方法、默认方法

4.接口中不能定义构造器！意味着接口不能被实例化

5.java中，接口通过让类去实现的方法来使用
    如果实现类覆盖了接口中的所有实例方法，则此类可以实例化
    如果实现类没有覆盖接口中的所有实例方法，则此类仍然是一个抽象类

6.Java类可以实现多个接口 ---> 弥补了Java的单继承性

7.接口与接口之间可以继承，可以多继承

8.接口具体的使用可以实现多态性

9.接口实际上可以看作一个规范

抽象类和接口有那些异同？
相同点：不能实例化，都可以被继承
不同点：抽象类有构造器。接口不能声明构造器
        抽象类是单继承，接口可以多继承

 */
public class InterfaceTest {
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.fly();
    }
}

interface Flyable{
    //全局常量
    public static final int MAX_SPEED = 7900;
    public static final int MIN_SPEED = 1;

    //抽象方法
    public abstract void fly();
    //省略了public abstract
    void stop();
}

interface Attackable{
    public abstract void attack();
}

class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("飞机起飞");
    }

    @Override
    public void stop() {
        System.out.println("飞机停止");
    }
}

abstract class Kite implements Flyable{

}

class Bullet implements Flyable,Attackable,CC{

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {

    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}

//****************

interface AA{
    void method1();
}

interface BB{
    void method2();
}

interface CC extends AA,BB{

}
