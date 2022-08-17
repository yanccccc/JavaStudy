package com.atguigu.exer;
/*
1.	使用冒泡排序，实现如下的数组从小到大排序。
 int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};

2.	如何反转上面的数组。请代码实现

3. 复制上述数组，得到一个新的数组

4. 使用线性查找，从上述数组中查找22是否存在。存在，返回所在位置的索引。不存在，输出提示信息。

 */
public class day07Test {
    //交换数组中的两个数
    private static void swap(int[] data,int i,int j){
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
    private static void print(int[] data){
        for(int i = 0;i < data.length;i++){
            System.out.print(data[i] + "\t");
        }
    }

    public static void main(String[] args) {
        //1.冒泡排序
        int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
        for(int i = 0;i < arr.length - 1;i++){
            for(int j = 0;j < arr.length - i - 1;j++){
                if(arr[j] > arr[j + 1]){
                    swap(arr,j,j + 1);
                }
            }
        }
        System.out.print("冒泡排序：");
        print(arr);
        System.out.println();

        //2.如何反转上面的数组。请代码实现
        int[] arr1 = new int[]{34,5,22,-98,6,-76,0,-3};
        System.out.print("翻转前：");
        print(arr1);
        for(int i = 0;i < arr1.length / 2;i++){
            swap(arr1,i,arr1.length - i - 1);
        }
        System.out.println();
        System.out.print("翻转后：");
        print(arr1);

        //3. 复制上述数组，得到一个新的数组
        int[] arr2 = new int[arr1.length];
        for(int i = 0;i < arr1.length;i++){
            arr2[i] = arr1[i];
        }
        System.out.println();
        print(arr2);

        //4. 使用线性查找，从上述数组中查找22是否存在。存在，返回所在位置的索引。不存在，输出提示信息。
        System.out.println();
        int dest = -98;
        boolean isFlag = true;
        for(int i = 0;i < arr.length;i++){
            if(dest == arr[i]){
                System.out.println(dest + "在该数组的位置是第" + i + "位");
                isFlag = false;
                break;
            }
        }
        if(isFlag){
            System.out.println("没有找到");
        }
    }
}
