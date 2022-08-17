package com.atguigu.java;
/*
引用数据类型的值不是null就是地址

匿名对象的使用
1.我们创建的对象没有显示的赋变量名，即为匿名对象
2.匿名对象只能调用一次

 */
public class InstanceTest {
    public static void main(String[] args) {
        Phone p = new Phone();

        //匿名
//        new Phone().sendEmail();
//        new Phone().playGame();

        new Phone().price = 1999;
        new Phone().showPrice();
    }
}

class Phone{
    double price;

    public void sendEmail(){
        System.out.println("发邮件");
    }

    public void playGame(){
        System.out.println("玩游戏");
    }

    public void showPrice(){
        System.out.println("价格为" + price);

    }


}
