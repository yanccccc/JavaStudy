package com.atguigu.java;

import org.junit.Test;

/**
 * 关于StringBuffer和StringBuilder的使用
 */
public class StringBufferBuilderTest {
    /*
    String、StringBuffer、StringBuilder的执行效率
    StringBuilder > StringBuffer > String
     */
    @Test
    public void test3() {
        long startTime = 0L;
        long endTime = 0L;
        String text = "";
        StringBuffer buffer = new StringBuffer("");
        StringBuilder builder = new StringBuilder("");
        //开始对比
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer的执行时间：" + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder的执行时间：" + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String的执行时间：" + (endTime - startTime));
    }


    /*
    StringBuffer append(xxx)：提供了很多的append()方法，用于进行字符串拼接
    StringBuffer delete(int start,int end)：删除指定位置的内容
    StringBuffer replace(int start, int end, String str)：把[start,end)位置替换为str
    StringBuffer insert(int offset, xxx)：在指定位置插入xxx
    StringBuffer reverse() ：把当前字符序列逆转
    public int indexOf(String str)
    public String substring(int start,int end)
    public int length()
    public char charAt(int n )
    public void setCharAt(int n ,char ch)

        总结：
        增：append()
        删：delete()
        改：setCharAt(int n ,char ch)/replace(int start, int end, String str)
        查：charAt(int n )
        插: insert( )
        遍历：for + charAt()
        长度：length()
     */
    @Test
    public void test2() {
        StringBuffer s1 = new StringBuffer("abc");
        s1.append(1);
        s1.append('1');
        System.out.println(s1);

//        s1.delete(2,4);
//        s1.replace(2,4,"hello");//abhello1
//        s1.insert(2,"true");
        s1.reverse();
        System.out.println(s1);

    }


    /*
    String、StringBuffer、StringBuilder的异同
    String：不可变的字符序列：底层使用char[]存储
    StringBuffer：可变的字符序列：线程安全的，效率低，底层使用char[]存储
    StringBuilder：可变的字符序列：线程不安全的，效率高，底层使用char[]存储

    源码分析：
    String str = new String();//new char[0];
    String str = new String("abv");//new char[]{'a','b','c'};

    StringBuffer sb1 = new StringBuffer();//char[] value = new char[16];底层创建了一个长度是16的数组
    System.out.println(sb1.length);//0
    sb1.append('a');//value[0] = a;
    sb1.append('b');//value[0] = b;

    StringBuffer sb2 = new StringBuffer();//char[] value = new char["abc".length + 16];

    //问题1：System.out.println(sb2.length);//3
    //问题2：扩容问题：如果要添加的数据底层数组装不下了，就需要扩容
            默认情况下，扩容为原来的2倍 + 2，同时将原有的数组复制到新的数组中
     */
    @Test
    public void test1() {
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.setCharAt(0, 'm');
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer();
        System.out.println(sb2.length());//0

    }


}
