package com.atguigu.java1;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 一、Java中的对象，正常情况下，只能进行比较：== 或者 !=，不能使用 < 或 >
 *      但在开发场景中，我们需要对多个对象进行排序，就需要比较两个对象的大小
 *      使用两个接口的任何一个：Comparable 或 Comparator
 *
 * 二、Comparable 接口的使用
 */
public class CompareTest {

    /*
    Comparable接口的使用 ：自然排序
    1.像String、包装类等实现了Comparable 接口，重写了compareTo(obj)方法，给出了比较两个对象大小的方法
    2.重写compareTo(obj)方法的规则：
        如果当前对象this大于形参对象obj，则返回正整数，
        如果当前对象this小于形参对象obj，则返回负整数，
        如果当前对象this等于形参对象obj，则返回零。
    3.对于自定义类来说，如果需要排序，我们可以让自定义类实现Comparable接口，重写compareTo(obj)方法，
    在compareTo(obj)方法中指明如何排序
     */
    @Test
    public void test1(){
        String[] arr = new String[]{"AA","CC","BB","GG","JJ","DD"};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

    }

    @Test
    public void test2(){
        Goods[] arr = new Goods[5];
        arr[0] = new Goods("lenovo",34);
        arr[1] = new Goods("dell",43);
        arr[2] = new Goods("xiaomi",12);
        arr[3] = new Goods("huawei",65);
        arr[4] = new Goods("Asus",43);

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    /*
    Comparator接口的使用：定制排序
    1.背景：
    当元素的类型没有实现java.lang.Comparable接口而又不方便修改代码，
    或者实现了java.lang.Comparable接口的排序规则不适合当前的操作，那
    么可以考虑使用 Comparator 的对象来排序，
    2.重写compare(Object o1,Object o2)方法，比较o1和o2的大小：如果方法返
    回正整数，则表示o1大于o2；如果返回0，表示相等；返回负整数，表示
    o1小于o2。
     */

    @Test
    public void test3(){
        String[] arr = new String[]{"AA","CC","BB","GG","JJ","DD"};
        Arrays.sort(arr, new Comparator<String>() {

            //按照从大到小的顺序排列
            @Override
            public int compare(String o1, String o2) {
                if(o1 instanceof String && o2 instanceof String){
                    String s1 = (String) o1;
                    String s2 = (String) o2;

                    return -s1.compareTo(s2);
                }
                throw new RuntimeException("输入的数据类型不一致");
            }
        });

        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test4(){
        Goods[] arr = new Goods[6];
        arr[0] = new Goods("lenovo",34);
        arr[1] = new Goods("dell",43);
        arr[2] = new Goods("xiaomi",12);
        arr[3] = new Goods("huawei",65);
        arr[4] = new Goods("Asus",43);
        arr[5] = new Goods("Asus",60);

        Arrays.sort(arr, new Comparator() {
            //先按照产品名称从低到高，再按照价格从高到低
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Goods && o2 instanceof Goods){
                    Goods g1 = (Goods) o1;
                    Goods g2 = (Goods) o2;
                    if(g1.getName().equals(g2.getName())){
                        return -Double.compare(g1.getPrice(),g2.getPrice());
                    }else {
                        return g1.getName().compareTo(g2.getName());
                    }
                }
                throw new RuntimeException("输入的数据类型不一致");
            }

        });

        System.out.println(arr[0]);

        System.out.println(Arrays.toString(arr));
    }
}
