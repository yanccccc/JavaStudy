package com.atguigu.java;
/*
ʹ�ü�����
(1)����һ����ΪArrayTest���࣬��main()����������array1��array2����������
������int[]���͵����顣
(2)ʹ�ô�����{}����array1��ʼ��Ϊ8��������2,3,5,7,11,13,17,19��
(3)��ʾarray1�����ݡ�
(4)��ֵarray2��������array1���޸�array2�е�ż����Ԫ�أ�ʹ���������ֵ
(��array[0]=0,array[2]=2)����ӡ��array1��
˼����array1��array2��ʲô��ϵ����ֵַ��ͬ
��չ���޸���Ŀ��ʵ��array2��array1����ĸ���

 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] array1 = new int[]{2,3,5,7,11,13,17,19};
        int[] array2;

        for(int i = 0;i < array1.length;i++){
            System.out.print(array1[i] + "\t");
        }
        //��ַ�ĸ��Ʋ�������ĸ���
        array2 = array1;
        for(int i = 0;i < array2.length;i += 2){
            array2[i] = i;
        }
        System.out.println("");
        for(int i = 0;i < array1.length;i++){
            System.out.print(array1[i] + "\t");
        }

    }
}
