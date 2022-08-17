package com.atguigu.exer;
import java.util.Scanner;
public class ArrayDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学生人数：");
        int num = scanner.nextInt();
        int[] scores = new int[num];
        System.out.println("请输入" + num + "个成绩");
        for(int i = 0;i < scores.length;i++){
            scores[i] = scanner.nextInt();
        }
        int max = scores[0];
        for(int i = 1;i < scores.length;i++){
            if(scores[i] > max){
                max = scores[i];
            }
        }
        System.out.println("最高分是：" + max);
        for(int i = 0;i < scores.length;i++){
            if(scores[i] >= max - 10){
                System.out.println("student" + i + "score is" + scores[i] + "grade is A");
            }else if(scores[i] >= max - 20){
                System.out.println("student" + i + "score is" + scores[i] + "grade is B");
            }else if(scores[i] >= max - 30){
                System.out.println("student" + i + "score is" + scores[i] + "grade is C");
            }else {
                System.out.println("student" + i + "score is" + scores[i] + "grade is D");
            }

        }
    }
}
