package com.atguigu.exer;
/*
创建程序,在其中定义两个类：Person和PersonTest类。定义如下：
用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。
在 PersonTest 类 中实例化 Person 类的对象 b ， 调 用 setAge() 和
getAge()方法，体会Java的封装性。

在前面定义的Person类中添加构造器，利用构造器设置所有人的age属
性初始值都为18。
2. 修改上题中类和构造器，增加name属性,使得每次创建Person对象的同
时初始化对象的age属性值和name属性值。

 */
public class Person {
    private int age;
    private String name;

    public Person(){
        age = 18;
    }

    public Person(int n,String s){
        age = n;
        name = s;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
        if(this.age <= 130 && this.age >= 0){
            this.age = age;
        }else {
            System.out.println("不合法");
        }
    }

    public int getAge(){
        return age;
    }
}
