package com.atguigu.exer1;

public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        Circle g1 = new Circle(2.0,"Բ��",1);
        MyRectangle g2 = new MyRectangle("������",1,2,3);
        if(test.equalsArea(g1,g2)){
            System.out.println("����������");
        }else {
            System.out.println("�������");
        }
        test.displayGeometricObject(g1);
        test.displayGeometricObject(g2);

    }

    public boolean equalsArea(GeometricObject g1,GeometricObject g2){
        if(g1.findArea() == g2.findArea()){
            return true;
        }
        return false;
    }

    public void displayGeometricObject(GeometricObject g){
        System.out.println(g.color + "�����Ϊ" + g.findArea());
    }
}
