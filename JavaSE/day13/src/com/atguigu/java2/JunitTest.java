package com.atguigu.java2;

import org.junit.Test;

/*
Java中的单元测试

单元测试方法，方法的权限是public，没有返回值，没有形参
 */
public class JunitTest {


    @Test
    public void testEquals(){
        String s1 = "AA";
        String s2 = "AA";
        System.out.println(s1.equals(s2));
    }
}
