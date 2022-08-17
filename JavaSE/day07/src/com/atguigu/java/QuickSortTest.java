package com.atguigu.java;
/*
快速排序
初始时：49 38 65 97 76 13 27 49'
第一趟：[27 38 13] 49 [76 97 65 49']
第二趟：[[13] 38 [27]] 49 [[65 49'] 76 [97]]
第三趟：[[13] 38 [27]] 49 [[49' [65]] 76 [97]]
 */
public class QuickSortTest {
    //交换数组中的两个数
    private static void swap(int[] data,int i,int j){
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
    //快速排序算法
    private static void subSort(int[] data, int start, int end) {
        if(start < end){
            int base = data[start];
            int low = start + 1;
            int high = end;
            while (true){
                while (low < end && data[low] <= base){
                    low++;
                }
                while (high > start && data[high] >= base){
                    high--;
                }
                if(low < high){
                    swap(data,low,high);
                }else
                    break;
            }

            swap(data,start,high);
            subSort(data, start,high - 1);
            subSort(data, high + 1, end);

        }
    }

    public static void quickSort(int[] data){
        subSort(data,0,data.length-1);
    }

    public static void main(String[] args) {
        int[] data = { 9, -16, 30, 23, -30, -49, 25, 21, 30 };
        System.out.println("排序之前：\n" + java.util.Arrays.toString(data));
        quickSort(data);
        System.out.println("排序之后：\n" + java.util.Arrays.toString(data));
    }
}
