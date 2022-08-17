package com.atguigu.exer1;
/*
���� Account ���һ������ CheckAccount �����͸֧���˻������˻��ж���һ������
overdraft �����͸֧�޶�� CheckAccount ������д withdraw ���������㷨���£�
�����ȡ����<�˻�����
��ֱ��ȡ��
�����ȡ����>�˻�����
������Ҫ͸֧�Ķ��
�жϿ�͸֧�� overdraft �Ƿ��㹻֧������͸֧��Ҫ���������
���˻�����޸�Ϊ 0�������͸֧���
���������
��ʾ�û�������͸֧����޶�
 */
public class CheckAccount extends Account{
    private double overdraft;//͸֧�޶�

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount){
        if(amount <= getBalance()){
            setBalance(getBalance() - amount);
            //super.withdraw(amount);
        }else{
            if(overdraft > amount - getBalance()){
                overdraft -= (amount - getBalance());
                setBalance(0);
            }else {
                System.out.println("������͸֧�޶�");
            }
        }
        System.out.println("�����˻���" + getBalance());
        System.out.println("���Ŀ�͸֧�" + overdraft);
        System.out.println();
    }

}
