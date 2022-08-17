/*
算术运算符

 */

public class AriTest {
    public static void main(String[] args) {

        //除法
        int num1 = 12;
        int num2 = 5;
        int result1 = num1 / num2;
        System.out.println(result1);//2

        int result2 = num1 / num2 * num2;
        System.out.println(result2); //10

        double result3 = num1 / num2;
        System.out.println(result3);//2.0

        double result4 = num1 / (double)num2;
        System.out.println(result4);//2.4

        //%取余运算
        //结果的符号和被模数相同
        int m1 = 12;
        int n1 = 5;
        System.out.println(m1 % n1);

        //前++：先自增1，在运算
        //后++：先运算，后自增1
        byte b1 = 127;
        b1++;//自增1不会改变本身变量的数据类型
        System.out.println(b1);//-128

    }
}
