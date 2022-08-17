package com.atguigu.java;

import org.junit.Test;

import java.util.Date;

/**
 * JDK8之前日期时间API
 */
public class DateTimeTest {
    /*
    java.util.Date()类
            ---java.sql.Date类
    1.两个构造器的使用

    2.两个方法的使用
        >toString():显示当前的年、月、日、时、分、秒
        >getTime():获取当前Date对象对象的毫秒数
     */
    @Test
    public void test2(){
        //构造器一：Date()返回当前对应时间的Date对象
        Date date = new Date();
        System.out.println(date);//Thu Jul 28 12:19:41 CST 2022

        System.out.println(date.getTime());

        //构造器二：创建指定毫秒数的Date对象
        Date date1 = new Date(1658982206865L);
        System.out.println(date1);

    }
    //1.System类提供的public static long currentTimeMillis()
    @Test
    public void test1(){
        //返回当前时间与1970年1月1日0时0分0秒之间以毫秒为单位的时间差。
        //时间戳
        long time = System.currentTimeMillis();
    }
}
