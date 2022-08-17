package com.atguigu.java;
/*
如何自定义异常类
1.继承现有的异常结构
2.提供serialVersionUID
3.提供重载的构造器
 */
public class MyExcepction extends RuntimeException{
    static final long serialVersionUID = -70348971907466939L;

    public MyExcepction() {
    }

    public MyExcepction(String message) {
        super(message);
    }
}
