package com.atguigu.java;
/*
�����βεĴ��ݻ��ƣ�ֵ����

1.�βΣ���������ʱ��������С�����ڵĲ���
  ʵ�Σ���������ʱ��ʵ�ʴ��ݸ��βε�ֵ
2.��������ǻ����������ͣ���ʱʵ�θ�ֵ�βε���ʵ�ε���ʵ����ֵ
  ��������������������ͣ���ʱʵ�θ�ֵ�βε���ʵ�εĵ�ֵַ


 */
public class ValueTransfer1 {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;

        System.out.println("m = " + m + " ,n=" + n);

        ValueTransfer1 test = new ValueTransfer1();
        test.swap(m,n);
        System.out.println("m = " + m + " ,n=" + n);
    }

    public void swap(int m,int n){
        int temp = m;
        m = n;
        n = temp;
        System.out.println("m = " + m + " ,n=" + n);
        System.out.println("****************swap");
    }
}
