package com.atguigu.java1;
@MyAnnotation(value = "hi")
public class Person extends Creature<String> implements MyInterface,Comparable<String>{

    private String name;
    int age;
    public int id;

    public Person(){

    }

    @MyAnnotation(value = "abc")
    private Person(String name){
        this.name = name;
    }

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    @MyAnnotation
    private String show(String nation){
        System.out.println("我的国籍是：" + nation);
        return nation;
    }

    public String display(String interests){
        return interests;
    }

    @Override
    public void info() {
        System.out.println("我是一个人");
    }


    @Override
    public int compareTo(String o) {
        return 0;
    }

    public static void showDesc(){
        System.out.println("我是一个静态方法");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
