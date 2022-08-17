package com.atguigu.java1;
/*
�ӿڵ�ʹ��
1.�ӿڵ�ʹ��Ҳ�����̬��
2.�ӿ�ʵ���Ͼ��Ƕ�����һ�ֹ淶
3.�����У��������ӿڱ��
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
        System.out.println("���崫��ϸ��");
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
        System.out.println("U�̿�ʼ����");
    }

    @Override
    public void stop() {
       System.out.println("U��ֹͣ����");

    }

}

class Printer implements USB{
    @Override
    public void start() {
        System.out.println("��ӡ����ʼ����");
    }

    @Override
    public void stop() {
        System.out.println("��ӡ��ֹͣ����");

    }
}
