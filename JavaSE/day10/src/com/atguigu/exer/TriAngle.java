package com.atguigu.exer;
/*
��д�����࣬TriAngle��TriAngleTest������TriAngle��������˽�еĵ�
�߳�base�͸�height��ͬʱ����������������˽�б��������⣬�ṩ��
��Ҫ�Ĺ���������һ������ʹ����Щ�������������������ε������
 */
public class TriAngle {
    private int base;
    private int height;

    public TriAngle(){

    }

    public TriAngle(int base,int height){
        this.base = base;
        this.height = height;
    }


    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
