package com.atguigu.java;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 涉及到String类与其他结构之间的转换
 */
public class StringTest1 {
    /*
    String与byte[]之间的转换
    String --> byte[]:调用String的getBytes()
    byte[] --> String:调用String的构造器
     */
    @Test
    public void test3() throws UnsupportedEncodingException {
        String s1 = "abc123中国";
        byte[] bytes = s1.getBytes();//使用默认的字符集进行转换

        System.out.println(Arrays.toString(bytes));
        byte[] gbks = s1.getBytes("gbk");
        System.out.println(Arrays.toString(gbks));

        System.out.println("***********");
        String s2 = new String(bytes);
        String s3 = new String(gbks);
        System.out.println(s2);
        System.out.println(s3);

        String gbk = new String(gbks, "gbk");
        System.out.println(gbk);


    }

    /*
    String与char[]之间的转换

    String --> char[]:调用String的toCharArray()方法
    char[] --> String:调用String的构造器
     */
    @Test
    public void test2(){
        String s1 = "abcde";
        char[] chars = s1.toCharArray();

        System.out.println(Arrays.toString(chars));
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        char[] chars1 = new char[]{'h','e','l','l','o'};
        String s = new String(chars1);
        System.out.println(s);
    }





    /*
    String与基本数据类型、包装类之间的转换
    String --> 基本数据类型，调用包装类的静态方法,parsexxx
    基本数据类型 --> String:调用String的重载方法valueof(xxx)
     */
    @Test
    public void test1(){
        String s1 = "123";
        int num = Integer.parseInt(s1);

        String s2 = String.valueOf(num);
        String s3 = num + "";

        System.out.println(s1 == s3);


    }
}
