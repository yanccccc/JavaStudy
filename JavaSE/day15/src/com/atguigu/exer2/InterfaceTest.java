package com.atguigu.exer2;
/*
定义一个测试类InterfaceTest，创建两个ComparableCircle对象，调用compareTo
方法比较两个类的半径大小。

 */
public class InterfaceTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(1.2);
        ComparableCircle c2 = new ComparableCircle(0.5);
        int i = c1.compareTo(c2);
        if(i > 0){
            System.out.println("c1半径大");
        }else if(i == 0){
            System.out.println("两个圆半径一样大");
        }else {
            System.out.println("c2半径大");
        }


    }
}
