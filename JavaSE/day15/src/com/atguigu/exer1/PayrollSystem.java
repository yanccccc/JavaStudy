package com.atguigu.exer1;

import java.util.Scanner;

/*
����PayrollSystem�࣬����Employee�������鲢��ʼ�����������Ÿ�
���Ա��������á�����ѭ���ṹ��������Ԫ�أ���������������
��,name,number,birthday,�Լ��ö������ա����������뱾���·�ֵʱ�������
����ĳ��Employee��������գ���Ҫ������ӹ�����Ϣ��
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{new HourlyEmployee("Tom",1001,new MyDate(1999,2,25),100,80)
                                ,new SalariedEmployee("Jerry",1002,new MyDate(1998,5,30),6000)};

        Scanner scanner = new Scanner(System.in);
        System.out.print("�����뵱���·ݣ�");
        int mouth = scanner.nextInt();
        for (int i = 0; i < employees.length; i++) {
            if(mouth == employees[i].getBirthday().getMonth()){
                System.out.println(employees[i].toString());
                System.out.println("��Ա�����¹���Ϊ" + (employees[i].earnings() + 100));
            }else {
                System.out.println(employees[i].toString());
                System.out.println("��Ա�����¹���Ϊ" + employees[i].earnings());
            }

        }
    }
}
