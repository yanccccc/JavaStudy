package com.atguigu.java;

import org.junit.Test;

/*
try - catch -finally中finally的使用

1.finally是可选的
2.finally中声明的是一定会被执行的代码，即使catch中又出现异常了或try中有执行语句
3.像数据库链接、输入输出流、网络编程Socket等资源，JVM是不能自动回收的，我们需要手动进行资源的释放。
此时的资源释放就需要声明在finally中

 */
public class FinallyTest {

    @Test
    public void test1(){
        try {
            int a = 10;
            int b = 0;
            System.out.println(a/b);
        }catch (ArithmeticException e){
//            e.printStackTrace();
            int[] arr = new int[5];
            System.out.println(arr[5]);
        }catch (Exception e){
            e.printStackTrace();
        } finally{
            System.out.println("cool~~~中文");
        }

        System.out.println("cool");
    }
}
