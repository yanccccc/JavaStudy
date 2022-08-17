package com.atguigu.java1;

import com.atguigu.java.Person;

import java.util.Objects;

public class User implements Comparable{
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
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

    @Override
    public boolean equals(Object o) {
        System.out.println("User.equals().....");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    //姓名和年龄从小到大排列
    @Override
    public int compareTo(Object o) {
        if(o instanceof User){
            User user = (User) o;
//            return -this.name.compareTo(user.getName());

            int compare = this.name.compareTo(user.getName());
            if(compare == 0){
                return Integer.compare(this.age,user.getAge());
            }else {
                return compare;
            }
        }else {
            throw new RuntimeException("输入的对象类型不匹配");
        }
    }
}
