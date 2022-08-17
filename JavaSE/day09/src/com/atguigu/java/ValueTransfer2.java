package com.atguigu.java;

public class ValueTransfer2 {
    public static void main(String[] args) {
        Data data = new Data();
        data.m = 10;
        data.n = 20;
        System.out.println("m = " + data.m + " ,n=" + data.n);

        ValueTransfer2 test = new ValueTransfer2();
        test.swap(data);
        System.out.println("m = " + data.m + " ,n=" + data.n);

        char[] c = new char[]{'a','b','c'};
        System.out.println(c);//abc不是地址值
    }

    public void swap(Data data){
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }
}
class Data{
    int m;
    int n;
}
