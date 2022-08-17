package com.atguigu.exer1;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
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

    public void withdraw(double amount){//ȡǮ
        if(balance < amount){
            System.out.println("���㣬ȡ��ʧ��");
        }else {
            balance -= amount;
            System.out.println("�ɹ�ȡ����" + amount);
        }
    }

    public void deposit(double amount){//ȡǮ
        if(amount >= 0){
            balance += amount;
            System.out.println("�ɹ����룺" + amount);
        }

    }
}
