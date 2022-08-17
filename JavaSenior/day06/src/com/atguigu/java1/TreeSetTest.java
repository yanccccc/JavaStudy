package com.atguigu.java1;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 */
public class TreeSetTest {
    /*
    1.向TreeSet中添加的数据，要求是相同类的对象
    2.两种排序方式：自然排序 和 定制排序

    3.自然排序中，比较两个对象是否相同的标准为：compareTo()是否返回0
    4.定制排序中，比较两个对象是否相同的标准为：compare()是否返回0
     */

    @Test
    public void test1(){
        TreeSet set = new TreeSet();

        //举例1：
//        set.add(123);
//        set.add(456);
//        set.add(34);
//        set.add(45);
//        set.add(-2);

        //举例2：
        set.add(new User("Tom",12));
        set.add(new User("Jerry",22));
        set.add(new User("yc",52));
        set.add(new User("zyh",2));
        set.add(new User("hf",10));
        set.add(new User("ljx",92));
        set.add(new User("ljx",18));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2(){
        Comparator com = new Comparator() {
            //按照年龄从小到大
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof User && o2 instanceof User){
                    User u1 = (User) o1;
                    User u2 = (User) o2;
                    return Integer.compare(u1.getAge(),u2.getAge());
                }else {
                    throw new RuntimeException("输入的类型不一致");
                }
            }
        };

        TreeSet set = new TreeSet(com);
        set.add(new User("Tom",22));
        set.add(new User("Jerry",22));
        set.add(new User("yc",22));
        set.add(new User("zyh",2));
        set.add(new User("hf",10));
        set.add(new User("ljx",92));
        set.add(new User("ljx",18));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

}
