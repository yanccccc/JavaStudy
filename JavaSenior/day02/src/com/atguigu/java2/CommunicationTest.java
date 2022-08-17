package com.atguigu.java2;

/**
 * 线程通信的例子：使用两个线程打印1-100，交替打印
 *
 * 涉及到的三个方法：
 * wait():一旦执行此方法，当前线程就进入阻塞状态，并释放同步监视器
 * notify():一旦执行此方法，就会唤醒被wait的一个线程。如果有多个线程被wait，就唤醒优先级高的线程
 * notifyAll():一旦执行此方法，就会唤醒被wait的所有线程。
 *
 * 说明：
 * 1.上述三个方法必须使用在同步代码块或同步方法中。
 * 2.上述三个方法的调用者必须是同步代码块或同步方法中的同步监视器，否则会出现异常
 * 3.上述三个方法是定义在Object类中的
 *
 * 面试题：sleep()和 wait()的异同
 * 1.相同点：一旦执行方法，都可以时当前的方法进入阻塞状态
 * 2.不同点：1）两个方法声明的位置不同：Thread()类声明sleep(),Object()类声明wait()
 *          2）调用的要求并一同：sleep()可以在任何需要的场景下调用。wait()必须在同步代码块中使用
 *          3）如果两个方法都在同步代码块或同步方法中，sleep()不释放同步监视器，wait()释放同步监视器
 */

class Number implements Runnable{

    private int i = 1;
    @Override
    public void run() {

        while (true){
            synchronized(this){
                notify();
                if(i <= 100){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "打印:" + i);
                    i++;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    break;
                }
            }

        }
    }
}
public class CommunicationTest {
    public static void main(String[] args) {
        Number number = new Number();

        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}
