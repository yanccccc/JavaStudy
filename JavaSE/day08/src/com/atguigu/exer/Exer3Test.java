package com.atguigu.exer;
/*
3.1 ��д��������һ��method�������ڷ����д�ӡһ��10*8 ��*�;��Σ�
��main�����е��ø÷�����
3.2 �޸���һ��������method�����У�����ӡһ��10*8��*�;����⣬��
����þ��ε��������������Ϊ��������ֵ����main�����е��ø÷�����
���շ��ص����ֵ����ӡ��
3.3 �޸���һ��������method�����ṩm��n���������������д�ӡһ��
m*n��*�;��Σ�������þ��ε������ ������Ϊ��������ֵ����main����
�е��ø÷��������շ��ص����ֵ����ӡ��


 */

public class Exer3Test {
    public static void main(String[] args) {
        Exer3Test exer3Test = new Exer3Test();
        System.out.println(exer3Test.method(5,4));


    }
        //3.1
//    public void method() {
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 8; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    //3.2
//    public int method(){
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 8; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        return 10 * 8;
//    }

    //3.3
    public int method(int m,int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return m * n;
    }


}

