package com.atguigu.java;

import org.junit.Test;

public class StringDemo3 {
    /*
    4.获取两个字符串中最大相同子串。比如：
    str1 = "abcwerthelloyuiodef“;str2 = "cvhellobnm"
    提示：将短的那个串进行长度依次递减的子串与较长的串比较。
     */

    public String getMaxSameString(String str1,String str2){
        if(str1 != null && str2 != null){
            String maxStr = (str1.length() >= str2.length())?str1:str2;
            String minStr = (str1.length() < str2.length())?str1:str2;

            if(maxStr.contains(minStr)){
                return minStr;
            }
            int length = minStr.length();
            for (int i = 0; i < length; i++) {

                for(int x = 0,y = length - i;y < length;x++,y++){
                    if(maxStr.contains(minStr.substring(x,y))){
                        return minStr.substring(x,y);
                    }
                }
            }
        }

        return null;
    }

    @Test
    public void test(){
        String str1 = "abcwerthello1yuiodef";
        String str2 = "cvhello1bnm";
        String maxSameString = getMaxSameString(str1, str2);
        System.out.println(maxSameString);
    }
}
