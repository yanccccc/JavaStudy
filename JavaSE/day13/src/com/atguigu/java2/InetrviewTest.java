package com.atguigu.java2;

import org.junit.Test;

public class InetrviewTest {
    //
    @Test
    public void method1() {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);//false

        //Integer�ڲ�������IntegerCache�ṹ��������-128~127��Χ���������������ʹ���Զ�װ��ķ�ʽ��
        //��Integer��ֵ��-128~127��Χ�ڣ�����ʹ�������е�Ԫ�أ�������ȥnew��
        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);//true
        Integer x = 128;//�൱��new��һ��-128~127����
        Integer y = 128;
        System.out.println(x == y);//false
    }
}
