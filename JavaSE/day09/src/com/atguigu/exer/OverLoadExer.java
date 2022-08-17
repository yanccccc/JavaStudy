package com.atguigu.exer;
/*
2.编写程序，定义三个重载方法并调用。方法名为mOL。
?三个方法分别接收一个int参数、两个int参数、一个字符串参数。分别
执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
?在主类的main ()方法中分别用参数区别调用三个方法。
 */
public class OverLoadExer {
    public static void main(String[] args) {
        OverLoadExer overLoadExer = new OverLoadExer();
        overLoadExer.mOL(1);
        overLoadExer.mOL(2,3);
        overLoadExer.mOL("字符串");
    }

    public void mOL(int i){
        System.out.println("平方运算：" + i * i);
    }

    public void mOL(int i,int j){
        System.out.println("相乘运算：" + i * j);
    }

    public void mOL(String c){
        System.out.println(c);
    }

}
