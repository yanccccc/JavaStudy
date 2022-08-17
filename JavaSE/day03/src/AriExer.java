/*
随意给出一个整数，打印显示它的个位数，十位数，百位数的值。
格式如下：
数字xxx的情况如下：
个位数：
十位数：
百位数：
例如：
数字153的情况如下：
个位数：3
十位数：5
百位数：1
 */

import java.util.Scanner;

public class AriExer {
    public static void main(String[] args) {
        int number = 153;
        int a[] = new int[10];
        for(int i = 0;i < 3;i++){
            a[i] = number % 10;
            number = number / 10;
        }
        System.out.println("数字153的情况如下：");
        System.out.println("个位数：" + a[0]);
        System.out.println("十位数：" + a[1]);
        System.out.println("百位数：" + a[2]);
    }
}
