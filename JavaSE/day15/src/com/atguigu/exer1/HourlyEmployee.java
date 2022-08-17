package com.atguigu.exer1;
/*
����SalariedEmployee�ඨ��HourlyEmployee�࣬ʵ�ְ�Сʱ���㹤�ʵ�
Ա���������������
private��Ա����wage��hour��
ʵ�ָ���ĳ��󷽷�earnings(),�÷�������wage*hourֵ��
 */
public class HourlyEmployee extends Employee{
    private double wage;
    private int hour;

    public HourlyEmployee(String name, int number, MyDate birthday, double wage,int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public double earnings() {
        return wage * hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                super.toString() +
                '}';
    }
}
