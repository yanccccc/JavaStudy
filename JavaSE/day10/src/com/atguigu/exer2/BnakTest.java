package com.atguigu.exer2;

public class BnakTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Tom", "Smith");
        bank.getCustomer(0).setAccount(new Account(2000));

        bank.getCustomer(0).getAccount().withdraw(200);

        bank.getCustomer(0).getAccount().deposit(500);

        double balance = bank.getCustomer(0).getAccount().getBalance();

        System.out.println("Óà¶îÎª£º" + balance);




    }

}
