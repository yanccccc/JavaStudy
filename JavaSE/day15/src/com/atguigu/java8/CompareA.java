package com.atguigu.java8;
/*
JDK8�����˶��峣���ͳ��󷽷�֮�⣬�����Զ��徲̬������Ĭ�Ϸ���
 */
interface CompareA {

    //��̬����
    public static void method(){
        System.out.println("Compare����");
    }

    //Ĭ�Ϸ���
    public default void method2(){
        System.out.println("Compare�人");
    }

    default void method3(){
        System.out.println("Compare����");
    }
}
