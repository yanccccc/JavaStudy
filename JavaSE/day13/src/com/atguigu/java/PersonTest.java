package com.atguigu.java;
/*
�����������֮������̬��

1.����̬�ԣ��������Ϊһ������Ķ�����̬
2.��Ϊ��̬�ԣ�
        ����Ķ�̬�ԣ����������ָ������Ķ���
3.��̬��ʹ�ã����ⷽ���ĵ���
        ���˶���Ķ�̬���Ժ������ڱ�����ֻ�ܵ��ø��������ķ��������������ڣ�����ʵ��ִ�еĵ���������д����ķ���
        �ܽ᣺���뿴��ߣ�ִ�п��ұ�
4.��̬�Ե�ʹ��ǰ��
        4.1 Ҫ����ļ̳й�ϵ
        4.2 ��������д

5.����Ķ�̬��ֻ�����뷽��������������

********************************************

 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();

        Man man = new Man();
        man.eat();
        man.age = 22;
        man.earnMoney();
        System.out.println("**************");

        //*************************
        //��̬�ԣ����������ָ������Ķ���
        Person p2 = new Man();
        //��̬��ʹ�ã��������Ӹ���ͬ��ͬ�����ķ���ʱ��ʵ��ִ�е���������д����ķ���--���ⷽ������
        p2.eat();
        p2.walk();
        //���ܵ����������еķ���
        //p2.earnMoney();

        System.out.println("********************");
        //���˶���Ķ�̬���Ժ��ڴ���ʵ���Ǽ������������е����Ժͷ����ģ��������ڱ�������Ϊ�����ͣ�����
        //����ʱ��ֻ�ܵ��ø��������������Ժͷ������������е����Ժͷ������ܵ���

        //��β��ܵ����������е����Ժͷ���
        //����ת�ͣ�ʹ��ǿ������ת����
        Man m1 = (Man) p2;
        m1.earnMoney();
        m1.isSmoking = true;

        //ʹ��ǿתʱ���ܳ����쳣
//        Woman w1 = (Woman) p2;
//        w1.goShopping();

        /*
        instanceof�ؼ��ֵ�ʹ��

        a instanceof A���ж�a�Ƿ���A��ʵ��������ǣ�����ture��������ǣ�����false
        Ϊ�˱���������ת��ʱ�����쳣������������ת��ʱ���Ƚ���instanceof�ж�

        ���a instanceof A����ture��B��A�ĸ��࣬��a instanceof BҲ����ture
         */
        if(p2 instanceof Woman){
            Woman w1 = (Woman) p2;
            w1.goShopping();
            System.out.println("******Woman******");
        }

        if(p2 instanceof Man){
            Man w1 = (Man) p2;
            ((Man) p2).earnMoney();
            System.out.println("******Man******");
        }

        if(p2 instanceof Person){
            System.out.println("person*********");
        }

        //����ʱͨ�������в�ͨ��
//        Person p3 = new Woman();
//        Man m3 = (Man)p3;

        //����ͨ��������Ҳͨ��
        Object obj = new Woman();
        Person p = (Person) obj;

        //���벻ͨ��
        //Man m5 = new Woman();


    }
}
