package com.atguigu.java;

import java.io.Serializable;

/**
 * Person要满足如下的要求方可序列化
 * 1.要要实现接口：Serializable
 * 2.当前类提供一个全局常量：serialVersionUID
 * 3.除了当前Person类需要实现Serializable以外，还需要保证其内部所有属性也必须是
 *      可序列化的
 *
 *
 */

public class Person implements Serializable {

    public static final long serialVersionUID = 472757542L;

    private String name;
    private int age;
    private Account account;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Account account) {
        this.name = name;
        this.age = age;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", account=" + account +
                '}';
    }
}

class Account implements Serializable{

    private double blance;
    public static final long serialVersionUID = 47259798542L;

    public Account() {
    }

    public Account(double blance) {
        this.blance = blance;
    }

    public double getBlance() {
        return blance;
    }

    public void setBlance(double blance) {
        this.blance = blance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "blance=" + blance +
                '}';
    }
}
