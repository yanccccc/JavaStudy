package com.atguigu.java1;

import java.util.Objects;

public class Customer {
    String name;
    int age;

    public Customer() {
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
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

    //手动实现equals的方法
    //比较两个实体对象的内容是否相同
//    public boolean equals(Object obj){
//        if(this == obj){
//            return true;
//        }
//        if(obj instanceof Customer){
//            Customer cust = (Customer) obj;
//            return (this.age == cust.age && this.name.equals(cust.name));
//        }
//        return false;
//    }


    //自动生成的
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age && Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

//    @Override手动实现
//    public String toString() {
//        return "Customer[name = " + name + ",age = " + age + "]";
//    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
