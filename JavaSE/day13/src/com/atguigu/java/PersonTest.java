package com.atguigu.java;
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

********************************************

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
        //不能调用子类特有的方法
        //p2.earnMoney();

        System.out.println("********************");
        //有了对象的多态性以后，内存中实际是加载了子类特有的属性和方法的，但是由于变量声明为父类型，导致
        //编译时，只能调用父类中声明的属性和方法。子类特有的属性和方法不能调用

        //如何才能调用子类特有的属性和方法
        //向下转型：使用强制类型转化符
        Man m1 = (Man) p2;
        m1.earnMoney();
        m1.isSmoking = true;

        //使用强转时可能出现异常
//        Woman w1 = (Woman) p2;
//        w1.goShopping();

        /*
        instanceof关键字的使用

        a instanceof A：判断a是否是A的实例。如果是，返回ture；如果不是，返回false
        为了避免在向下转型时出现异常，我们在向下转型时，先进行instanceof判断

        如果a instanceof A返回ture，B是A的父类，则a instanceof B也返回ture
         */
        if(p2 instanceof Woman){
            Woman w1 = (Woman) p2;
            w1.goShopping();
            System.out.println("******Woman******");
        }

        if(p2 instanceof Man){
            Man w1 = (Man) p2;
            ((Man) p2).earnMoney();
            System.out.println("******Man******");
        }

        if(p2 instanceof Person){
            System.out.println("person*********");
        }

        //编译时通过，运行不通过
//        Person p3 = new Woman();
//        Man m3 = (Man)p3;

        //编译通过，运行也通过
        Object obj = new Woman();
        Person p = (Person) obj;

        //编译不通过
        //Man m5 = new Woman();


    }
}
