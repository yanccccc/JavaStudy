package com.atguigu.java;
/*
����ĸ��ơ���ת������
 */
public class ArrayTest3 {
    public static void main(String[] args) {
        String[] strs = new String[]{"JJ","DD","MM","GG","AA","BB"};

        //����ĸ���
        String[] arr1 = new String[strs.length];
        for(int i = 0;i < arr1.length;i++){
            arr1[i] = strs[i];
        }



        //����ķ�ת
//        String temp;
//        for(int i = 0;i < strs.length / 2;i++){
//            temp = strs[i];
//            strs[i] = strs[(strs.length - i - 1)];
//            strs[(strs.length - i - 1)] = temp;
//        }
        //����
        for(int i = 0;i < strs.length;i++){
            System.out.print(strs[i] + "\t");
        }
        //����
        //���Բ���
        System.out.println();
        String dest = "CC";
        int index = -1;
        for(int i = 0;i < strs.length;i++){
            if(dest.equals(strs[i])){
                index = i;
            }
        }
        if(index == -1){
            System.out.println("����ʧ��");
        }else {
            System.out.println("���ҳɹ����ڵ�" + index +"��λ��");
        }

        //���ַ�����
        //ǰ�᣺Ҫ���ҵ������������
        int[] arr2 = new int[]{-98,-34,2,8,30,35,68,98,105,150};
        int dest1 = -1;
        int low = 0;
        int high = arr2.length - 1;
        boolean isFlag = true;
        while (low <= high){
            int mid = (low + high) / 2;
            if(dest1 == arr2[mid]){
                System.out.println("���ҳɹ����ڵ�" + mid +"��λ��");
                isFlag = false;
                break;
            }else if(dest1 > arr2[mid]){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        if(isFlag){
            System.out.println("����ʧ��");
        }
   }
}
