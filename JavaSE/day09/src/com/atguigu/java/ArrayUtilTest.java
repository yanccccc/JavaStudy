package com.atguigu.java;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{24,56,4,98,-42,60,105,78,65};
        int max = util.getMax(arr);
        System.out.println(max);

        util.print(arr);
        util.sort(arr);
        util.print(arr);

        int index = util.getIndex(arr,4);
        if(index >= 0){
            System.out.println("找到了在第" + index + "位");
        }else
            System.out.println("没找到");

    }
}
