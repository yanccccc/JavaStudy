package com.atguigu.java;
/*
数组的概述
一维数组的使用
①一维数组的声明和初始化
②如何调用数组的指定元素
③如何获取数组的长度
④如何遍历数组
⑤数组元素的默认初始值
⑥数组的内存解析

 */
public class ArrayTest {
    public static void main(String[] args) {

        //①一维数组的声明和初始化
        //静态初始化
        int[] ids = new int[]{1001,1002,1003,1004};
        //动态初始化
        String[] names = new String[5];

        names[0] = "wm";
        names[1] = "zyh";
        names[2] = "yc";
        names[3] = "hf";
        names[4] = "lyl";

        System.out.println(names.length);//5

        //遍历
        for(int i = 0;i < names.length;i++){
            System.out.println(names[i]);
        }


    }
}
