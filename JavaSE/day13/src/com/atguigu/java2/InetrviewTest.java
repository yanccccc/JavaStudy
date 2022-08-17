package com.atguigu.java2;

import org.junit.Test;

public class InetrviewTest {
    //
    @Test
    public void method1() {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);//false

        //Integer内部定义了IntegerCache结构，保存了-128~127范围的整数。如果我们使用自动装箱的方式，
        //给Integer赋值在-128~127范围内，可以使用数组中的元素，不用再去new了
        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);//true
        Integer x = 128;//相当于new了一个-128~127对象
        Integer y = 128;
        System.out.println(x == y);//false
    }
}
