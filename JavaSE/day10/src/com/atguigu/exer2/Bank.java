package com.atguigu.exer2;

public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;

    public Bank(){
        customers = new Customer[10];
    }

    public void addCustomer(String f,String l){
        Customer customer = new Customer(f,l);
        //将Customer对象放入customers中
        customers[numberOfCustomer] = customer;
        numberOfCustomer++;
    }

    public int getNumberOfCustomer(){
        return numberOfCustomer;
    }

    public Customer getCustomer(int index){
        if(index >= 0 && index < numberOfCustomer){
            return customers[index];
        }
        return null;
    }
}
