package com.atguigu.java2;

public class InnerClassTest1 {



    //返回一个实现了Comparable接口的类对象
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
