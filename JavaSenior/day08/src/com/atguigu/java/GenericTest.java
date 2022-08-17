package com.atguigu.java;

import org.junit.Test;

import java.util.*;

/**
 * 泛型的使用
 * 1.jdk 5.0新增的特性
 *
 * 2.在集合中使用泛型
 *  总结：
 *  ①集合接口或集合类在jdk5.0都修改为带泛型的结构
 *  ②在实例化集合类时，可以指明具体的泛型类型
 *  ③指明完以后，在集合类或接口中凡是定义类或接口时，内部结构使用到泛型的位置，都指定为泛型的类型
 *  ④注意点：泛型的类型必须是类，不能是基本数据类型，需求用到基本数据类型的位置，拿包装类替换
 *  ⑤如果实例化没有指定泛型的类型，默认为Object类型
 *
 *  3.如何自定义泛型结构：泛型类、泛型接口、泛型方法
 *
 */
public class GenericTest {

    @Test
    public void test1(){

        //在集合中使用泛型之前的情况
        ArrayList list = new ArrayList();
        //需求：存放学生的成绩
        list.add(78);
        list.add(76);
        list.add(89);
        list.add(85);
        //问题一：类型不安全
//        list.add("Tom");

        for(Object score :list){
            //问题二：强转时，可能出现类型转换异常
            int stuScore = (int)score;

            System.out.println(stuScore);
        }
    }

    //在集合中使用泛型的情况
    @Test
    public void test2(){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(78);
        list.add(76);
        list.add(89);
        list.add(85);

        //编译时就会进行类型检查，保证数据的安全
//        list.add("Tom");

//        for(Integer score:list){
//            //避免了强转操作
//            System.out.println(score);
//        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    //在集合中使用泛型的情况:以HashMap为例
    @Test
    public void test3(){
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Tom",87);
        hashMap.put("Jerry",87);
        hashMap.put("Jack",67);

        //泛型的嵌套
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key + "---" + value);
        }

    }


}
