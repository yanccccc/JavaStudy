package com.atguigu.exer2;

public class Account {
    double balance;

    public Account(double balance) {

        this.balance = balance;
    }

    public double getBalance() {

        return balance;
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
