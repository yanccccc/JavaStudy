package com.atguigu.exer;

public class CommonEmployee extends Employee{

    public CommonEmployee(String name, int id, int salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("员工工作");
    }


}
