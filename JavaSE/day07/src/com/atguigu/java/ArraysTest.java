package com.atguigu.java;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        //1.boolean equals(int[] a,int[] b)�ж����������Ƿ���ȡ�
        int[] arr1 = new int[]{1,2,3,4};
        int[] arr2 = new int[]{1,3,2,4};
        boolean isEquals = Arrays.equals(arr1, arr2);
        System.out.println(isEquals);

        //2.String toString(int[] a)���������Ϣ��
        System.out.println(Arrays.toString(arr1));

        //3.void fill(int[] a,int val)��ָ��ֵ��䵽����֮�С�
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));

        //4.void sort(int[] a)�������������
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //5. int binarySearch(int[] a,int key)��������������ж��ַ�����ָ����ֵ��
        int[] arr3 = new int[]{-98,-34,2,8,30,35,68,98,105,150};
        int index = Arrays.binarySearch(arr3, 22);
        System.out.println(index);

    }
}
