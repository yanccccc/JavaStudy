package com.atguigu.java;
/*
��ά�����ʹ��

�ٶ�ά����������ͳ�ʼ��
����ε��������ָ��Ԫ��
����λ�ȡ����ĳ���
����α�������
������Ԫ�ص�Ĭ�ϳ�ʼֵ
��������ڴ����
 */

public class ArrayTest2 {
    public static void main(String[] args) {
        //��̬��ʼ��
        int[][] arr1 = new int[][]{{1,2,3},{4,5},{7,8,9}};
        //��̬��ʼ��1
        String[][] arr2 = new String[3][2];
        //��̬��ʼ��2
        String[][] arr3 = new String[3][];

        //Ҳ����ȷ��д��
        int arr4[][] = new int[][]{{1,2,3},{4,5},{7,8,9}};
        int arr5[][] = {{1,2,3},{4,5},{7,8,9}};

        //��ε��������ָ��Ԫ��
        System.out.println(arr1[0][1]);
        arr3[1] = new String[4];
        System.out.println(arr3[1][0]);

        System.out.println(arr1.length);//3
        System.out.println(arr1[1].length);//2

        //����
        for(int i = 0;i < arr1.length;i++){
            for(int j = 0;j < arr1[i].length;j++){
                System.out.println(arr1[i][j]);
            }
        }


    }
}
