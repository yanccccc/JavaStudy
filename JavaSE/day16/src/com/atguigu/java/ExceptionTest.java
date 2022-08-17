package com.atguigu.java;

import org.junit.Test;

import java.util.Date;
import java.util.Scanner;

/*
1.异常的体系结构

java.lang.Throwable
        -> java.lang.Error：一般不编写针对行的代码进行处理
        -> java.lang.Exception:可以进行异常的处理
            -> 编译时异常(checked)
                -> IOException
                    -> FileNotFoundException
                -> ClassNotFoundException
            -> 运行时异常(unchecked)
                -> NullPointerException
                -> ArrayIndexOutOfException
                -> ClassCastException //两个类型间转换不兼容时引发的运行时异常
                -> NumberFormatException  //数字格式异常
                -> InputMismatchException  //输入不匹配异常
                -> ArithmeticException
 */
public class ExceptionTest {


    //**********以下是运行时异常**************
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
