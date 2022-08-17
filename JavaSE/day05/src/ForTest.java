/*
题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
比如：20和12的最大公约数是4，最小公倍数是60。
说明：break关键字的使用
 */
import java.util.Scanner;
public class ForTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个正整数");
        System.out.println("第一个数为:");
        int m = scanner.nextInt();
        System.out.println("第二个数为:");
        int n = scanner.nextInt();
        /*
        方法一：辗转相除法
        int a = m * n;
        int temp = m % n;
        while (temp != 0 ){
            m = n;
            n = temp;
            temp = m % n;
        }
        System.out.println("最大公约数为：" + n);
        System.out.println("最小公倍数为：" + a/n);
         */

        int min = (m <= n)? m: n;
        for (int i = min;i >= 1;i--){
            if(m % i == 0 && n % i == 0){
                System.out.println("最大公约数为："  + i);
                System.out.println("最小公倍数为："  + m * n / i);
                break;
            }
        }
    }
}
