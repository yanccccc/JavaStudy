package com.atguigu.exer;
/*
4. 对象数组题目：
定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩
score(int)。 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
问题一：打印出3年级(state值为3）的学生信息。
问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
提示：
1) 生成随机数：Math.random()，返回值类型double;
2) 四舍五入取整：Math.round(double d)，返回值类型long。
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] stds = new Student[20];
        for (int i = 0; i < stds.length; i++) {
            //给数组元素赋值
            stds[i] = new Student();
            //给Student属性赋值
            stds[i].number = i + 1;
            stds[i].state = (int) (Math.random() * 6 + 1);
            stds[i].score = (int) (Math.random() * 101);
        }
        //打印
        for (int i = 0; i < stds.length; i++) {
            System.out.print("学号为：" + stds[i].number + "\t年级为：" + stds[i].state + "\t成绩为：" + stds[i].score);
            System.out.println();
        }
        System.out.println("*************************");
        //打印年级为3的学生信息
        for (int i = 0; i < stds.length; i++) {
            if (stds[i].state == 3) {
                System.out.print("学号为：" + stds[i].number + "\t年级为：" + stds[i].state + "\t成绩为：" + stds[i].score);
                System.out.println();
            }
        }

        System.out.println("*********************");
        for (int i = 0; i < stds.length - 1; i++) {

            for (int j = 0; j < stds.length - 1 - i; j++) {
                if (stds[j].score < stds[j + 1].score) {
                    //交换的是Student对象
                    Student stu = stds[j];
                    stds[j] = stds[j + 1];
                    stds[j + 1] = stu;
                }
            }
        }

        //排序后打印
        for (int i = 0; i < stds.length; i++) {
            System.out.print("学号为：" + stds[i].number + "\t年级为：" + stds[i].state + "\t成绩为：" + stds[i].score);
            System.out.println();
        }
    }
}

class Student {
    int number;
    int state;
    int score;
}
