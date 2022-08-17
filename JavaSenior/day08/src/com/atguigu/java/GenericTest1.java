package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 如何自定义泛型结构：泛型类、泛型接口、泛型方法
 *
 * 1.关于自定义泛型类、泛型接口
 */
public class GenericTest1 {

    @Test
    public void test1(){
        //如果定义了泛型类，实例化没有指明类的泛型，则认为此泛型类为Object类型
        //如果定义了类时带泛型的，建议在实例化要知名类的泛型
        Order order = new Order();
        order.setOrderT(123);
        order.setOrderT("ABC");

        //建议数理化指明类的泛型
        Order<String> order1 = new Order<>("orderAA",1001,"泛型A");

        order1.setOrderT("AA:hello");

        System.out.println(order1.toString());
    }

    @Test
    public void test2(){
        ArrayList<String> list1 = null;
        ArrayList<Integer> list2 = null;
        //泛型不同的引用不能相互赋值
        //list1 = list2;


    }

    @Test
    public void test3(){
        Order<String> order = new Order<>();
        Integer[] arr = {1,2,3,4};
        //泛型方法在调用时，指定泛型参数的类型，和类的泛型无关
        List<Integer> list = order.copyFromArrayToList(arr);

        System.out.println(list);
    }
}
