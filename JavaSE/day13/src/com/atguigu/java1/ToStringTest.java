package com.atguigu.java1;

/*
Object类中toString()的使用：

1.当我们输出一个对象的引用时，实际上就是调用对象的toString()

2.Object类中toString()的使用定义：
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

3.像String、Date、File、包装类都重写了Object类中的toString()方法。
    使得在调用对象的toString()时，返回实体信息。

4.自定义类也可以重写toString()方法，当调用此方法时返回对象的实体内容

 */
public class ToStringTest {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Tom",21);
        System.out.println(cust1.toString());
        System.out.println(cust1);
    }

}
