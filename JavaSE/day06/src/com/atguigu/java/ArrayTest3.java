package com.atguigu.java;
/*
��ά�����ʹ��
int [][] arr = new int[4][3];
���Ԫ��:arr[0],arr[1]��
�ڲ�Ԫ��:arr[0][0],arr[1][2]��

 */
public class ArrayTest3 {
    public static void main(String[] args) {
        int [][] arr = new int[4][3];
        System.out.println(arr[0]);//��ַ[I@1b6d3586
        System.out.println(arr[0][0]);

        int [][] arr1 = new int[4][];
        System.out.println(arr1[0]);//null
        //System.out.println(arr1[0][0]);//��ָ���쳣

    }
}
