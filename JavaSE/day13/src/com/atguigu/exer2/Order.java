package com.atguigu.exer2;
/*
��дOrder�࣬��int�͵�orderId��String�͵�orderName����Ӧ��
getter()��setter()���������������Ĺ���������д�����equals()������
public boolean equals(Object obj)�����жϲ������д��������������Ƿ�
��ȡ�
 */
public class Order {
    private int orderId;
    private String orderName;

    public Order() {
    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof Order){
            Order order = (Order) obj;
            if(this.orderId == order.orderId && this.orderName.equals(order.orderName)){
                return true;
            }
        }
        return false;
    }
}
