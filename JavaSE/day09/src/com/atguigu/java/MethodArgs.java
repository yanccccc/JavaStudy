package com.atguigu.java;
/*
可变个数的形参
 */
public class MethodArgs {
    public static void main(String[] args) {
        MethodArgs methodArgs = new MethodArgs();
        methodArgs.show(1);
        methodArgs.show("hello");
        methodArgs.show();
    }

    public void show(int i ){

    }

    public void show(String s ){
        System.out.println("s");
    }

    public void show(String ... s ){//可取0/1/2/3个
        System.out.println("可变形参");
    }
}
