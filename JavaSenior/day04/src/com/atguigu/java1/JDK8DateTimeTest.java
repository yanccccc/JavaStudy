package com.atguigu.java1;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

public class JDK8DateTimeTest {

    /*
    LocalDate、LocalTime、LocalDateTime的使用
    LocalDateTime相较于LocalDate、LocalTime，使用频率要高
     */

    @Test
    public void test1(){

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        //of():设置指定的年、月、日、时、分、秒
        LocalDateTime localDateTime1 = LocalDateTime.of(2020, 10, 6, 13, 23, 50);
        System.out.println(localDateTime1);

        //getXxx()获取相关的属性
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());

        //with设置相关的属性
        LocalDate localDate1 = localDate.withDayOfMonth(22);
        System.out.println(localDate);
        System.out.println(localDate1);

        LocalDateTime localDateTime2 = localDateTime.withHour(4);
        System.out.println(localDateTime);
        System.out.println(localDateTime2);

        //加减属性
        LocalDateTime localDateTime3 = localDateTime.plusMonths(3);
        System.out.println(localDateTime);
        System.out.println(localDateTime3);

        LocalDateTime localDateTime4 = localDateTime.minusDays(5);
        System.out.println(localDateTime);
        System.out.println(localDateTime4);
    }

    /*
    Instant的使用
    类似于Date
     */

    @Test
    public void test2(){
        //now():本初子午线的标准时间
        Instant instant = Instant.now();
        System.out.println(instant);

        //atOffset(ZoneOffset offset)：添加时间的偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);

        //toEpochMilli()：返回1970-01-01 00:00:00到当前时间的毫秒数
        long toEpochMilli = instant.toEpochMilli();
        System.out.println(toEpochMilli);

        //ofEpochMilli(long epochMilli) ：返回在1970-01-01 00:00:00基础上加上指定毫秒数之后的Instant类的对象
        Instant instant1 = Instant.ofEpochMilli(toEpochMilli);
        System.out.println(instant1);
    }

    /*
    DateTimeFormatter：格式化或解析日期、时间
    类似于SimpleTimeFormat
     */
    @Test
    public void test3(){
        //1.预定义的标准格式。如：ISO_LOCAL_DATE_TIME;ISO_LOCAL_DATE;ISO_LOCAL_TIME
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //格式化：日期 --> 字符串
        LocalDateTime localDateTime = LocalDateTime.now();
        String str1 = formatter.format(localDateTime);
        System.out.println(localDateTime);
        System.out.println(str1);
        //解析
        TemporalAccessor parse = formatter.parse(str1);
        System.out.println(parse);

        //2.本地化相关的格式。如：ofLocalizedDateTime(FormatStyle.LONG)
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        //格式化
        String format = formatter1.format(localDateTime);
        System.out.println(format);

        //3.自定义的格式。如：ofPattern(“yyyy-MM-dd hh:mm:ss”)
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        //格式化
        String str4 = formatter2.format(localDateTime);
        System.out.println(str4);

        //解析
        TemporalAccessor parse1 = formatter2.parse(str4);
        System.out.println(parse1);

    }

}
