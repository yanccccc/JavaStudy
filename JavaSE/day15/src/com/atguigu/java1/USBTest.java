package com.atguigu.java1;
/*
接口的使用
1.接口的使用也满足多态性
2.接口实际上就是定义了一种规范
3.开发中，体会面向接口编程
 */
public class USBTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Flash flash = new Flash();
        computer.transferData(flash);
    }
}

class Computer{
    public void transferData(USB usb){
        usb.start();
        System.out.println("具体传输细节");
        usb.stop();
    }
}
interface USB{
    void start();

    void stop();
}

class Flash implements USB{

    @Override
    public void start() {
        System.out.println("U盘开始工作");
    }

    @Override
    public void stop() {
       System.out.println("U盘停止工作");

    }

}

class Printer implements USB{
    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机停止工作");

    }
}
