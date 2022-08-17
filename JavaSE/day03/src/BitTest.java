/*
位运算符

1.位运算符操作的都是整形的数据
2.<<:在一定范围内，向左移1位相当于乘以2
  >>: 在一定范围内，向右移1位相当于除以2

 */
public class BitTest {
    public static void main(String[] args) {
        int i = 21;
        System.out.println("i << 2 = " + (i << 2));//21*2^2=84
        System.out.println("i << 3 = " + (i << 3));//21*2^3=168

        int m = 12;
        int n = 5;
        System.out.println("m & n = "+ (m & n));//1100 & 0101 = 0100 4
        System.out.println("m | n = "+ (m | n));//1100 | 0101 = 1101 13
        System.out.println("m ^ n = "+ (m ^ n));//1100 ^ 0101 = 1001 9

        //练习：交换两个变量的值
        int num1 = 10;
        int num2 = 20;
        System.out.println("num1 = " + num1 + ",num2 = " + num2);

        //方式一:临时变量,推荐用这种
        int temp = num1;
        num1 = num2;
        num2 = temp;

        //方式二
//        num1 = num1 + num2;
//        num2 = num1 - num2;
//        num1 = num1 - num2;

        System.out.println("num1 = " + num1 + ",num2 = " + num2);


    }
}
