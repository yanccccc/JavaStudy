package com.atguigu.exer;

/*
������Ŀ������һ������Ϊ6��int�����飬Ҫ��ȡֵΪ1-30��ͬʱԪ��ֵ������ͬ
 */
public class RandomExer {
    public static void main(String[] args) {
        int[] arr = new int[6];
        for(int i = 0;i < arr.length;i++){
            arr[i] = (int)(Math.random()*30 + 1);//[0,1) [0,30) [1,31)
            boolean flag = false;
            while (true){
                for(int j = 0;j < i;j++){
                    if(arr[i] == arr[j]){
                        flag = true;
                        break;
                    }
                }
                if(flag){
                    arr[i] = (int)(Math.random()*30 + 1);
                    flag = false;
                    continue;
                }
                break;
            }
        }
        //��ӡ
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
