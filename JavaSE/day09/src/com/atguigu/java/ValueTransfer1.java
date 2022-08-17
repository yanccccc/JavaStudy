package com.atguigu.java;
/*
方法形参的传递机制：值传递

1.形参：方法定义时，声明的小括号内的参数
  实参：方法调用时，实际传递给形参的值
2.如果参数是基本数据类型，此时实参赋值形参的是实参的真实数据值
  如果参数是引用数据类型，此时实参赋值形参的是实参的地址值


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
