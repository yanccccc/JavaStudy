package com.atguigu.java;
/*
�ݹ鷽����ʹ��

 */
public class RecursionTest {
    public static void main(String[] args) {
        RecursionTest test = new RecursionTest();
        int sum = test.getSum(100);

    }

    public int getSum(int n){//ǰn�����ĺ�
        if(n == 1){
            return 1;
        }else {
            return n + getSum(n -  1);
        }
    }

    public int getSum1(int n){//n!
        if(n == 1){
            return 1;
        }else {
            return n * getSum(n -  1);
        }
    }


}


