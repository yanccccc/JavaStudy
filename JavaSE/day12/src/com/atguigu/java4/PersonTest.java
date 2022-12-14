package com.atguigu.java4;
/*
面向对象特征之三：多态性

1.理解多态性：可以理解为一个事物的多种形态
2.何为多态性：
        对象的多态性：父类的引用指向子类的对象
3.多态的使用：虚拟方法的调用
        有了对象的多态性以后，我们在编译期只能调用父类声明的方法，但在运行期，我们实际执行的的是子类重写父类的方法
        总结：编译看左边，执行看右边
4.多态性的使用前提
        4.1 要有类的继承关系
        4.2 方法的重写

5.对象的多态性只适用与方法不适用于属性
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();

        Man man = new Man();
        man.eat();
        man.age = 22;
        man.earnMoney();
        System.out.println("**************");

        //*************************
        //多态性：父类的引用指向子类的对象
        Person p2 = new Man();
        //多态的使用：当调用子父类同名同参数的方法时，实际执行的是子类重写父类的方法--虚拟方法调用
        p2.eat();
        p2.walk();

        //p2.earnMoney();

    }
}
