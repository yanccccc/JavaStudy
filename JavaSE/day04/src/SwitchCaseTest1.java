/*
编写程序：从键盘上输入2019年的“month”和“day”，要求通过程序
输出输入的日期为2019年的第几天。
 */
import java.util.Scanner;
public class SwitchCaseTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份：(1-12)");
        int month = scanner.nextInt();
        System.out.println("请输入日期：(1-31)");
        int day = scanner.nextInt();

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
                sunDays += 28;
            case 2:
                sunDays += 31;
            case 1:
                sunDays += day;
        }
        System.out.println("2019年" + month + "月" + day + "日是当年的第" + sunDays + "天");
    }
}
