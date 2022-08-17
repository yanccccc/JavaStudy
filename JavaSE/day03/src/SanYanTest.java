/*
三元运算符

1.结构：(条件表达式)？表达式1：表达式2
条件表达式的结果为boolean类型
如果结果为TRUE，执行表达式1
如果结果为FALSE，执行表达式2
表达式1和表达式2要求是一致的

2.凡是可以使用三元运算符的都可以改成if-else
反之不成立
 */

public class SanYanTest {
    public static void main(String[] args) {
        //
        int m = 12;
        int n = 5;

        int max = (m > n)? m : n;
        System.out.println(max);

        //获取三个数的最大值
        int n1 = 12;
        int n2 = 30;
        int n3 = 43;
        int max1 = (n1 > n2)? ((n1 > n3)? n1 : n3) : ((n2 > n3)? n2 : n3);
        System.out.println(max1);

        //if-else
        if(m > n){
            System.out.println(m);
        }else {
            System.out.println(n);
        }
    }
}
