package com.atguigu.java;
/*
�Զ�������Ĺ�����
 */

public class ArrayUtil {

    //����������ֵ
    public int getMax(int[] data){
        int maxValue = data[0];
        for(int i = 1;i < data.length;i++){
            if(data[i] > maxValue)
                maxValue = data[i];
        }
        return maxValue;
    }

    //���������Сֵ
    public int getMin(int[] data){
        int minValue = data[0];
        for(int i = 1;i < data.length;i++){
            if(data[i] < minValue)
                minValue = data[i];
        }
        return minValue;
    }

    //��������ܺ�
    public int getSum(int[] data){
        int sum = 0;
        for(int i = 0;i < data.length;i++){
            sum += data[i];
        }
        return sum;
    }

    //�������ƽ��
    public int getAverage(int[] data){
        return getSum(data) / data.length;
    }

    //��ת����
    public void reverse(int[] data){
        for(int i = 0;i < data.length / 2;i++){
            int temp = data[i];
            data[i] = data[data.length - i - 1];
            data[data.length - i - 1] = temp;
        }
    }
    //��������
    public int[] copy(int[] data){
        int[] arr1 = new int[data.length];
        for(int i = 0;i < data.length;i++){
            arr1[i] = data[i];
        }
        return arr1;
    }
    //��������
    public void sort(int[] data){
        //ð��
        for(int i = 0;i < data.length - 1;i++){
            for(int j = 0;j < data.length - i - 1;j++){
                if(data[j] > data[j + 1]){
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }
    //��������
    public void print(int[] data){
        for(int i = 0;i < data.length;i++){
            System.out.print(data[i] + "\t");
        }
        System.out.println();
    }

    //��������ָ��Ԫ��
    public int getIndex(int[] data,int dest){
        int index = -1;
        for (int i = 0;i < data.length;i++){
            if(data[i] == dest){
                index = i;
                break;
            }
        }
        return index;
    }

}
