package com.atguigu.exer1;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1122,20000,0.045);
        account.withdraw(30000);
        account.deposit(2500);
        System.out.println("����������Ϊ��" + account.getMonthlyInterest());
    }
}
