package com.atguigu.java;

import org.junit.Test;

import java.util.Arrays;

public class StringDemo4 {
    /*
    5.
    对字符串中字符进行自然顺序排序。
    提示：
    1）字符串变成字符数组。
    2）对数组排序，选择，冒泡，Arrays.sort();
    3）将排序后的数组变成字符串。
     */
    public static String sortStr(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sortStr = new String(chars);
        return sortStr;
    }

    @Test
    public void test(){
        //5
        String s6 = "ahsdlas";
        String s7 = sortStr(s6);
        System.out.println(s7);
    }
}
