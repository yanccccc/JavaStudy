package com.atguigu.exer;
/*
��дһ��Employee�࣬����Ϊ�����࣬
���������������ԣ�name��id��salary��
�ṩ��Ҫ�Ĺ������ͳ��󷽷���work()��
����Manager����˵��������Ա���������н���(bonus)�����ԡ�
��ʹ�ü̳е�˼�룬���CommonEmployee���Manager�࣬Ҫ����
���ṩ��Ҫ�ķ����������Է��ʡ�

 */
public abstract class Employee {
    private String name;
    private int id;
    private int salary;

    public Employee() {
    }

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
