package com.atguigu.exer;
/*
2.��д���򣬶����������ط��������á�������ΪmOL��
?���������ֱ����һ��int����������int������һ���ַ����������ֱ�
ִ��ƽ�����㲢����������˲�������������ַ�����Ϣ��
?�������main ()�����зֱ��ò��������������������
 */
public class OverLoadExer {
    public static void main(String[] args) {
        OverLoadExer overLoadExer = new OverLoadExer();
        overLoadExer.mOL(1);
        overLoadExer.mOL(2,3);
        overLoadExer.mOL("�ַ���");
    }

    public void mOL(int i){
        System.out.println("ƽ�����㣺" + i * i);
    }

    public void mOL(int i,int j){
        System.out.println("������㣺" + i * j);
    }

    public void mOL(String c){
        System.out.println(c);
    }

}
