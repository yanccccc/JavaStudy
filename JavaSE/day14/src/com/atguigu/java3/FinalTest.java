package com.atguigu.java3;
/*
final:最终的

1.final可以用来修饰的结构：类、方法、变量
2.final可以用来修饰一个类：此类不能被其他类继承
                        String类、System类、StringBuffer类

3.final用来修饰方法：表明此方法不可以被重写

4.final用来修饰变量：此时的变量就成为是一个常量
        4.1 final修饰属性，可以考虑赋值的位置有：显式初始化、代码块、构造器
        4.2 final修饰局部变量:
            尤其是final修饰形参时，表明形参是一个常量。当我们调用此方法时，给常量赋一个实参，
            一旦赋值以后，就只能在方法体内使用此形参，但不能重新赋值。


static final 用来修饰属性：全局常量


 */
public class FinalTest {

    final int WIDTH = 0;
    final int LEFT;
    final int RIGHT;
    {
        LEFT = 1;
    }

    public FinalTest(){
        RIGHT = 2;
    }

    public static void main(String[] args) {
        final int num = 10;

//        num += 5;
    }
}

final class FinalA{

}

class AA{
    public final void show(){

    }
}

class BB extends AA{

//    public void show() {
//
//    }
}

