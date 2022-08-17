package com.atguigu.java;

/**
 * 多线程的创建，方式一：继承于Thread类
 * 1.创建一个继承于Thread类的子类
 * 2.重写Thread类中的run() --> 将此线程执行的操作声明在run中
 * 3.创建Thread类的子类的对象
 * 4.通过此对象调用start()
 *
 * 例子：遍历100以内的所有子类
 *
 */

//1.创建一个继承于Thread类的子类
class MyThread extends Thread{
    //2.重写Thread类中的run()

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}


public class ThreadTest {
    public static void main(String[] args) {
        //3.创建Thread类的子类的对象
        MyThread t1 = new MyThread();

        //4.通过此对象调用start():①启动当前线程 ②调用当前线程的run()
        t1.start();

        //问题一：不能通过直接调用run()来启动线程
        //t1.tun();

        //问题二：在启动一个线程，遍历100以内的偶数,不可以还让start()的线程去执行
        //我们需要重新创建一个线程的对象
        MyThread t2 = new MyThread();
        t2.start();

        //如下操作仍然是在main线程中执行的
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i + "*****main()********");
            }
        }
    }
}
