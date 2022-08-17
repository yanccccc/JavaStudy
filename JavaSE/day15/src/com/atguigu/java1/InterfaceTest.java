package com.atguigu.java1;
/*
�ӿڵ�ʹ��
1.�ӿ�ʹ��interface������
2.Java�У��ӿں����ǲ��еĽṹ
3.��ζ���ӿڣ�����ӿ��еĳ�Ա
    3.1 JDK7����ǰ��ֻ�ܶ��峣���ͳ��󷽷�
        >ȫ�ֳ�����public static final��,��дʱ����ʡ�Բ�д
        >���󷽷���public abstract��

    3.2 JDK8�����˶��峣���ͳ��󷽷�֮�⣬�����Զ��徲̬������Ĭ�Ϸ���

4.�ӿ��в��ܶ��幹��������ζ�Žӿڲ��ܱ�ʵ����

5.java�У��ӿ�ͨ������ȥʵ�ֵķ�����ʹ��
    ���ʵ���า���˽ӿ��е�����ʵ����������������ʵ����
    ���ʵ����û�и��ǽӿ��е�����ʵ���������������Ȼ��һ��������

6.Java�����ʵ�ֶ���ӿ� ---> �ֲ���Java�ĵ��̳���

7.�ӿ���ӿ�֮����Լ̳У����Զ�̳�

8.�ӿھ����ʹ�ÿ���ʵ�ֶ�̬��

9.�ӿ�ʵ���Ͽ��Կ���һ���淶

������ͽӿ�����Щ��ͬ��
��ͬ�㣺����ʵ�����������Ա��̳�
��ͬ�㣺�������й��������ӿڲ�������������
        �������ǵ��̳У��ӿڿ��Զ�̳�

 */
public class InterfaceTest {
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.fly();
    }
}

interface Flyable{
    //ȫ�ֳ���
    public static final int MAX_SPEED = 7900;
    public static final int MIN_SPEED = 1;

    //���󷽷�
    public abstract void fly();
    //ʡ����public abstract
    void stop();
}

interface Attackable{
    public abstract void attack();
}

class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("�ɻ����");
    }

    @Override
    public void stop() {
        System.out.println("�ɻ�ֹͣ");
    }
}

abstract class Kite implements Flyable{

}

class Bullet implements Flyable,Attackable,CC{

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {

    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}

//****************

interface AA{
    void method1();
}

interface BB{
    void method2();
}

interface CC extends AA,BB{

}
