package com.atguigu.java;
/*
排序算法
 */
public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1,-4,8,10,3,65,87,41,9,99};
        //冒泡排序从小到大
        for(int i = 0;i < arr.length - 1;i++){
            for(int j = 0;j < arr.length - i - 1;j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        //打印
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
