package com.atguigu.java;
/*

������������Ӧ�þ��еĹ���

������������Ȩ�����η� ����ֵ���� ������(�β��б�){
                            ������
                    }
    static��final��abstract�����η���������

    1.Ȩ�����η���private��public��ȱʡ��protected
    2.����ֵ���ͣ��з���ֵ vs û����ֵ
        2.1 ������������з���ֵ��������������ֵ�����ͣ�ͬʱ��������Ҫʹ��return
            �ؼ���ָ�����͵ı�������
        2.2 �������û�з���ֵ��ʹ��void��ʾ��һ�㲻ʹ��return�����Ҫʹ�õĻ���
            ֻ�á�return;��,��ʾ�����˷���
    3.������������֪��
    4.�β��б���������0��1�����β�

    ������ʹ�ã����Ե��õ�ǰ������Ի򷽷�


 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

    }
}

class Customer{
    String name;
    int age;
    boolean isMale;

    //����
    public void eat(){
        System.out.println("�ͻ��Է�");
    }

    public void sleep(int hour){
        System.out.println("��Ϣ��" + hour + "��Сʱ");
    }

    public String getName(){
        return name;
    }

    public String getNation(String nation){
        System.out.println("�ҵĹ�����" + nation);
        return nation;
    }
}

