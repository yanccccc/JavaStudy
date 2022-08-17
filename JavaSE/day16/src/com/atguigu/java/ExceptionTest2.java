package com.atguigu.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
�쳣����ķ�ʽ����throws + �쳣����

1.throws + �쳣���� д�ڷ�������������ָ���˷���ִ��ʱ�����ܻ���ڵ��׳����͡�
    һ��������ִ��ʱ�������쳣,�Ի�����һ���쳣��Ķ��󣬴˶�������throws���쳣����ʱ��
    �ͻᱻ�׳����쳣��������Ĵ��룬�Ͳ���ִ�У�

2.��᣺try-catch-finally����������쳣��
    throws�ķ�ʽֻ�ǽ��쳣�׸��˷����ĵ����ߣ���û�н��������쳣�����

3.���������ѡ��ʹ��try-catch-finally����throws
    3.1 ��������б���д�ķ���û��throws��ʽ�����쳣����������д��������ʹ��throws
        ��ζ��������д�ķ��������쳣��ֻ����try-catch-finally�׳��쳣
    3.2 ִ�еķ���A�У��Ⱥ��ֵ���������ļ��������������⼸������ʹ��throws���д�����ִ�е�
        ����A�п���ʹ��try-catch-finally���д���

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
