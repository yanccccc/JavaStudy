package com.atguigu.exer;
/*
1.	ʹ��ð������ʵ�����µ������С��������
 int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};

2.	��η�ת��������顣�����ʵ��

3. �����������飬�õ�һ���µ�����

4. ʹ�����Բ��ң������������в���22�Ƿ���ڡ����ڣ���������λ�õ������������ڣ������ʾ��Ϣ��

 */
public class day07Test {
    //���������е�������
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
        //1.ð������
        int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
        for(int i = 0;i < arr.length - 1;i++){
            for(int j = 0;j < arr.length - i - 1;j++){
                if(arr[j] > arr[j + 1]){
                    swap(arr,j,j + 1);
                }
            }
        }
        System.out.print("ð������");
        print(arr);
        System.out.println();

        //2.��η�ת��������顣�����ʵ��
        int[] arr1 = new int[]{34,5,22,-98,6,-76,0,-3};
        System.out.print("��תǰ��");
        print(arr1);
        for(int i = 0;i < arr1.length / 2;i++){
            swap(arr1,i,arr1.length - i - 1);
        }
        System.out.println();
        System.out.print("��ת��");
        print(arr1);

        //3. �����������飬�õ�һ���µ�����
        int[] arr2 = new int[arr1.length];
        for(int i = 0;i < arr1.length;i++){
            arr2[i] = arr1[i];
        }
        System.out.println();
        print(arr2);

        //4. ʹ�����Բ��ң������������в���22�Ƿ���ڡ����ڣ���������λ�õ������������ڣ������ʾ��Ϣ��
        System.out.println();
        int dest = -98;
        boolean isFlag = true;
        for(int i = 0;i < arr.length;i++){
            if(dest == arr[i]){
                System.out.println(dest + "�ڸ������λ���ǵ�" + i + "λ");
                isFlag = false;
                break;
            }
        }
        if(isFlag){
            System.out.println("û���ҵ�");
        }
    }
}
