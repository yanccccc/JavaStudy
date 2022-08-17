package com.atguigu.java2;

import com.atguigu.java1.Person;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 获取当前类运行时的属性结构
 */
public class FieldTest {

    //获取当前运行类的属性
    @Test
    public void test1(){
        Class<Person> clazz = Person.class;
        //获取属性结构
        //getFields():获取当前运行时类及其父类中声明为public的属性
        Field[] fields = clazz.getFields();
        for(Field f:fields){
            System.out.println(f);
        }

        //getDeclaredFields():获取当前运行时类声明的所有属性（不包括父类声明的属性）
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field f:declaredFields){
            System.out.println(f);
        }
    }

    @Test
    public void test2(){
        Class<Person> clazz = Person.class;
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field f:declaredFields){
            //获取属性的权限修饰符
            int modifier = f.getModifiers();
            System.out.println(Modifier.toString(modifier));
            //获取属性的数据类型
            Class<?> type = f.getType();
            System.out.println(type.getName());
            //获取属性的变量名
            String name = f.getName();
            System.out.println(name);
        }
    }

}
