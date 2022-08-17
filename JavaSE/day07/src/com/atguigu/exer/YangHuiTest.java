package com.atguigu.exer;
/*
1. ��һ���� 1 ��Ԫ��, �� n ���� n ��Ԫ��
2. ÿһ�еĵ�һ��Ԫ�غ����һ��Ԫ�ض��� 1
3. �ӵ����п�ʼ, ���ڷǵ�һ��Ԫ�غ����һ��Ԫ
�ص�Ԫ�ء�����
yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];

 */
public class YangHuiTest {
    public static void main(String[] args) {
        int[][] arr = new int[10][];
        //ÿһ�еĵ�һ��Ԫ�غ����һ��Ԫ�ض��� 1
        for(int i = 0;i < arr.length;i++){
            arr[i] = new int[i + 1];
            arr[i][0] = 1;
            arr[i][i] = 1;
        }
        //�ӵ����п�ʼ, ���ڷǵ�һ��Ԫ�غ����һ��Ԫ
        //�ص�Ԫ�ء�����
        //yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
        for(int i = 2;i < arr.length;i++){
            for(int j = 1;j < arr[i].length - 1;j++){
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        //��ӡ
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
