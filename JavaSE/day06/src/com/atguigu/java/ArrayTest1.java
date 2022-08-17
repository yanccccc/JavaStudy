package com.atguigu.java;
/*
数组元素的默认初始值
    数组元素是整形：0
    数组元素是浮点型：0.0
    数组元素是char型：0或'\u0000'
    数组元素是boolean型：false

    数据元素是引用数据类型时：null

数组的内存解析
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        //数组元素的默认初始值
        int[] arr = new int[4];
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("*************");
        char[] arr1 = new char[4];
        for(int i = 0;i < arr1.length;i++){
            System.out.println(arr1[i]);
        }

        System.out.println("*************");
        String[] arr2 = new String[4];
        for(int i = 0;i < arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
