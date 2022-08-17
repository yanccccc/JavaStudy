package com.atguigu.java1;

import java.util.Date;

/*
== �� equals()������

һ���ع�==��ʹ��
==�������
1.����ʹ���ڻ����������ͱ�������������������
2.����Ƚϵ��ǻ����������ͱ������Ƚ�������������������Ƿ���ȣ���һ��Ҫ������ͬ��
  ����Ƚϵ��������������ͱ������Ƚ����������ĵ�ֵַ�Ƿ���ͬ,�������Ƿ�ָ��ͬһ����ַʵ��

����equals()��ʹ��
1.��һ�����������������
2.ֻ������������������
3.Object����equals()�Ķ���
    Object����equals()�ķ�����==������ͬ���Ƚ����������ĵ�ֵַ�Ƿ���ͬ,�������Ƿ�ָ��ͬһ����ַʵ��
4.��String��Date��File�Ȱ�װ�඼��д��Object���е�equals()��������д�Ժ�ȽϵĲ���
    �������õĵ�ַ�Ƿ���ͬ�����ǱȽ���������ġ�ʵ�����ݡ��Ƿ���ͬ
5.�Զ��������ʹ��equals()�Ļ���Ҳͨ���ǱȽ���������ġ�ʵ�����ݡ��Ƿ���ͬ��
��ô�����Ǿ�Ҫ��Object����equals()������д


�ܽ᣺
1 == �ȿ��ԱȽϻ�������Ҳ���ԱȽ��������͡����ڻ������;��ǱȽ�ֵ��������������
���ǱȽ��ڴ��ַ
2 equals�Ļ�����������java.lang.Object������ķ���������÷���û�б���д��Ĭ��Ҳ
��==;���ǿ��Կ���String�����equals�����Ǳ���д���ģ�����String�����ճ�������
�õıȽ϶࣬�ö���֮���γ���equals�ǱȽ�ֵ�Ĵ���۵㡣
3 ����Ҫ���Զ���������û����дObject��equals�������жϡ�
4 ͨ������£���дequals��������Ƚ����е���Ӧ�����Ƿ���ȡ�

 */
public class EqualsTest {
    public static void main(String[] args) {
        int i = 10;
        int j = 10;
        double d = 10.0;
        System.out.println(i == j);//true
        System.out.println(i == d);//true

        char c = 10;
        System.out.println(i == c);//true

        char c1 = 'A';
        char c2 = 65;
        System.out.println(c1 == c2);//true

        Customer cust1 = new Customer("Tom", 22);
        Customer cust2 = new Customer("Tom", 22);
        System.out.println(cust1 == cust2);//false

        System.out.println("********equals()**********");
        System.out.println(cust1.equals(cust2));//false
        String str1 = new String("atguigu");
        String str2 = new String("atguigu");
        System.out.println(str1.equals(str2));//true

        Date date1 = new Date(1564651654564L);
        Date date2 = new Date(1564651654564L);
        System.out.println(date1.equals(date2));//true
    }
}

