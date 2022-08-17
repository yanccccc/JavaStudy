package com.atguigu.exer;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Tom";
        person.age = 22;
        person.sex = 0;
        person.study();
        person.showAge();
        int newAge = person.addAge(2);
        System.out.println("ĞÂÄêÁäÎª£º" + newAge);
        person.showAge();

        Person person1 = new Person();
        person1.name = "Tom";
        person1.age = 18;
        person1.sex = 0;
        person1.study();
        person1.showAge();
        person1.addAge(2);
    }
}
