package com.atguigu.java1;
/*
���Ը�ֵ���Ⱥ�˳��

1.Ĭ�ϳ�ʼ��ֵ
2.��ʾ��ʼ��
3.��������ʼ��
4.ͨ��"����.����"�ķ�ʽ��ֵ

���ϲ������Ⱥ�˳��1 -> 2 -> 3 -> 4
 */
public class UserTest {
    public static void main(String[] args) {
        User u = new User();

        System.out.println(u.age);

        User u1 = new User(2);
        u1.setAge(3);
        System.out.println(u1.age);
    }
}

class User{
    String name;
    int age = 1;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(){

    }

    public User(int a){
        age = a;
    }

}
