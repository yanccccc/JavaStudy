package com.atguigu.java;

import org.junit.Test;

import java.util.*;

public class TreeMapTest {
    //向TreeMap中添加key-value，要求key必须是同一个类创建的对象
    //因为要按照key进行排序：自然排序、定制排序
    @Test
    public void test1() {
        TreeMap map = new TreeMap();
        User u1 = new User("Tom", 23);
        User u2 = new User("Jerry", 13);
        User u3 = new User("Jack", 32);
        User u4 = new User("Rose", 18);

        map.put(u1,98);
        map.put(u2,89);
        map.put(u3,76);
        map.put(u4,100);

        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            Map.Entry entry = (Map.Entry) next;
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }

    }

    @Test
    public void test2(){
        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof User && o2 instanceof User){
                    User u1 = (User) o1;
                    User u2 = (User) o2;
                    return Integer.compare(u1.getAge(),u2.getAge());
                }
                throw new RuntimeException("输入类型不匹配");
            }
        };

        TreeMap map = new TreeMap(com);
        User u1 = new User("Tom", 23);
        User u2 = new User("Jerry", 13);
        User u3 = new User("Jack", 32);
        User u4 = new User("Rose", 18);

        map.put(u1,98);
        map.put(u2,89);
        map.put(u3,76);
        map.put(u4,100);

        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            Map.Entry entry = (Map.Entry) next;
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }
    }
}
