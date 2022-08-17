/*
从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入
为0时结束程序。
 */
import java.util.Scanner;
public class ForWhileTest {
    public static void main(String[] args) {
        int count1 = 0;//正数
        int count2 = 0;//负数
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("请输入整数(输入0时结束):");
            int i = scan.nextInt();
            if(i > 0){
                count1++;
            }else if(i < 0){
                count2++;
            }else
                break;
        }
        System.out.println("输入的正数有" + count1 + "个");
        System.out.println("输入的负数有" + count1 + "个");
    }
}
