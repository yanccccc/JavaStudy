package com.atguigu.java;
/*
类中属性的使用
属性（成员变量） VS 局部变量
1.相同点：
    1.1 先声明后使用
    1.2 定义变量格式相同

2.不同点：
    2.1在类中声明的位置不同
    属性：声明在类的一对{}中
    局部变量：声明在方法内、方法形参、代码块内、构造器形参、构造器内部的变量

    2.2 关于权限修饰符的不同
    属性：可以在声明属性时，指明其权限，使用权限修饰符
        常用的权限修饰符：private、public、缺省、protected
        目前都是用缺省
    局部变量：不可以使用权限修饰符

    2.3 默认初始化值
    属性：类的属性，根据其类型，都有默认初始化值

    局部变量：没有默认初始化值
        意味着调用局部变量时一定要显示化赋值

    2.4 在内存中加载的位置
    属性：加载在堆空间
    局部变量：加载在栈空间

 */
public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.name);
        System.out.println(user.age);
        System.out.println(user.isMale);
    }

}
class User{
    //属性
    String name;
    int age;
    boolean isMale;

    public void talk(String language){//language形参,也是局部变量
        System.out.println("我们使用" + language + "进行交流");
    }

    public void eat(){
        String food = "烙饼";//局部变量
        System.out.println("北方人喜欢吃" + food);
    }
}
