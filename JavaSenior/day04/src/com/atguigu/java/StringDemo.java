package com.atguigu.java;

import org.junit.Test;

import java.util.Arrays;

public class StringDemo {
    /*
    1. 模拟一个trim方法，去除字符串两端的空格。
     */
    public String trimDemo1(String str) {
        //自己写的
        int start = str.indexOf(' ');
        int end = str.lastIndexOf(' ');
        String s;

        char[] chars = str.toCharArray();
        int i = 0;//判定前面空格数量
        int j = chars.length - 1;//判定后面空格数量

        while (chars[i] == ' ' && chars[i + 1] == ' ') {
            i++;
        }

        while (chars[j] == ' ' && chars[j - 1] == ' ') {
            j--;
        }
        if (start != 0 && end != str.length() - 1) { //前后都没有空格
            s = str;
        } else if (start != 0 && end == str.length() - 1) { //前没有后有空格
            s = str.substring(i, j);
        } else if (start == 0 && end != str.length() - 1) { //前有后没有空格
            s = str.substring(i + 1, j + 1);
        } else {
            s = str.substring(i + 1, j);
        }
        return s;
    }
    public String trimDemo2(String str) {
        //老师写的
        if (str != null) {
            int start = 0;
            int end = str.length() - 1;

            while (start < end && str.charAt(start) == ' ') {
                start++;
            }
            while (start < end && str.charAt(end) == ' ') {
                end--;
            }

            if (str.charAt(start) == ' ') {
                return "";
            }

            return str.substring(start, end + 1);

        }
        return null;
    }

    @Test
    public void test() {
        //1
        String s1 = "  ab c  d e ";
        String trim = s1.trim();
        String trimDemo = trimDemo1(s1);
        System.out.println("trim()***" + trim);
        System.out.println("trimDemo()***" + trimDemo);
        System.out.println(trim.equals(trimDemo));

    }
}
