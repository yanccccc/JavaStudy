package com.atguigu.java8;

public class SubClassTest {
    public static void main(String[] args) {
        SubClass s = new SubClass();
        //�ӿ��ж���ľ�̬����ֻ��ͨ���ӿ�������
//        s.method();
        CompareA.method();

        //ͨ��ʵ����Ķ�����Ե��ýӿ��е�Ĭ�Ϸ���
        //���ʵ������д�˽ӿ��е�Ĭ�Ϸ���������ʱ��Ȼ���õ�����д�Ժ�ķ���
        s.method2();
        //�������̳��˸����ʵ�ֵĽӿ�����ͬ��ͬ�����ķ�����
        //������û����д�˷�����ǰ���£����õ��Ǹ����е�ͬ��ͬ�����ķ���
        s.method3();

        System.out.println("******************");
        s.myMethod();

    }
}

class SubClass extends SuperClass implements CompareA{

    @Override
    public void method2() {
        System.out.println("SubClass�人");
    }

    @Override
    public void method3() {
        System.out.println("SubClass����");
    }

    public void myMethod(){
        method3();//�Լ���д�ķ���
        super.method3();//�����еķ���
        CompareA.super.method3();//�ӿ��еķ���
    }

}
