package com.atguigu.java1;

import com.atguigu.java.Person;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * |----Collection接口：单列集合：用来存储一个一个的对象
 *            |----Set接口：存储无序的、不可重复的数据  ---> 高中讲的集合
 *                |----HashSet:作为Set接口的主要实现类：线程不安全的：可以存储null值
 *                      |----LinkedHashSet：作为HashSet的子类，遍历其内部数据时，可以按照添加的顺序遍历
 *                |----TreeSet：可以按照添加对象的指定属性，进行排序。
 *
 *  1.Set接口中没有额外定义的新方法，都是Collection中定义的方法
 *
 *  2.要求，像Set中添加的数据，其所在的类一定要重写HashCode()和 equals()方法
 *
 */
public class SetTest {
    /*
    一、Set:存储无序的、不可重复的数据
    以HashSet为例
    1.无序性：不能与随机性。存储的数据在底层数组中并非按照索引的顺序添加。而是根据数据的哈希值来决定的

    2.不可重复性：保证添加的元素按照equals()判断是，不能返回true，即：相同的元素只能添加加一个。

    二、添加元素的过程：一HashSet为例
     我们向HashSet中添加元素a，首先调用元素a的HashCode()方法，计算元素a的哈希值，
     此哈希值接着通过某种算法计算出在HashSet底层数组中的存放位置（即为：索引位置），判断
     数组此位置上是否已经有元素：
        如果此位置上没有其他元素，则a添加成功。  --->情况1
        如果此位置上有其他元素b（或以链表形式存在的多个元素），则比较元素a和元素b的hash值：
            如果hash值不同，则元素a添加成功。    --->情况2
            如果hash值相同，进而需要调用元素a所在类的equals()方法：
                equals()返回true，元素a添加失败
                equals()返回false，元素a添加成功  --->情况3
        对于添加成功的情况2和情况3而言：元素a与已经存在指定索引位置上的数据以链表的方式存储
        jdk8：原来的元素在数组中，指向元素a

        HashSet：数组+链表
     */

    @Test
    public void test1(){
        Set set = new HashSet();
        set.add(456);
        set.add(123);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(new User("Tom",12));
        set.add(new User("Tom",12));
        set.add(129);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    //LinkedHashSet的使用
    //LinkedHashSet作为HashSet的子类，再添加数据的同时，每个数据还维护了两个变量，此变量记录此数据的前一个
    //数据和后一个数据
    //优点：对于频繁的遍历操作，LinkedHashSet效率高于HashSet
    @Test
    public void test2(){
        Set set = new LinkedHashSet();
        set.add(456);
        set.add(123);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(new User("Tom",12));
        set.add(new User("Tom",12));
        set.add(129);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
