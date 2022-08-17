package com.atguigu.java1;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * jdk 8之前的日期API
 *
 */
public class DateTimeTest {
    /*
    SimpleDateFormat的使用：SimpleDateFormat对日期Date类的格式化和解析
    1.两个操作
    1.1 格式化：日期 ————> 字符串
    1.2 解析：格式化的逆过程 字符串 ————> 日期
     */

    @Test
    public void testSimpleDateFormat() throws ParseException {
        //实例化SimpleDateFormat:使用默认构造器
        SimpleDateFormat sdf = new SimpleDateFormat();

        //格式化：日期 ————> 字符串
        Date date = new Date();
        String format = sdf.format(date);
        System.out.println(format);

        //解析：格式化的逆过程 字符串 ————> 日期
        String str = "22-7-29 下午1:49";
        Date date1 = sdf.parse(str);
        System.out.println(date1);

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //格式化
        String format1 = sdf1.format(date);
        System.out.println(format1);
        //解析:格式化的逆过程 字符串 ————> 日期
        Date date2 = sdf1.parse("2022-07-29 13:55:18");
        System.out.println(date2);
    }

    /*
    练习1：字符串"2020-09-08"转换为java.sql.Date
     */
    @Test
    public void testSimpleDateFormat1() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("2020-09-08");

        java.sql.Date birthDate = new java.sql.Date(date.getTime());
        System.out.println(birthDate);
    }


    /*
    Calendar(抽象类)的使用
     */
    @Test
    public void test(){
        //1.实例化
        //方式一：创建其子类的对象
        //方式二：调用其静态方法

        Calendar calendar = Calendar.getInstance();
        //System.out.println(calendar.getClass());

        //2.常用方法
        //get()
        int days = calendar.get(Calendar.DAY_OF_MONTH);//一个月中的第几天
        System.out.println(days);
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));//一年中的第几天

        //set()
        calendar.set(Calendar.DAY_OF_MONTH,22);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        //add()
        calendar.add(Calendar.DAY_OF_MONTH,-3);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        //getTime():日历类 --> Date
        Date date = calendar.getTime();
        System.out.println(date);

        //setTime():Date --> 日历类
        Date date1 = new Date();
        calendar.setTime(date1);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
    }

}
