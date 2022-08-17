package com.atguigu.exer;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account("123456",5000);

        System.out.println(account1);
        System.out.println(account2);
    }
}
