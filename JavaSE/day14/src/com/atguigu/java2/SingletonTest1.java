package com.atguigu.java2;
/*
�������ģʽ
1.��ν��ĵ������ģʽ�����ǲ�ȡһ���ķ�����֤�����������ϵͳ�У���ĳ����ֻ�ܴ���һ������ʵ����

2.���ʵ��
 ����ʽ vs ����ʽ

3.���ֶ���ʽ������ʽ
    ����ʽ��
        �������������ʱ�����
        �ô����߳��ǰ�ȫ��
    ����ʽ��
        �������̲߳���ȫ
        �ô����ӳٶ���Ĵ���

 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Bank bank1  = Bank.getInstance();
        Bank bank2  = Bank.getInstance();

        System.out.println(bank1 == bank2);

    }
}

class Bank{
    //1.˽�л��Ĺ�����
    private Bank(){

    }

    //2.�ڲ�������Ķ���
    //4.Ҫ��˶���Ҳ��������Ϊ��̬��
    private static Bank instance = new Bank();

    //3.�ṩ�����ķ���������Ķ���
    public static Bank getInstance(){
        return instance;
    }
}
