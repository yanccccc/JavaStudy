package com.atguigu.java8;
/*
JDK8：除了定义常量和抽象方法之外，还可以定义静态方法、默认方法
 */
interface CompareA {

    //静态方法
    public static void method(){
        System.out.println("Compare湖北");
    }

    //默认方法
    public default void method2(){
        System.out.println("Compare武汉");
    }

    default void method3(){
        System.out.println("Compare鄂州");
    }
}
