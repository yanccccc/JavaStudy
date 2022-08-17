package com.atguigu.exer;

public class Manager extends Employee{

    private int bonus;//����

    public Manager(String name, int id, int salary, int bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("������");
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
