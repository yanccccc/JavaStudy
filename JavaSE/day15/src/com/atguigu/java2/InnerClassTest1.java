package com.atguigu.java2;

public class InnerClassTest1 {



    //����һ��ʵ����Comparable�ӿڵ������
    public Comparable getComparable(){

        class MyComparable implements Comparable{

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }

        return new MyComparable();
    }
}
