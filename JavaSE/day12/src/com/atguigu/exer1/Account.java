package com.atguigu.exer1;
/*
дһ����Ϊ Account ����ģ���˻�����������Ժͷ�������ͼ��ʾ��������������ԣ�
�˺� id����� balance�������� annualInterestRate�������ķ�����������������getter ��
setter �����������������ʵķ��� getMonthlyInterest()��ȡ��� withdraw()������
deposit()��

 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;//������

    public Account() {
        balance = 2000;
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    //���������ʵķ��� getMonthlyInterest()
    public double getMonthlyInterest(){
        return annualInterestRate / 12.0;
    }

    //ȡ���
    public void withdraw(double amount){
        if(balance < amount){
            System.out.println("����");
        }else {
            balance -= amount;
        }
        System.out.println("�����˻����Ϊ��" + balance);
    }

    //����
    public void deposit(double amount){
        if(amount >= 0){
            balance += amount;
        }else {
            System.out.println("���ʧ��");
        }
        System.out.println("�����˻����Ϊ��" + balance);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
}
