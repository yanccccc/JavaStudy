package com.atguigu.exer1;
/*
��дһ���û�������� CheckAccount �ࡣ���û������У�����һ���˺�Ϊ 1122����
��Ϊ 20000�������� 4.5%����͸֧�޶�Ϊ 5000 Ԫ�� CheckAccount ����
ʹ�� withdraw ������� 5000 Ԫ������ӡ�˻����Ϳ�͸֧�
��ʹ�� withdraw ������� 18000 Ԫ������ӡ�˻����Ϳ�͸֧�
��ʹ�� withdraw ������� 3000 Ԫ������ӡ�˻����Ϳ�͸֧�
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount checkAccount = new CheckAccount(1122,20000,0.045,5000);
        checkAccount.withdraw(5000);
        checkAccount.withdraw(18000);
        checkAccount.withdraw(3000);
    }
}
