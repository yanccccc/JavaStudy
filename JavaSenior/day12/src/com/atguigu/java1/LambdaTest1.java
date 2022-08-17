package com.atguigu.java1;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * lambda表达式的使用
 *
 * 1.举例： (o1,o1) -> Integer.compare(o1,o2)
 * 2.格式：
 *      ->:lambda操作符 或 箭头操作符
 *      ->左边：lambda形参列表（其实就是接口中抽象方法的形参列表）
 *      ->右边：lambda体（其实就是重写抽象方法的方法体）
 *
 * 3.lambda表达式的使用
 *
 * 4.lambda表达式的本质：作为函数式接口的实例
 *
 * 5.如果此接口只有一个抽象方法，则称为函数式接口，
 * 我们可以在一个接口上使用 @FunctionalInterface 注解，这样做可以检查它是否是一个函数式接口。
 *
 */
public class LambdaTest1 {

    //语法格式一：无参，无返回值
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

    //语法格式二：Lambda 需要一个参数，但是没有返回值。
    @Test
    public void test2(){
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("谎言不会伤人，真相才是快刀");

        System.out.println("***************");

        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };
        con1.accept("kamier");

    }

    //语法格式三：数据类型可以省略，因为可由编译器推断得出，称为“类型推断”
    @Test
    public void test3(){
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("谎言不会伤人，真相才是快刀");

        System.out.println("***************");

        Consumer<String> con2 = (s) -> {
            System.out.println(s);
        };
        con2.accept("kamier");
    }

    //语法格式四：Lambda 若只需要一个参数时，参数的小括号可以省略
    @Test
    public void test4(){
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("谎言不会伤人，真相才是快刀");

        System.out.println("***************");

        Consumer<String> con3 = s -> {
            System.out.println(s);
        };
        con3.accept("kamier");
    }

    //语法格式五：Lambda 需要两个或以上的参数，多条执行语句，并且可以有返回值
    @Test
    public void test5(){

        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return Integer.compare(o1,o2);
            }
        };
        System.out.println(com.compare(12, 21));
        System.out.println("********************");

        Comparator<Integer> com1 = (o1,o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return Integer.compare(o1,o2);
        };

        System.out.println(com.compare(12, 6));

    }

    //语法格式六：当 Lambda 体只有一条语句时，return 与大括号若有，都可以省略
    @Test
    public void test6(){
        Comparator<Integer> com1 = (o1,o2) -> Integer.compare(o1,o2);
    }
}
