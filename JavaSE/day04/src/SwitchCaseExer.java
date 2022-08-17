/*
从键盘分别输入年、月、日，判断这一天是当年的第几天
注：判断一年是否是闰年的标准：
1）可以被4整除，但不可被100整除
或
2）可以被400整
 */
import java.util.Scanner;
public class SwitchCaseExer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scanner.nextInt();
        System.out.println("请输入月份:(1-12)");
        int month = scanner.nextInt();
        System.out.println("请输入日期：(1-31)");
        int day = scanner.nextInt();
        int gapyear = 28;
        if(year % 4 == 0 && year % 100 != 0 ){
            gapyear = 29;
        }else if(year % 400 == 0){
            gapyear = 29;
        }

        //定义一个变量保存总天数
        int sunDays = 0;
        switch (month){
            case 12:
                sunDays += 30;
            case 11:
                sunDays += 31;
            case 10:
                sunDays += 30;
            case 9:
                sunDays += 31;
            case 8:
                sunDays += 31;
            case 7:
                sunDays += 30;
            case 6:
                sunDays += 31;
            case 5:
                sunDays += 30;
            case 4:
                sunDays += 31;
            case 3:
                sunDays += gapyear;
            case 2:
                sunDays += 31;
            case 1:
                sunDays += day;
        }
        System.out.println(year + "年" + month + "月" + day + "日是当年的第" + sunDays + "天");

    }
}
