package com.atguigu.java;
/*
方法的重载
1.定义：在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或者参数
类型不同即可。
        “两同一不同”：同一个类、相同方法名
                    参数列表不同：参数个数不同、参数类型不同

2.跟方法的修饰符、返回值类型、形参变量名和方法体都没有关系

3.在通过对象调用方法时，如何确定一个某一个指定的方法：
        ①看方法名②看参数列表
 */

public class OverLoad {

    //以下方法构成了重载
    public void getSum(int i,int j){

    }

    public void getSum(double i,int j){

    }

    public void getSum(int i,double j){

    }


}
