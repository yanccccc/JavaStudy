package com.atguigu.java3;
/*
子类实例化的全过程

1.从结果来看：
        子类继承父类以后，就获取了父类的声明和方法
        创建子类的对象，在堆空间中，就会加载父类声明的属性

2.从过程上看：
        当我们通过子类的构造器创建子类对象时，我们一定会直接或间接的调用父类的构造器
        直到调用了java.lang.Object类中空参的构造器。正因为加载过所有的父类的结构，所以
        在内存中有父类中的结构，子类对象才可以考虑调用。

        子类只创建了一个对象，即new的对象
 */
public class InstanceTest {
}
