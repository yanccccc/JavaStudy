package com.atguigu.exer;

public class EmployeeTest {
    public static void main(String[] args) {
        CommonEmployee employee = new CommonEmployee("Tom",1001,5000);

        Manager manager = new Manager("Jerry",001,10000,5000);

        employee.work();
        manager.work();


    }
}
