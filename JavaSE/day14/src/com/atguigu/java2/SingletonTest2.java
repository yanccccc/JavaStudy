package com.atguigu.java2;

/*
����ģʽ������ʽʵ��
 */
public class SingletonTest2 {
    public static void main(String[] args) {
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();

        System.out.println(order1 == order2);
    }
}

class Order{
    //1.˽�л���Ĺ�����
    private Order(){

    }

    //2.���ɵ�ǰ�����û�г�ʼ��
    //4.�˶���Ҳ��������Ϊstatic��
    private static Order instance = null;

    //3.�������ص�ǰ�����ķ���
    public static Order getInstance(){
        if(instance == null){
            instance = new Order();
        }
        return instance;
    }
}
