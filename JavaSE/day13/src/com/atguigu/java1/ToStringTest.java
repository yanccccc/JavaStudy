package com.atguigu.java1;

/*
Object����toString()��ʹ�ã�

1.���������һ�����������ʱ��ʵ���Ͼ��ǵ��ö����toString()

2.Object����toString()��ʹ�ö��壺
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

3.��String��Date��File����װ�඼��д��Object���е�toString()������
    ʹ���ڵ��ö����toString()ʱ������ʵ����Ϣ��

4.�Զ�����Ҳ������дtoString()�����������ô˷���ʱ���ض����ʵ������

 */
public class ToStringTest {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Tom",21);
        System.out.println(cust1.toString());
        System.out.println(cust1);
    }

}
