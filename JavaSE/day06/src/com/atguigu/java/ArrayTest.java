package com.atguigu.java;
/*
����ĸ���
һά�����ʹ��
��һά����������ͳ�ʼ��
����ε��������ָ��Ԫ��
����λ�ȡ����ĳ���
����α�������
������Ԫ�ص�Ĭ�ϳ�ʼֵ
��������ڴ����

 */
public class ArrayTest {
    public static void main(String[] args) {

        //��һά����������ͳ�ʼ��
        //��̬��ʼ��
        int[] ids = new int[]{1001,1002,1003,1004};
        //��̬��ʼ��
        String[] names = new String[5];

        names[0] = "wm";
        names[1] = "zyh";
        names[2] = "yc";
        names[3] = "hf";
        names[4] = "lyl";

        System.out.println(names.length);//5

        //����
        for(int i = 0;i < names.length;i++){
            System.out.println(names[i]);
        }


    }
}
