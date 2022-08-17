/*
编写程序：由键盘输入三个整数分别存入变量num1、num2、num3，
对它们进行排序(使用 if-else if-else),并且从小到大输出。

 */
import java.util.Scanner;
public class IfTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请分别输入3个整数:");
        System.out.println("整数1为：");
        int num1 = scanner.nextInt();
        System.out.println("整数2为：");
        int num2 = scanner.nextInt();
        System.out.println("整数3为：");
        int num3 = scanner.nextInt();
        int temp = num1;
        if (num1 < num2) {
            if(num2 < num3) { //123
                System.out.println("从小到大的顺序为:" + num1 + "," + num2 + ","  + num3);
            }else if(num1 < num3){//132
                System.out.println("从小到大的顺序为:" + num1 + "," + num3 + ","  + num2);
            }else{//312
                System.out.println("从小到大的顺序为:" + num3 + "," + num1 + ","  + num2);
            }
        }
        else { //1>2
            if (num1 < num3) { //213
                System.out.println("从小到大的顺序为:" + num2 + "," + num1 + "," + num3);
            } else if (num2 < num3) {//231
                System.out.println("从小到大的顺序为:" + num2 + "," + num3 + "," + num1);
            } else {//321
                System.out.println("从小到大的顺序为:" + num3 + "," + num2 + "," + num1);
            }
        }
    }
}
