package com.atguigu.java;
/*
����Զ����쳣��
1.�̳����е��쳣�ṹ
2.�ṩserialVersionUID
3.�ṩ���صĹ�����
 */
public class MyExcepction extends RuntimeException{
    static final long serialVersionUID = -70348971907466939L;

    public MyExcepction() {
    }

    public MyExcepction(String message) {
        super(message);
    }
}
