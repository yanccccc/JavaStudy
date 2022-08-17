/*
String类型变量的使用
1. String属于引用数据类型
2. 声明String类型变量时，使用一对双引号""
3. String可以和8中基本数据类型做运算，且只能是连接运算
4. 运算的结果仍然是String类型
 */

public class StringTest {
    public static void main(String[] args) {
        String s1 = "Hello world";

        String s2 = "a";
        String s3 = "";

        int number = 1001;
        String numberStr = "学号：";
        String info = numberStr + number;
        System.out.println(info);


        //*********************
        //Test1
        char c = 'a';
        int num = 10;
        String str = "hello";
        System.out.println(c + num + str);//107hello
        System.out.println(c + str + num);//ahello10
        System.out.println(c + (num + str));//a10hello
        System.out.println((c + num) + str);//107hello
        System.out.println(str + num + c);//hello10a

        //联系2
        //* *
        System.out.println('*' + '\t' + '*');//输出的是数
        System.out.println('*' + "\t" + '*');
    }
}
