package com.atguigu.java3;
/*
final:���յ�

1.final�����������εĽṹ���ࡢ����������
2.final������������һ���ࣺ���಻�ܱ�������̳�
                        String�ࡢSystem�ࡢStringBuffer��

3.final�������η����������˷��������Ա���д

4.final�������α�������ʱ�ı����ͳ�Ϊ��һ������
        4.1 final�������ԣ����Կ��Ǹ�ֵ��λ���У���ʽ��ʼ��������顢������
        4.2 final���ξֲ�����:
            ������final�����β�ʱ�������β���һ�������������ǵ��ô˷���ʱ����������һ��ʵ�Σ�
            һ����ֵ�Ժ󣬾�ֻ���ڷ�������ʹ�ô��βΣ����������¸�ֵ��


static final �����������ԣ�ȫ�ֳ���


 */
public class FinalTest {

    final int WIDTH = 0;
    final int LEFT;
    final int RIGHT;
    {
        LEFT = 1;
    }

    public FinalTest(){
        RIGHT = 2;
    }

    public static void main(String[] args) {
        final int num = 10;

//        num += 5;
    }
}

final class FinalA{

}

class AA{
    public final void show(){

    }
}

class BB extends AA{

//    public void show() {
//
//    }
}

