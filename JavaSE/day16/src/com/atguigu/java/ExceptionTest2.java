package com.atguigu.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
异常处理的方式二：throws + 异常类型

1.throws + 异常类型 写在方法的声明处，指明此方法执行时，可能会存在的抛出类型。
    一旦方法体执行时，出现异常,仍会生成一个异常类的对象，此对象满足throws后异常类型时，
    就会被抛出。异常代码后续的代码，就不再执行！

2.体会：try-catch-finally真正处理掉异常了
    throws的方式只是将异常抛给了方法的调用者，并没有将真正的异常处理掉

3.开发中如何选择使用try-catch-finally还是throws
    3.1 如果父类中被重写的方法没有throws方式处理异常，则子类重写方法不能使用throws
        意味着子类重写的方法中有异常，只能用try-catch-finally抛出异常
    3.2 执行的方法A中，先后又调用了另外的几个方法，建议这几个方法使用throws进行处理。而执行的
        方法A中考虑使用try-catch-finally进行处理

 */
public class ExceptionTest2 {

    public void method2() throws IOException{
        method();
    }

    public void method() throws IOException {
        File file = new File("hello.txt");
        FileInputStream fis = new FileInputStream(file);

        int data = fis.read();
        while (data != -1){
            System.out.println((char) data);
            data = fis.read();
        }

        fis.close();

        System.out.println("hhh");
    }
}
