package com.atguigu.java;
/*
������Kids�̳�ManKind��������
?��Ա����int yearsOld��
?����printAge()��ӡyearsOld��ֵ��
 */
public class Kids extends ManKind{
    private int yearsOld;

    public Kids() {
    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge(){
        System.out.println("����Ϊ��" + yearsOld);
    }

    public void employeed(){
        System.out.println("Kids should study and no job.");
    }
}
