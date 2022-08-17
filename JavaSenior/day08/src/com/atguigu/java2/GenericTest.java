package com.atguigu.java2;

import org.junit.Test;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 1.泛型在继承方面的体现
 *
 *
 * 2.通配符的使用
 *
 *
 */
public class GenericTest {

    /*
    1.泛型在继承方面的体现

    类A时类B的父类，G<A>和G<B>没有子父类关系，是并列关系

    补充：类A是类B的父类，A<G>是B<G>的父类
     */
    @Test
    public void test1(){
        Object obj = null;
        String str = null;

        obj = str;

        List<Object> list1 = null;
        List<String> list2 = null;
        //此时的list1和list2不具有子父类关系
        //编译不通过
        //list2 = list1;

        show(list1);
    }

    public void show(List<Object> list){

    }

    public void show1(List<String> list){

    }

    @Test
    public void test2(){
        ArrayList<String> list = null;
        List<String> list1 = null;
        AbstractList<String> list2 = null;
        list2 = list;
        list1 = list;
    }
    
    /*
    通配符的使用
    通配符：?
    类A时类B的父类，G<A>和G<B>没有子父类关系.二者共同的父类G<?>
     */
    @Test
    public void test3(){
        List<Object> list1 = null;
        List<String> list2 = null;
        
        List<?> list = null;
        
        list = list1;
        list = list2;
        
//        print(list1);
//        print(list);
        
        
        List<String> list3 = new ArrayList<>();
        list3.add("AA");
        list3.add("BB");
        list3.add("CC");
        list = list3;
        //对于List<?>不能向其内部添加数据
        //除了添加null之外
//        list.add("DD");
        list.add(null);
        
        //获取：允许读取数据，读取数据的类型为Object
        Object o = list.get(0);
        System.out.println(o);
    }
    
    public void print(List<?> list){
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }

    /*
    3.有限制条件的通配符
        ?extends A:

        ?super Person:
     */
    @Test
    public void test4(){
        List<? extends Person> list1 = null;//<=
        List<? super Person> list2 = null;//>=

        List<Student> list3 = new ArrayList<>();
        List<Person> list4 = new ArrayList<>();
        List<Object> list5 = new ArrayList<>();

        list1 = list3;
        list1 = list4;
//        list1 = list5;

//        list2 = list3;
        list2 = list4;
        list2 = list5;

        list1 = list3;
        Person p = list1.get(0);

        //编译不通过
//        list1.add(new Student());

        list2 = list4;
        Object object = list2.get(0);
        list2.add(new Person());
        list2.add(new Student());



    }

}
