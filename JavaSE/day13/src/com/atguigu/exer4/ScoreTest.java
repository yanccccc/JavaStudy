package com.atguigu.exer4;

import java.util.Scanner;
import java.util.Vector;

/*
����Vector�������鴦���Ӽ��̶���ѧ���ɼ����Ը�������������������ҳ�
��߷֣������ѧ���ɼ��ȼ���
?��ʾ������һ�����������Ⱦ͹̶����䣬�����ڴ�������ǰ����Ҫ֪������
���ȡ���������java.util.Vector���Ը�����Ҫ��̬������
?����Vector����Vector v=new Vector();
?���������Ԫ�أ�v.addElement(Object obj); //obj�����Ƕ���
?ȡ�������е�Ԫ�أ�Object obj=v.elementAt(0);
?ע���һ��Ԫ�ص��±���0������ֵ��Object���͵ġ�
?���������ĳ��ȣ�v.size();
?������߷����10���ڣ�A�ȣ�20���ڣ�B�ȣ�
30���ڣ�C�ȣ�������D��
 */
public class ScoreTest {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Vector v = new Vector();
       int max = 0;
       while (true){
           System.out.println("������ѧ���ɼ����Ը������������������");
           int score = sc.nextInt();
           if(score < 0){
               break;
           }
           if(score > 100){
               System.out.println("������������ȷ�ĳɼ�");
               continue;
           }
           v.addElement(score);
           if(score > max){
               max = score;
           }
       }

        for (int i = 0; i < v.size(); i++) {
            Object obj = v.elementAt(i);
            int score = (int)obj;
            char level;
            if(max - score <= 10){
                level = 'A';
            }else if(max - score <= 20){
                level = 'B';
            }else if(max - score <= 30){
                level = 'C';
            }else {
                level = 'D';
            }
            System.out.println("student " + (i + 1) + "score is " + score + ",level is " + level);
        }

    }
}

