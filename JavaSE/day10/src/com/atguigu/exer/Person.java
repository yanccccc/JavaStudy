package com.atguigu.exer;
/*
��������,�����ж��������ࣺPerson��PersonTest�ࡣ�������£�
��setAge()�����˵ĺϷ�����(0~130)����getAge()�����˵����䡣
�� PersonTest �� ��ʵ���� Person ��Ķ��� b �� �� �� setAge() ��
getAge()���������Java�ķ�װ�ԡ�

��ǰ�涨���Person������ӹ����������ù��������������˵�age��
�Գ�ʼֵ��Ϊ18��
2. �޸���������͹�����������name����,ʹ��ÿ�δ���Person�����ͬ
ʱ��ʼ�������age����ֵ��name����ֵ��

 */
public class Person {
    private int age;
    private String name;

    public Person(){
        age = 18;
    }

    public Person(int n,String s){
        age = n;
        name = s;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
        if(this.age <= 130 && this.age >= 0){
            this.age = age;
        }else {
            System.out.println("���Ϸ�");
        }
    }

    public int getAge(){
        return age;
    }
}
