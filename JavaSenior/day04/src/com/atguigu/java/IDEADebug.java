package com.atguigu.java;

import org.junit.Test;

public class IDEADebug {
    @Test
    public void test(){
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);//
        System.out.println(sb.length());//
        System.out.println(sb);//
        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);//
    }

}
