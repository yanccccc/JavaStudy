package com.atguigu.java;
/*
�����������͵�ֵ����null���ǵ�ַ

���������ʹ��
1.���Ǵ����Ķ���û����ʾ�ĸ�����������Ϊ��������
2.��������ֻ�ܵ���һ��

 */
public class InstanceTest {
    public static void main(String[] args) {
        Phone p = new Phone();

        //����
//        new Phone().sendEmail();
//        new Phone().playGame();

        new Phone().price = 1999;
        new Phone().showPrice();
    }
}

class Phone{
    double price;

    public void sendEmail(){
        System.out.println("���ʼ�");
    }

    public void playGame(){
        System.out.println("����Ϸ");
    }

    public void showPrice(){
        System.out.println("�۸�Ϊ" + price);

    }


}
