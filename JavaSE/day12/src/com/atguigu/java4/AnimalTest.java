package com.atguigu.java4;
//��̬�Ե�ʹ�þ���
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.fun(new Dog());

        test.fun(new Cat());
    }


    public void fun(Animal animal){
        animal.eat();
        animal.shout();
    }
}

class Animal{
    public void eat(){
        System.out.println("�����ʳ");
    }

    public void shout(){
        System.out.println("�������");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("���Թ�ͷ");
    }

    @Override
    public void shout() {
        System.out.println("������");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("è����");
    }

    @Override
    public void shout() {
        System.out.println("è����");
    }
}
