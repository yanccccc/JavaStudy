package com.atguigu.exer;

import java.lang.reflect.Array;

/*
��дӦ�ó���EcmDef.java�����������е�����������Ҫ�������븺��������
���������
���������Ͳ�һ��(NumberFormatException) �� ȱ���������(ArrayIndexOutOfBoundsException)��
��0(ArithmeticException)�����븺��(EcDef �Զ�����쳣)�����쳣����
��ʾ��
(1)������(EcmDef)�ж����쳣����(ecm)�������������ܡ�
(2)��main()������ʹ���쳣�����������쳣����
(3)�ڳ����У��Զ����Ӧ���븺�����쳣��(EcDef)��
(4)����ʱ���ܲ��� java EcmDef 20 10 //args[0]=��20�� args[1]=��10��
(5)Interger���static����parseInt(String s)��sת���ɶ�Ӧ��intֵ��
�磺int a=Interger.parseInt(��314��); //a=314
 */
public class EcmDef {
    public static void main(String[] args) {

        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int result = ecm(a,b);
            System.out.println(result);
        }catch (NumberFormatException e){
            System.out.println("�������Ͳ�һ��");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ȱ���������");
        }catch (ArithmeticException e){
            System.out.println("��0");
        }catch (EcDef e){
            System.out.println(e.getMessage());
        }

    }


    static int ecm(int a,int b) throws EcDef {
        if(a < 0 || b < 0){
            throw new EcDef("���ӻ��ĸ���ڸ���");
        }
        return a / b;
    }
}
