package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 *
 */
public class CollectionTest {
    @Test
    public void test1() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
//        Person p = new Person("Jerry",20);
//        coll.add(p);
        coll.add(new Person("Jerry", 20));

        //1.contains(Object o):判断当前集合中是否包含obj
        //我们在判断时会调用对象所在类的equals()
        boolean contains = coll.contains(123);
        System.out.println(contains);
        System.out.println(coll.contains(new String("Tom")));
//        System.out.println(coll.contains(p));
        System.out.println(coll.contains(new Person("Jerry", 20)));

        //2.containsAll(Collection coll1):判断coll1中的所有元素是否都存在于当前集合中
        Collection coll1 = Arrays.asList(123, 456);
        System.out.println(coll.containsAll(coll1));
    }


    @Test
    public void test2() {
        //3.remove(Object obj):从当前集合中移除obj元素
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry", 20));

        coll.remove(123);
        System.out.println(coll);

        //4.removeAll(Collection coll1):从当前集合中一处coll1中所有的元素
        Collection coll1 = Arrays.asList(123, 4567);
        coll.removeAll(coll1);
        System.out.println(coll);

    }

    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry", 20));

        //5.retainAll(Collection coll1):交集：获取当前集合coll1集合的交集办公返回给当前集合
//        Collection coll1 = Arrays.asList(123, 456,789);
//        coll.retainAll(coll1);
//        System.out.println(coll);

        //6.equals(Object obj):判断当前集合和形参是否一致
        Collection coll1 = new ArrayList();
        coll1.add(456);
        coll1.add(123);
        coll1.add(new String("Tom"));
        coll1.add(false);
        coll1.add(new Person("Jerry", 20));
        System.out.println(coll.equals(coll1));

    }

    @Test
    public void test4(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry", 20));

        //7.hashcode():返回当前对象的哈希值
        System.out.println(coll.hashCode());

        //8.集合 ————> 数组 toArray():
        Object[] objects = coll.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

        //数组 ---> 集合 asList()
        List<String> strings = Arrays.asList("AA","BB","CC");
        System.out.println(strings);

        List arr1 = Arrays.asList(new int[]{123,456});
        System.out.println(arr1.size());//1

        List arr2 = Arrays.asList(new Integer[]{123,456});
        System.out.println(arr2.size());//2

        //iterator():返回iterator接口的实例，用于遍历元素。放在iteratorTest中测试
    }
}
