package com.atguigu.java;
/*
static关键字的使用

1.static：静态的
2.static用来修饰：属性、方法、代码块、内部类

3.static用来修饰属性：静态变量
        3.1 属性，按是否使用static修饰，又分为：静态属性 vs 非静态变量
        实例变量：我们创建了类的多个对象，每个对象都独立的拥有一套类中的非静态属性。当修改其中一个对象的
                非静态属性时，不会导致其他对象同样的属性值修改
        静态变量：我们创建了类的多个对象，多个对象都共享同一个静态变量。当通过某一个对象修改静态变量时，
                会导致其他对象同样的属性值修改
        3.2 static修饰属性的其他说明：
            ①静态变量随着类的加载而加载。可以通过“类.静态变量”调用
            ②静态变量的加载要早于对象的创建
            ③由于类只会加载一次，则静态变量在内存中也只会存在一份，存在方法区的静态域中
            ④       类变量     实例变量
            类       yes         no
            对象     yes         yes


4.static用来修饰方法：静态方法
        4.1 随着类的加载而加载，可以通过“类.静态变方法”调用
        4.2         静态方法     非静态方法
            类       yes         no
            对象     yes         yes

        4.3 静态方法中，只能调用静态的方法或属性
            非静态方法中，既可以调用静态的方法或属性，也可以调用非静态的方法或属性

5.static注意点：
    在静态的方法中，不能使用this和super关键字

6.在开发中，如何确定一个属性是否要声明为static的
            >属性是可以被多个对象共享的，不会随着对象的不同而不同的
            类中的常量也常常声明为static的

            如何确定一个属性是否要声明为static的
            >操作静态属性的方法，通常设为static的
            工具类中的方法，习惯声明为static的，比如Math、Arrays

 */
public class StaticTest {
    public static void main(String[] args) {
        Chinese c1 = new Chinese();
        c1.name = "姚明";
        c1.age = 40;

        Chinese c2 = new Chinese();
        c2.name = "马龙";
        c2.age = 30;
        c1.nation = "CHN";
        Chinese.nation = "中国";

        System.out.println(c2.nation);

        Chinese.show();
        c1.eat();
        c1.show();



    }
}

class Chinese{

    String name;
    int age;
    static String nation;

    public void eat(){
        System.out.println("吃饭");
        show();
    }

    public static void show(){
        System.out.println("我是一个中国人");
    }
}


