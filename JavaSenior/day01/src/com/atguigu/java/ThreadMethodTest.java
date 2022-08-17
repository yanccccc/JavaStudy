package com.atguigu.java;

/**
 * 测试Thread中的常用方法
 * 1.start():启动当前线程：调用当前线程的run()
 * 2.run():通常需要重写Thread类中的此方法，将创建的线程要执行的操作声明在此方法中
 * 3.currentThread():静态方法，返回执行当前代码的线程
 * 4.getName():获取当前线程的名字
 * 5.setName():设置当前线程的名字
 * 6.yield():释放当前cpu的执行权
 * 7.join():在线程a中调用线程b的join(),线程a会进入阻塞状态，知道线程b完全执行完以后，线程a才介绍阻塞状态
 * 8.sleep(long millitime):让当前线程“睡眠”指定的millitime毫秒。
 * 10.isAlive():判断当前线程是否存活
 *
 *
 * 线程的优先级
 * MAX_PRIORITY：10
 * MIN _PRIORITY：1
 * ORM_PRIORITY：5 -> 默认优先级
 *
 * 1.如何获取和设置当前线程的优先级：
 *  getPriority()：返回线程的优先级
 *  setPriority(int newPriority)：改变线程的优先级
 *
 */
class HelloThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0)
            {
//                try {
//                    sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(Thread.currentThread().getName() + ":" + this.getPriority() + ":" + i);
            }
//            if(i % 20 == 0){
//                yield();
//            }
        }
    }
    public HelloThread(String name){
        super(name);
    }
}

public class ThreadMethodTest {
    public static void main(String[] args) {
        HelloThread h1 = new HelloThread("Thread:1");
//        h1.setName("线程1");

        //设置分线程的优先级
        h1.setPriority(Thread.MAX_PRIORITY);
        h1.start();

        //给主线程命名
        Thread.currentThread().setName("主线程");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0)
            {
                System.out.println(Thread.currentThread().getName() + ":"  + Thread.currentThread().getPriority() + ":" + i);
            }

//            if(i == 20){
//                try {
//                    h1.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }

        }
    }
}
