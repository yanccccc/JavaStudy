package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1.list接口框架
 * |----Collection接口：单列集合：用来存储一个一个的对象
 *  *          |----List接口：存储有序的、可重复的数据   ---> 动态数组
 *  *              |----ArrayList:作为List的主要实现类，线程不安全的，效率高；底层使用Object[] elementData存储
 *                 |----LinkedList：对于频繁的插入、删除操作，使用此类效率比ArrayList高，底层使用双向链表存储
 *                 |----Vector：作为List的古老实现类，线程安全的，效率低：底层使用Object[]存储
 *
 * 2. ArrayList源码分析：
 *     2.1.jdk 7的情况下：
 *          ArrayList list = new ArrayList();//底层创建了长度是10的Object[]数组
 *          list.add(123);//elementData[0] = 123;
 *          ...
 *          list.add(11);//如果此次的添加导致elementData数组容量不够，则扩容
 *          默认情况下，扩容为原来容量的1.5倍，同时将原有数组的数据复制到新数组中
 *
 *          结论：建议开发中使用带参的构造器：ArrayList list = new ArrayList(int initialCapacity)
 *    2.2 jdk 8的情况下：
 *          ArrayList list = new ArrayList();//底层Object[]的初始化为{},并没有创建长度为10的数组
 *          list.add(123);//第一此调用add()时，底层才调用了长度为10的数组，并将123添加到element中
 *
 *  3.LinkedList源码分析：
 *      linkedList list = new ListedList();内部声明了Node类型的first和last属性，默认值为null
 *      list.add(123);//将123封装到Node中，创建了Node对象
 *      private static class Node<E> {
 *         E item;
 *         Node<E> next;
 *         Node<E> prev;
 *
 *         Node(Node<E> prev, E element, Node<E> next) {
 *             this.item = element;
 *             this.next = next;
 *             this.prev = prev;
 *         }
 *     }
 *
 *  4.Vector源码分析：
 *     扩容为原来的两倍
 * ArrayList、 LinkList、Vector三者的异同：
 * 三个类都实现了List接口，存储数据的特点相同：存储有序的、可重复的舒徐
 *
 *  5.List的常用方法
 */
public class ListTest {

    /*
    void add(int index, Object ele):在index位置插入ele元素
    boolean addAll(int index, Collection ele):从index位置开始将eles中
      的所有元素添加进来
    Object get(int index):获取指定index位置的元素
    int indexOf(Object obj):返回obj在集合中首次出现的位置
    int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
    Object remove(int index):移除指定index位置的元素，并返回此元素
    Object set(int index, Object ele):设置指定index位置的元素为ele
    List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex
      位置的子集合

      总结：常用方法
      增：add(Object obj)
      删：remove(int index)/remove(Object obj)
      改：Object set(int index, Object ele)
      查：Object get(int index)
      插：add(int index, Object ele)
      长度：size()
      遍历：Iterator,增强for循环
     */
    @Test
    public void test1(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(new Person("Tom",12));
        list.add(456);

        System.out.println(list);

        //void add(int index, Object ele):在index位置插入ele元素
        list.add(1,"BB");
        System.out.println(list);

        //boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
        List list1 = Arrays.asList(1,2,3);
        list.addAll(list1);
        System.out.println(list.size());//6 + 3

        //Object get(int index):获取指定index位置的元素
        System.out.println(list.get(0));//123

        //int indexOf(Object obj):返回obj在集合中首次出现的位置，如果不存在返回-1
        int index = list.indexOf(1234);
        System.out.println(index);

        //int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
        System.out.println(list.lastIndexOf(456));

        //Object remove(int index):移除指定index位置的元素，并返回此元素
        Object obj = list.remove(0);
        System.out.println(obj);
        System.out.println(list);

        //Object set(int index, Object ele):设置指定index位置的元素为ele
        list.set(1,"CC");
        System.out.println(list);

        //List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的子集合
        List sublist = list.subList(2, 5);
        System.out.println(sublist);//不会改变原有的list


    }


}
