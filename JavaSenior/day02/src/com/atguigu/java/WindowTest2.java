package com.atguigu.java;

/**
 * 创建三个窗口买票，总票数为100张,使用继承的方法去做
 *
 * 使用同步代码块解决线程安全问题
 * 共用对象要使用static
 * 在继承Thread类创建多线程中，慎用this充当同步监视器，可以用类来充当
 */

class Window2 extends Thread{
    private static int ticket = 100;
    static Object obj = new Object();

    @Override
    public void run() {
        while (true){
            synchronized(Window2.class){//Window2只会加载一次
//            synchronized(obj){
                //错误的，此时的this代表三个对象
                //synchronized(this)
                if(ticket > 0){

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(getName() + "卖票：卖出的票号为" + ticket);
                    ticket--;
                }else {
                    break;
                }
            }
        }
    }
}

public class WindowTest2 {
    public static void main(String[] args) {
        Window2 w1 = new Window2();
        Window2 w2 = new Window2();
        Window2 w3 = new Window2();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}

