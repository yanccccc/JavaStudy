package com.atguigu.java;
/*
二维数组的使用

①二维数组的声明和初始化
②如何调用数组的指定元素
③如何获取数组的长度
④如何遍历数组
⑤数组元素的默认初始值
⑥数组的内存解析
 */

public class ArrayTest2 {
    public static void main(String[] args) {
        //静态初始化
        int[][] arr1 = new int[][]{{1,2,3},{4,5},{7,8,9}};
        //动态初始化1
        String[][] arr2 = new String[3][2];
        //动态初始化2
        String[][] arr3 = new String[3][];

        //也是正确的写法
        int arr4[][] = new int[][]{{1,2,3},{4,5},{7,8,9}};
        int arr5[][] = {{1,2,3},{4,5},{7,8,9}};

        //如何调用数组的指定元素
        System.out.println(arr1[0][1]);
        arr3[1] = new String[4];
        System.out.println(arr3[1][0]);

        System.out.println(arr1.length);//3
        System.out.println(arr1[1].length);//2

        //遍历
        for(int i = 0;i < arr1.length;i++){
            for(int j = 0;j < arr1[i].length;j++){
                System.out.println(arr1[i][j]);
            }
        }


    }
}
