package com.atguigu.java;

import org.junit.Test;

public class StringDemo1 {
    /*
    2.
    将一个字符串进行反转。将字符串中指定部分进行反转。比如“abcdefg”反转为”abfedcg”
     */
    //方法一
    public String myReverse1(String str, int start, int end) { //前闭后开
        if(str != null){
            char temp;//交换
            char[] chars = str.toCharArray();
            int mid = (end + start) / 2;
            int low = start;
            int high = end;

            for (; low < mid; low++, high--) {
                temp = chars[low];
                chars[low] = chars[high - 1];
                chars[high - 1] = temp;
            }

            String s = new String(chars);
            return s;
        }else {
            return null;
        }

    }

    //方法二,将翻转的部分倒序增添，正常部分不动
    public String myReverse2(String str, int start, int end) { //前闭后开
        if(str != null){
            String reverseStr = str.substring(0,start);//取翻转前的
            for (int i = end - 1; i >= start; i--) {
                reverseStr += str.charAt(i);
            }
            reverseStr += str.substring(end);
            return reverseStr;
        }
        return null;
    }

    //方法三：使用StringBuffer或者StringBuilder
    public String myReverse3(String str, int start, int end) {  //前闭后开
        if(str != null){
            StringBuilder builder = new StringBuilder(str.length());
            builder.append(str.substring(0,start));
            for(int i = end - 1;i >= start;i--){
                builder.append(str.charAt(i));
            }
            builder.append(str.substring(end));
            return builder.toString();
        }
        return null;

    }

    @Test
    public void test(){
        //2
        String s2 = "abcdefg";
        String s3 = myReverse3(s2, 0, 6);
        System.out.println(s3);
    }
}
