package com.atguigu.exer;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 银行有一个账户。
 * 有两个储户分别向同一个账户存3000元，每次存1000，存3次。每次存完打
 * 印账户余额。
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acct = new Account(0);
        Customer c1 = new Customer(acct);
        Customer c2 = new Customer(acct);

//        Thread t1 = new Thread(c);
//        Thread t2 = new Thread(c);

        c1.setName("客户1");
        c2.setName("客户2");

        c1.start();
        c2.start();
    }
}

//class Customer implements Runnable{
//    Account a = new Account(0);
//    @Override
//    public void run() {
//        for (int i = 0; i < 3; i++) {
//            a.deposit(1000);
//        }
//    }
//}

class Customer extends Thread{
    private Account acct;
    public Customer(Account acct){
        this.acct = acct;
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            acct.deposit(1000);
        }
    }
}


class Account{
    private double balance;
    private ReentrantLock lock = new ReentrantLock();

    public Account(double balance){
        this.balance = balance;
    }

    public void deposit(double money){
        try {
            lock.lock();
            if(money >= 0){
                balance += money;

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + "存钱成功，余额为：" + balance);
            }
        }finally {
            lock.unlock();
        }

    }

}
