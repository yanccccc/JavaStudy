package com.atguigu.exer;
/*
4. ����������Ŀ��
������Student�������������ԣ�ѧ��number(int)���꼶state(int)���ɼ�
score(int)�� ����20��ѧ������ѧ��Ϊ1��20���꼶�ͳɼ����������ȷ����
����һ����ӡ��3�꼶(stateֵΪ3����ѧ����Ϣ��
�������ʹ��ð������ѧ���ɼ����򣬲���������ѧ����Ϣ
��ʾ��
1) �����������Math.random()������ֵ����double;
2) ��������ȡ����Math.round(double d)������ֵ����long��
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] stds = new Student[20];
        for (int i = 0; i < stds.length; i++) {
            //������Ԫ�ظ�ֵ
            stds[i] = new Student();
            //��Student���Ը�ֵ
            stds[i].number = i + 1;
            stds[i].state = (int) (Math.random() * 6 + 1);
            stds[i].score = (int) (Math.random() * 101);
        }
        //��ӡ
        for (int i = 0; i < stds.length; i++) {
            System.out.print("ѧ��Ϊ��" + stds[i].number + "\t�꼶Ϊ��" + stds[i].state + "\t�ɼ�Ϊ��" + stds[i].score);
            System.out.println();
        }
        System.out.println("*************************");
        //��ӡ�꼶Ϊ3��ѧ����Ϣ
        for (int i = 0; i < stds.length; i++) {
            if (stds[i].state == 3) {
                System.out.print("ѧ��Ϊ��" + stds[i].number + "\t�꼶Ϊ��" + stds[i].state + "\t�ɼ�Ϊ��" + stds[i].score);
                System.out.println();
            }
        }

        System.out.println("*********************");
        for (int i = 0; i < stds.length - 1; i++) {

            for (int j = 0; j < stds.length - 1 - i; j++) {
                if (stds[j].score < stds[j + 1].score) {
                    //��������Student����
                    Student stu = stds[j];
                    stds[j] = stds[j + 1];
                    stds[j + 1] = stu;
                }
            }
        }

        //������ӡ
        for (int i = 0; i < stds.length; i++) {
            System.out.print("ѧ��Ϊ��" + stds[i].number + "\t�꼶Ϊ��" + stds[i].state + "\t�ɼ�Ϊ��" + stds[i].score);
            System.out.println();
        }
    }
}

class Student {
    int number;
    int state;
    int score;
}
