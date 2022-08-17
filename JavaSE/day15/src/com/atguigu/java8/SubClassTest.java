package com.atguigu.java8;

public class SubClassTest {
    public static void main(String[] args) {
        SubClass s = new SubClass();
        //接口中定义的静态方法只能通过接口来调用
//        s.method();
        CompareA.method();

        //通过实现类的对象可以调用接口中的默认方法
        //如果实现类重写了接口中的默认方法，调用时仍然调用的是重写以后的方法
        s.method2();
        //如果子类继承了父类的实现的接口中有同名同参数的方法，
        //子类在没有重写此方法的前提下，调用的是父类中的同名同参数的方法
        s.method3();

        System.out.println("******************");
        s.myMethod();

    }
}

class SubClass extends SuperClass implements CompareA{

    @Override
    public void method2() {
        System.out.println("SubClass武汉");
    }

    @Override
    public void method3() {
        System.out.println("SubClass鄂州");
    }

    public void myMethod(){
        method3();//自己重写的方法
        super.method3();//父类中的方法
        CompareA.super.method3();//接口中的方法
    }

}
