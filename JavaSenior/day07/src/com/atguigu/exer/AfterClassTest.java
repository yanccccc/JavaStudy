package com.atguigu.exer;

import org.junit.Test;

import java.util.*;

public class AfterClassTest {
    /*
    1.请从键盘随机输入10个整数保存到List中，并按倒序、从大到小的顺序显示出来
     */
    @Test
    public void test1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入10个整数:");
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            list.add(num);
        }

        //倒序
        Collections.reverse(list);
        System.out.println("倒序:" + list);

        Collections.sort(list);
        Collections.reverse(list);
        System.out.println("从大到小：" + list);
    }

    /*
    2.请把学生名与考试分数录入到集合中，并按分数显示前三名成绩学员的名字。
     */
    @Test
    public void test2(){
        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Student && o2 instanceof Student){
                    Student s1 = (Student) o1;
                    Student s2 = (Student) o2;
                    return -Integer.compare(s1.getScore(),s2.getScore());
                }
                throw new RuntimeException("输入类型不匹配");
            }
        };

        Map map = new TreeMap(com);
        Student s1 = new Student("TOM",76);
        Student s2 = new Student("Jerry",65);
        Student s3 = new Student("Yc",98);
        Student s4 = new Student("Ljx",100);
        Student s5 = new Student("Zyh",95);

        map.put(s1,1001);
        map.put(s2,1002);
        map.put(s3,1003);
        map.put(s4,1004);
        map.put(s5,1005);


        Set keySet = map.keySet();
        int count = 0;
        for(Object stu:keySet){
            if(count == 3){
                break;
            }
            Student s = (Student) stu;
            System.out.println("第" + (count + 1) + "名为：" + s.getName());
            count++;
        }
    }
}
