package com.atguigu.java;
/*
�ɱ�������β�
 */
public class MethodArgs {
    public static void main(String[] args) {
        MethodArgs methodArgs = new MethodArgs();
        methodArgs.show(1);
        methodArgs.show("hello");
        methodArgs.show();
    }

    public void show(int i ){

    }

    public void show(String s ){
        System.out.println("s");
    }

    public void show(String ... s ){//��ȡ0/1/2/3��
        System.out.println("�ɱ��β�");
    }
}
