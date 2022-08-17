package com.atguigu.java;

import org.junit.Test;

import java.util.Date;
import java.util.Scanner;

/*
1.�쳣����ϵ�ṹ

java.lang.Throwable
        -> java.lang.Error��һ�㲻��д����еĴ�����д���
        -> java.lang.Exception:���Խ����쳣�Ĵ���
            -> ����ʱ�쳣(checked)
                -> IOException
                    -> FileNotFoundException
                -> ClassNotFoundException
            -> ����ʱ�쳣(unchecked)
                -> NullPointerException
                -> ArrayIndexOutOfException
                -> ClassCastException //�������ͼ�ת��������ʱ����������ʱ�쳣
                -> NumberFormatException  //���ָ�ʽ�쳣
                -> InputMismatchException  //���벻ƥ���쳣
                -> ArithmeticException
 */
public class ExceptionTest {


    //**********����������ʱ�쳣**************
    //NullPointerException
    @Test
    public void test1() {
        int[] arr = null;
        System.out.println(arr[0]);

    }


    //ArrayIndexOutOfException
    @Test
    public void test2() {
        int[] arr = new int[5];
        System.out.println(arr[5]);
    }

    //ClassCastException
    @Test
    public void test3(){
        Object obj = new Date();
        String str = (String) obj;
    }

    //NumberFormatException
    @Test
    public void test4(){
        String str = "123";
        str = "abc";
        int num = Integer.parseInt(str);
    }

    //InputMismatchException
    @Test
    public void test5(){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(i);
    }

    //ArithmeticException
    @Test
    public void test6(){
        int a = 10;
        int b = 0;
        System.out.println(a/b);
    }


}
