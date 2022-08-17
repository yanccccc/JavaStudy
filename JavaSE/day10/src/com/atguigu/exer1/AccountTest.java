package com.atguigu.exer1;

public class AccountTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane","Smith");
        Account account = new Account(1000,2000,0.0123);
        customer.setAccount(account);
        Account a = customer.getAccount();
        a.deposit(100);//��100
        a.withdraw(960);//ȡ960
        a.withdraw(2000);//ȡ2000
        System.out.println("Customer " + customer.getFirstName() + customer.getLastName() + " has a account: id is " + a.getId()
         + ", annualInterestRate is " + a.getAnnualInterestRate() + ", balance is " + a.getBalance());
    }
}
