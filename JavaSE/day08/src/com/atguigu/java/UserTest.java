package com.atguigu.java;
/*
�������Ե�ʹ��
���ԣ���Ա������ VS �ֲ�����
1.��ͬ�㣺
    1.1 ��������ʹ��
    1.2 ���������ʽ��ͬ

2.��ͬ�㣺
    2.1������������λ�ò�ͬ
    ���ԣ����������һ��{}��
    �ֲ������������ڷ����ڡ������βΡ�������ڡ��������βΡ��������ڲ��ı���

    2.2 ����Ȩ�����η��Ĳ�ͬ
    ���ԣ���������������ʱ��ָ����Ȩ�ޣ�ʹ��Ȩ�����η�
        ���õ�Ȩ�����η���private��public��ȱʡ��protected
        Ŀǰ������ȱʡ
    �ֲ�������������ʹ��Ȩ�����η�

    2.3 Ĭ�ϳ�ʼ��ֵ
    ���ԣ�������ԣ����������ͣ�����Ĭ�ϳ�ʼ��ֵ

    �ֲ�������û��Ĭ�ϳ�ʼ��ֵ
        ��ζ�ŵ��þֲ�����ʱһ��Ҫ��ʾ����ֵ

    2.4 ���ڴ��м��ص�λ��
    ���ԣ������ڶѿռ�
    �ֲ�������������ջ�ռ�

 */
public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.name);
        System.out.println(user.age);
        System.out.println(user.isMale);
    }

}
class User{
    //����
    String name;
    int age;
    boolean isMale;

    public void talk(String language){//language�β�,Ҳ�Ǿֲ�����
        System.out.println("����ʹ��" + language + "���н���");
    }

    public void eat(){
        String food = "�ӱ�";//�ֲ�����
        System.out.println("������ϲ����" + food);
    }
}
