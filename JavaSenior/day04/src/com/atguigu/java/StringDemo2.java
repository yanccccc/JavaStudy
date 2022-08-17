package com.atguigu.java;

import org.junit.Test;

public class StringDemo2 {
    /*
    3.
    获取一个字符串在另一个字符串中出现的次数。
    比如：获取“ ab”在 “abkkcadkabkebfkabkskab” 中出现的次数
     */
    public static int getCount(String mainStr, String subStr) {
        int mainLength = mainStr.length();
        int subLength = subStr.length();
        int count = 0;
        int index = 0;

        if (mainLength >= subLength) {
//            方式一
//            while ((index = mainStr.indexOf(subStr)) != -1) { //找到该字符串在另一个字符串中出现的位置
//                count++;
//                mainStr = mainStr.substring(index + subLength);//将主串的搜索范围前移
//            }

            //方式二
            while ((index = mainStr.indexOf(subStr,index)) != -1){
                count++;
                index += subLength;
            }
        } else {
            count = 0;
        }

        return count;
    }

    @Test
    public void test(){
        //3
        String s4 = "abkkcadkabkebfkabkskab";
        String s5 = "ab";
        System.out.println(getCount(s4, s5));
    }
}
