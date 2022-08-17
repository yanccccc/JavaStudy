package com.atguigu.exer1;

import java.util.Scanner;

/*
定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各
类雇员对象的引用。利用循环结构遍历数组元素，输出各个对象的类
型,name,number,birthday,以及该对象生日。当键盘输入本月月份值时，如果本
月是某个Employee对象的生日，还要输出增加工资信息。
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{new HourlyEmployee("Tom",1001,new MyDate(1999,2,25),100,80)
                                ,new SalariedEmployee("Jerry",1002,new MyDate(1998,5,30),6000)};

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入当月月份：");
        int mouth = scanner.nextInt();
        for (int i = 0; i < employees.length; i++) {
            if(mouth == employees[i].getBirthday().getMonth()){
                System.out.println(employees[i].toString());
                System.out.println("该员工当月工资为" + (employees[i].earnings() + 100));
            }else {
                System.out.println(employees[i].toString());
                System.out.println("该员工当月工资为" + employees[i].earnings());
            }

        }
    }
}
