/*
如何从键盘获取不同类型的变量：需要使用Scnaaer类

具体实现步骤
1.导包：import java.util.Scanner
2.Scnaaer的实例化
3.调用Scanner类的相关方法，来获取指定变量

需要根据相应的方法，来输入指定类型的值。如果输入类型不匹配，会会报异常
 */
import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入您的姓名");
        String name = scan.next();
        System.out.println(name);

        System.out.println("请输入您的年龄");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("请输入您的体重");
        double weight = scan.nextDouble();
        System.out.println(weight);

        System.out.println("您是否相中我了？（true/false)");
        boolean isLove = scan.nextBoolean();
        System.out.println(isLove);

        //对于char型的获取，Scanner没有提供相应的方法。只能获取字符串
        System.out.println("请输入您的性别（男/女）");
        String gender = scan.next();
        System.out.println(gender);
    }
}
