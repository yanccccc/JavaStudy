package com.atguigu.java;

/**
 * 创建三个窗口买票，总票数为100张,使用实现Runnable的接口来做
 *
 * 1.问题：卖票过程中，出现了重票、错票 --> 出现了线程的安全问题
 * 2.问题出现的原因：当某个线程操作车票的过程中，尚未完成操作，其他线程也参与进来，也操作车票
 * 3.如何解决：当一个线程在操作ticket时，其他线程不能参与进来。知道线程a操作完时其他线程才可以
 *   操作。这种情况即使线程a出现了阻塞，也不能改变。
 * 4.在Java中，我们通过同步机制，来解决线程安全问题。
 *
 *   方式一：同步代码块
 *   synchronized(同步监视器){
 *       //需要被同步的代码
 *   }
 *   说明：1.操作共享数据的代码，即为需要同步的代码
 *        2.共享数据：多个线程共同操作的变量，比如：本例中的ticket
 *        3.同步监视器，俗称：锁。任何一个类的对象都可以充当锁
 *          要求：多个线程共用同一把锁
 *
 *          补充：在实现Runnable接口创建多线程的方法中，可以考虑this充当监视器
 *
 *
 *   方式二：同步方法
 *      如果操作共享数据的方法完整的声明在一个方法中，我们不妨将此方法声明成同步的
 *
 * 5.同步的方式：解决了线程的安全问题
 *      操作同步代码时，只能有一个线程参与，其他线程等待。相当于是一个单线程，效率低
 */

class Window1 implements Runnable{

    private int ticket = 1000;
    //Object obj = new Object();

    @Override
    public void run() {
        while (true){
            synchronized(this){  //此时的this：唯一的Window1的对象//synchronized(obj){
                if(ticket > 0){
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    System.out.println(Thread.currentThread().getName() + "卖票：卖出的票号为:" + ticket);
                    ticket--;
                }else {
                    break;
                }
            }

        }
    }
}


public class WindowTest1 {
    public static void main(String[] args) {
        Window1 w = new Window1();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }

}
