package com.atguigu.exer1;
/*
MyDate�����:
private��Ա����year,month,day ��
toDateString()�����������ڶ�Ӧ���ַ�����xxxx��xx��xx��

 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String toDateString() {
        return year + "��" + month + "��" + day + "��";
    }
}
