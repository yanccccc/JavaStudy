package com.atguigu.java2;

import org.junit.Test;


/*
包装类的使用：
1.Java提供了8种基本数据类型对应的包装类，使得基本数据类型的变量具有类的特征

2.掌握的：基本数据类型、包装类、String三者之间的相互转化

 */
public class WrapperTest {
    //String类型转成基本数据类型:调用包装类的parseXxx
    @Test
    public void test5(){
        String str1 = "123";

        int i1 = Integer.parseInt(str1);
        System.out.println(i1 + 1);

        String str2 = "true";
        boolean b = Boolean.parseBoolean(str2);
        System.out.println(b);
    }


    //基本数据类型转化成String类型
    @Test
    public void test4(){
        int num1 = 10;
        //方式一：连接运算
        String str1 = num1 + "";
        //方式二：调用String的valueOf(Xxx)
        float f1 = 12.3f;
        String str2 = String.valueOf(f1);//"12.3"

        Object o1 = true ? new Integer(1):new Double(2.0);
        System.out.println(o1);
    }

    //自动装箱与自动拆箱
    @Test
    public void test3(){
//        int num1 = 10;
//        method(num1);

        //自动装箱
        int num1 = 10;
        Integer in1 = num1;

        boolean b1 = true;
        Boolean b2 = b1;

        //自动拆箱
        System.out.println(in1.toString());
        int num2 = in1;

    }

    public void method(Object obj){
        System.out.println(obj);
    }

    //包装类转化成数据类型
    @Test
    public void test2(){
        Integer in1 = new Integer(12);
        int i1 = in1.intValue();
        System.out.println(i1 + 1);

    }

    //基本数据类型转换成包装类：调用包装类的构造器
    @Test
    public void test1(){

        int num1 = 10;
        System.out.println(num1);

        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());

        Integer in2 = new Integer("123");
        System.out.println(in2.toString());

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("true");
        Boolean b3 = new Boolean("123true");//false

        System.out.println(b3);



    }
}
