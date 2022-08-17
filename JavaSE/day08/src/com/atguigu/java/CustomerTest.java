package com.atguigu.java;
/*

方法：描述类应该具有的功能

方法的声明：权限修饰符 返回值类型 方法名(形参列表){
                            方法体
                    }
    static、final、abstract来修饰方法见后文

    1.权限修饰符：private、public、缺省、protected
    2.返回值类型：有返回值 vs 没返回值
        2.1 如果方法声明有返回值，必须声明返回值的类型，同时方法中需要使用return
            关键字指定类型的变量或常量
        2.2 如果方法没有返回值，使用void表示，一般不使用return，如果要使用的话，
            只用“return;”,表示结束此方法
    3.方法名：见名知意
    4.形参列表：可以声明0，1或多个形参

    方法的使用：可以调用当前类的属性或方法


 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

    }
}

class Customer{
    String name;
    int age;
    boolean isMale;

    //方法
    public void eat(){
        System.out.println("客户吃饭");
    }

    public void sleep(int hour){
        System.out.println("休息了" + hour + "个小时");
    }

    public String getName(){
        return name;
    }

    public String getNation(String nation){
        System.out.println("我的国籍是" + nation);
        return nation;
    }
}

