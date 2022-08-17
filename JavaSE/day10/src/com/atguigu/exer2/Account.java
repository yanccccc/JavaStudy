package com.atguigu.exer2;

public class Account {
    double balance;

    public Account(double balance) {

        this.balance = balance;
    }

    public double getBalance() {

        return balance;
    }

    public void withdraw(double amount){//取钱
        if(balance < amount){
            System.out.println("余额不足，取款失败");
        }else {
            balance -= amount;
            System.out.println("成功取出：" + amount);
        }
    }

    public void deposit(double amount){//取钱
        if(amount >= 0){
            balance += amount;
            System.out.println("成功存入：" + amount);
        }
    }
}
