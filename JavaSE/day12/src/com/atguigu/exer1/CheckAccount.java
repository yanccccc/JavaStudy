package com.atguigu.exer1;
/*
创建 Account 类的一个子类 CheckAccount 代表可透支的账户，该账户中定义一个属性
overdraft 代表可透支限额。在 CheckAccount 类中重写 withdraw 方法，其算法如下：
如果（取款金额<账户余额），
可直接取款
如果（取款金额>账户余额），
计算需要透支的额度
判断可透支额 overdraft 是否足够支付本次透支需要，如果可以
将账户余额修改为 0，冲减可透支金额
如果不可以
提示用户超过可透支额的限额
 */
public class CheckAccount extends Account{
    private double overdraft;//透支限额

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount){
        if(amount <= getBalance()){
            setBalance(getBalance() - amount);
            //super.withdraw(amount);
        }else{
            if(overdraft > amount - getBalance()){
                overdraft -= (amount - getBalance());
                setBalance(0);
            }else {
                System.out.println("超过可透支限额");
            }
        }
        System.out.println("您的账户余额：" + getBalance());
        System.out.println("您的可透支额：" + overdraft);
        System.out.println();
    }

}
