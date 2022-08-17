package com.atguigu.java3;
/*
属性的先后赋值
1.默认初始化
2.显示初始化/5.在代码块中赋值
3.构造器中初始化
4.通过“对象.属性”或“对象.方法”的方式进行赋值

顺序：1-2/5-4-3
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.id);
    }

}

class Order{
    int id = 3;
    {
        id = 4;
    }
}
