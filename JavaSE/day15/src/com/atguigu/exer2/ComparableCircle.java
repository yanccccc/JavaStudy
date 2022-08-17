package com.atguigu.exer2;
/*
����һ��ComparableCircle�࣬�̳�Circle�ಢ��ʵ��CompareObject�ӿڡ���
ComparableCircle���и����ӿ��з���compareTo��ʵ���壬�����Ƚ�����Բ�İ�
����С��
 */
public class ComparableCircle extends Circle implements CompareObject{

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof  ComparableCircle){
            ComparableCircle c = (ComparableCircle) o;
            if(this.getRadius() > c.getRadius()){
                return 1;
            }else if(this.getRadius() == c.getRadius()){
                return 0;
            }else {
                return -1;
            }
        }else {
            return -2;
        }
    }
}
