package com.atguigu.exer;
/*
����InstanceTest �࣬�����ж��巽��
method(Person e);
��method��:
(1)����e�����͵�����Ӧ���getInfo()������
(2)����e������ִ�У�
���eΪPerson��Ķ��������
��a person��;
���eΪStudent��Ķ��������
��a student��
��a person ��
���eΪGraduate��Ķ��������
��a graduated student��
��a student��
��a person��
 */
public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest test = new InstanceTest();
        Person p1 = new Person();
        Person p2 = new Student();
        Person p3 = new Graduate();
        test.method(p1);
        System.out.println("************");
        test.method(p2);
        System.out.println("************");
        test.method(p3);
    }
    public void method(Person e){
        System.out.println(e.getInfo());

        if(e instanceof Graduate){
            System.out.println("a graduated student");
        }
        if(e instanceof Student){
            System.out.println("a student");
        }
        if(e instanceof Person){
            System.out.println("a person");
        }
    }

}

class Person {
    protected String name = "person";
    protected int age = 50;

    public String getInfo() {
        return "Name: " + name + "\n" + "age: " + age;
    }
}

class Student extends Person {
    protected String school = "pku";

    public String getInfo() {
        return "Name: " + name + "\nage: " + age
                + "\nschool: " + school;
    }
}

class Graduate extends Student {
    public String major = "IT";

    public String getInfo() {
        return "Name: " + name + "\nage: " + age
                + "\nschool: " + school + "\nmajor:" + major;
    }
}


