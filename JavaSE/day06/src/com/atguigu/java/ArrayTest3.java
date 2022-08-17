package com.atguigu.java;
/*
二维数组的使用
int [][] arr = new int[4][3];
外层元素:arr[0],arr[1]等
内层元素:arr[0][0],arr[1][2]等

 */
public class ArrayTest3 {
    public static void main(String[] args) {
        int [][] arr = new int[4][3];
        System.out.println(arr[0]);//地址[I@1b6d3586
        System.out.println(arr[0][0]);

        int [][] arr1 = new int[4][];
        System.out.println(arr1[0]);//null
        //System.out.println(arr1[0][0]);//空指针异常

    }
}
