package com.atguigu.java;
/*
ģ�巽�������ģʽ
 */
public class TemlateTest {
    public static void main(String[] args) {
        Template t = new SubTemplate();
        t.spendTime();
    }
}

abstract class Template{
    public void spendTime(){
        long start = System.currentTimeMillis();

        code();

        long end = System.currentTimeMillis();

        System.out.println("���ѵ�ʱ��Ϊ��" + (end - start));

    }

    public abstract void code();
}

class SubTemplate extends Template{

    @Override
    public void code() {
        int count = 0;
        for (int i = 2; i <= 1000; i++) {
            boolean isFlag = true;
            for(int j = 2;j <= Math.sqrt(i);j++){
                if(i % j == 0){
                    isFlag = false;
                    break;
                }
            }
            if(isFlag){
                System.out.println("����Ϊ��" + i);
                count++;
            }
        }
    }
}
