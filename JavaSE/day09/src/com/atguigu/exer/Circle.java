package com.atguigu.exer;
/*����һ��Circle�࣬����һ��double�͵�radius���Դ���Բ�İ뾶��һ��
findArea()��������Բ�������
����һ����PassObject�������ж���һ������printAreas()���÷����Ķ���
���£�public void printAreas(Circle c, int time)
��printAreas�����д�ӡ���1��time֮���ÿ�������뾶ֵ���Լ���Ӧ�������
���磬timesΪ5��������뾶1��2��3��4��5���Լ���Ӧ��Բ�����
��main�����е���printAreas()������������Ϻ������ǰ�뾶ֵ���������н����ͼ
��ʾ��

 */
public class Circle {
    public static void main(String[] args) {
        PassObject passObject = new PassObject();
        Circle c = new Circle();
        passObject.printAreas(c,5);
        System.out.println("now radius is " + c.radius);

    }
    double radius;
    public double findArea(){
        return Math.PI * radius * radius;
    }
}
class PassObject{
    public void printAreas(Circle c, int time){
        System.out.println("Radius\t\tArea");
        for(int i = 1;i <= time;i++){
            c.radius = i;
            System.out.println(c.radius + "\t\t\t" + c.findArea());
        }
        c.radius = time + 1;
    }

}


