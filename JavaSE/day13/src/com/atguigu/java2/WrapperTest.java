package com.atguigu.java2;

import org.junit.Test;


/*
��װ���ʹ�ã�
1.Java�ṩ��8�ֻ����������Ͷ�Ӧ�İ�װ�࣬ʹ�û����������͵ı��������������

2.���յģ������������͡���װ�ࡢString����֮����໥ת��

 */
public class WrapperTest {
    //String����ת�ɻ�����������:���ð�װ���parseXxx
    @Test
    public void test5(){
        String str1 = "123";

        int i1 = Integer.parseInt(str1);
        System.out.println(i1 + 1);

        String str2 = "true";
        boolean b = Boolean.parseBoolean(str2);
        System.out.println(b);
    }


    //������������ת����String����
    @Test
    public void test4(){
        int num1 = 10;
        //��ʽһ����������
        String str1 = num1 + "";
        //��ʽ��������String��valueOf(Xxx)
        float f1 = 12.3f;
        String str2 = String.valueOf(f1);//"12.3"

        Object o1 = true ? new Integer(1):new Double(2.0);
        System.out.println(o1);
    }

    //�Զ�װ�����Զ�����
    @Test
    public void test3(){
//        int num1 = 10;
//        method(num1);

        //�Զ�װ��
        int num1 = 10;
        Integer in1 = num1;

        boolean b1 = true;
        Boolean b2 = b1;

        //�Զ�����
        System.out.println(in1.toString());
        int num2 = in1;

    }

    public void method(Object obj){
        System.out.println(obj);
    }

    //��װ��ת������������
    @Test
    public void test2(){
        Integer in1 = new Integer(12);
        int i1 = in1.intValue();
        System.out.println(i1 + 1);

    }

    //������������ת���ɰ�װ�ࣺ���ð�װ��Ĺ�����
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
