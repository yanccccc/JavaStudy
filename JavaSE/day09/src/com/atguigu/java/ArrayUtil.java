package com.atguigu.java;
/*
自定义数组的工具类
 */

public class ArrayUtil {

    //求数组的最大值
    public int getMax(int[] data){
        int maxValue = data[0];
        for(int i = 1;i < data.length;i++){
            if(data[i] > maxValue)
                maxValue = data[i];
        }
        return maxValue;
    }

    //求数组的最小值
    public int getMin(int[] data){
        int minValue = data[0];
        for(int i = 1;i < data.length;i++){
            if(data[i] < minValue)
                minValue = data[i];
        }
        return minValue;
    }

    //求数组的总和
    public int getSum(int[] data){
        int sum = 0;
        for(int i = 0;i < data.length;i++){
            sum += data[i];
        }
        return sum;
    }

    //求数组的平均
    public int getAverage(int[] data){
        return getSum(data) / data.length;
    }

    //反转数组
    public void reverse(int[] data){
        for(int i = 0;i < data.length / 2;i++){
            int temp = data[i];
            data[i] = data[data.length - i - 1];
            data[data.length - i - 1] = temp;
        }
    }
    //复制数组
    public int[] copy(int[] data){
        int[] arr1 = new int[data.length];
        for(int i = 0;i < data.length;i++){
            arr1[i] = data[i];
        }
        return arr1;
    }
    //数组排序
    public void sort(int[] data){
        //冒泡
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
    //遍历数组
    public void print(int[] data){
        for(int i = 0;i < data.length;i++){
            System.out.print(data[i] + "\t");
        }
        System.out.println();
    }

    //查找数组指定元素
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
