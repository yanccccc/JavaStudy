package com.atguigu.java;
/*
����Ԫ�ص�Ĭ�ϳ�ʼֵ
    ����Ԫ�������Σ�0
    ����Ԫ���Ǹ����ͣ�0.0
    ����Ԫ����char�ͣ�0��'\u0000'
    ����Ԫ����boolean�ͣ�false

    ����Ԫ����������������ʱ��null

������ڴ����
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        //����Ԫ�ص�Ĭ�ϳ�ʼֵ
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
