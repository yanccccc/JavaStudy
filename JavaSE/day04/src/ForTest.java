/*
For循环结构的使用
一、循环结构的4个要素
1.初始化条件
2.循环条件
3.循环体
4.迭代条件

二、For循环的结构
for(1;2;4){
    3
}
执行过程1 - 2 - 3 - 4 - 2 - 3 - 4 ..... - 2

 */

public class ForTest {
    public static void main(String[] args) {
        int num = 1;
        for (System.out.println('a');num <= 3; System.out.println('c'),num++){
            System.out.println('b');
        }
        //abcbcbc

        //遍历100以内的偶数
        int sum = 0;
        for (int i = 1;i <= 100;i++){

            if(i % 2 ==0){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
