package com.atguigu.exer;
/*
��дһ����ʵ�������˻��ĸ�������������С��ʺš�������
�롱����������������ʡ�������С���������װ��Щ
���Եķ������˺�Ҫ�Զ����ɡ�
��д���࣬ʹ�������˻��࣬���롢���3��������������Ϣ��
���ǣ���Щ���Կ�����Ƴ�static���ԡ�
 */
public class Account {
    private int id;
    private String password = "000000";
    private double balance;

    private static double interestRate;
    private static double minMoney = 1.0;
    private static int init = 1001;//�����Զ������˺�

    public Account() {
        id = init++;
    }

    public Account(String password, double balance) {
        this();
        this.password = password;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinMoney() {
        return minMoney;
    }

    public static void setMinMoney(double minMoney) {
        Account.minMoney = minMoney;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
