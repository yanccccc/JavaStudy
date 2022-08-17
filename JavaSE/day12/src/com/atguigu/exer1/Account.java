package com.atguigu.exer1;
/*
写一个名为 Account 的类模拟账户。该类的属性和方法如下图所示。该类包括的属性：
账号 id，余额 balance，年利率 annualInterestRate；包含的方法：访问器方法（getter 和
setter 方法），返回月利率的方法 getMonthlyInterest()，取款方法 withdraw()，存款方法
deposit()。

 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;//年利率

    public Account() {
        balance = 2000;
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    //返回月利率的方法 getMonthlyInterest()
    public double getMonthlyInterest(){
        return annualInterestRate / 12.0;
    }

    //取款方法
    public void withdraw(double amount){
        if(balance < amount){
            System.out.println("余额不足");
        }else {
            balance -= amount;
        }
        System.out.println("您的账户余额为：" + balance);
    }

    //存款方法
    public void deposit(double amount){
        if(amount >= 0){
            balance += amount;
        }else {
            System.out.println("存款失败");
        }
        System.out.println("您的账户余额为：" + balance);
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
