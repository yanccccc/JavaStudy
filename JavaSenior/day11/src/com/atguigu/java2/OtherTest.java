package com.atguigu.java2;

import com.atguigu.java1.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class OtherTest {

    //获取运行类的构造器结构
    @Test
    public void test1(){
        Class<Person> clazz = Person.class;
        //getConstructors():获取当前运行时类的声明为public的构造器
        Constructor<?>[] constructors = clazz.getConstructors();
        for(Constructor c : constructors){
            System.out.println(c);
        }
        //getDeclaredConstructors()：获取当前运行时类的所有的构造器
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        for(Constructor c : declaredConstructors){
            System.out.println(c);
        }
    }

    //获取运行时类的父类
    @Test
    public void test2(){
        Class<Person> clazz = Person.class;

        Class<? super Person> superclass = clazz.getSuperclass();//>=

        System.out.println(superclass);

    }

    //获取运行时带泛型类的父类
    @Test
    public void test3(){
        Class<Person> clazz = Person.class;

        Type genericSuperclass = clazz.getGenericSuperclass();//>=

        System.out.println(genericSuperclass);

    }

    //获取运行时带泛型类的父类的泛型
    @Test
    public void test4(){
        Class<Person> clazz = Person.class;

        Type genericSuperclass = clazz.getGenericSuperclass();//>=
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;

        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();

        System.out.println(actualTypeArguments[0].getTypeName());

    }

    //获取运行类实现的接口
    @Test
    public void test5(){
        Class<Person> clazz = Person.class;

        Class<?>[] interfaces = clazz.getInterfaces();
        for(Class c : interfaces){
            System.out.println(c);
        }
    }

}
