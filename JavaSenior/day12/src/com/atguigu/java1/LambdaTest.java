package com.atguigu.java1;

import org.junit.Test;

import java.util.Comparator;

/**
 * lambda表达式的使用
 */
public class LambdaTest {

    @Test
    public void test1(){
        Runnable run1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱北京天安门");
            }
        };

        run1.run();

        System.out.println("****************");

        //lambda表达式
        Runnable run2 = () -> {
            System.out.println("我爱北京天安门");
        };

        run2.run();
    }

    @Test
    public void test2(){

        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };

        int compare1 = com1.compare(12, 31);
        System.out.println(compare1);

        System.out.println("*****************");

        Comparator<Integer> com2 = (o1,o2) -> {
            return Integer.compare(o1,o2);
        };
        int compare2 = com2.compare(65, 31);
        System.out.println(compare2);

        System.out.println("*****************");

        Comparator<Integer> com3 = Integer :: compare;
        int compare3 = com3.compare(65, 31);
        System.out.println(compare3);

    }
}
