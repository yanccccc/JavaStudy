package com.atguigu.java3;
/*
���Ե��Ⱥ�ֵ
1.Ĭ�ϳ�ʼ��
2.��ʾ��ʼ��/5.�ڴ�����и�ֵ
3.�������г�ʼ��
4.ͨ��������.���ԡ��򡰶���.�������ķ�ʽ���и�ֵ

˳��1-2/5-4-3
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.id);
    }

}

class Order{
    int id = 3;
    {
        id = 4;
    }
}
