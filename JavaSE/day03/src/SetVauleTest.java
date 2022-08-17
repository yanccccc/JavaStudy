/*
赋值运算符
= += -= *= /=

 */

public class SetVauleTest {
    public static void main(String[] args) {

        int num1 = 10;
        num1 += 2; //num1 = num1 + 2

        short s1 = 10;
        //s1 = s1 + 2;编译不通过
        s1 += 2;//不会改变本身的数据类型
        System.out.println(s1);

        int m = 2;
        int n = 3;
        n *= m++;//n = n * m++;6
        System.out.println(n);//6
        n *= ++m;//n = n * ++m;9


        int a = 10;
        a += (a++) + (++a);
        System.out.println(a);//32



    }
}
