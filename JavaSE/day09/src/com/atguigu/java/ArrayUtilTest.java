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
            System.out.println("�ҵ����ڵ�" + index + "λ");
        }else
            System.out.println("û�ҵ�");

    }
}
