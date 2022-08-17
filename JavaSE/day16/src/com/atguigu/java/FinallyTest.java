package com.atguigu.java;

import org.junit.Test;

/*
try - catch -finally��finally��ʹ��

1.finally�ǿ�ѡ��
2.finally����������һ���ᱻִ�еĴ��룬��ʹcatch���ֳ����쳣�˻�try����ִ�����
3.�����ݿ����ӡ������������������Socket����Դ��JVM�ǲ����Զ����յģ�������Ҫ�ֶ�������Դ���ͷš�
��ʱ����Դ�ͷž���Ҫ������finally��

 */
public class FinallyTest {

    @Test
    public void test1(){
        try {
            int a = 10;
            int b = 0;
            System.out.println(a/b);
        }catch (ArithmeticException e){
//            e.printStackTrace();
            int[] arr = new int[5];
            System.out.println(arr[5]);
        }catch (Exception e){
            e.printStackTrace();
        } finally{
            System.out.println("cool~~~����");
        }

        System.out.println("cool");
    }
}
