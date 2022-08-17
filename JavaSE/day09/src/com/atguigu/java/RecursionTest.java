package com.atguigu.java;
/*
递归方法的使用

 */
public class RecursionTest {
    public static void main(String[] args) {
        RecursionTest test = new RecursionTest();
        int sum = test.getSum(100);

    }

    public int getSum(int n){//前n个数的和
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


