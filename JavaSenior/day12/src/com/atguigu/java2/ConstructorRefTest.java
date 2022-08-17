package com.atguigu.java2;

import org.junit.Test;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 一、构造器引用
 *      和方法引用类似，函数式接口的抽象方法的形参列表和构造器的形参列表一直
 *      抽象方法的返回值类型即为构造器所属的类的类型
 *
 * 二、数组引用
 *      大家可以把数组看作是一个类，写法与构造器引用相同
 *
 * Created by shkstart
 */
public class ConstructorRefTest {
	//构造器引用
    //Supplier中的T get()
    @Test
    public void test1(){
        Supplier<Employee> sup1 = () -> new Employee();
        sup1.get();

        System.out.println("***************");
        Supplier<Employee> sup2 = Employee::new;
        sup2.get();
	}

	//Function中的R apply(T t)
    @Test
    public void test2(){
        Function<Integer,Employee> fun1 = id -> new Employee(id);
        System.out.println(fun1.apply(1001));

        System.out.println("***************");
        Function<Integer,Employee> fun2 = Employee::new;
        System.out.println(fun2.apply(1002));
    }

	//BiFunction中的R apply(T t,U u)
    @Test
    public void test3(){
        BiFunction<Integer,String,Employee> bif1 = (id,name) -> new Employee(id,name);
        System.out.println(bif1.apply(1001, "Tom"));
        System.out.println("********************");

        BiFunction<Integer,String,Employee> bif2 = Employee::new;
        System.out.println(bif2.apply(1002, "Ferry"));

    }

	//数组引用
    //Function中的R apply(T t)
    @Test
    public void test4(){
        Function<Integer,String[]> fun1 = i -> new String[i];
        String[] arr1 = fun1.apply(5);
        System.out.println(Arrays.toString(arr1));
        System.out.println("***************");
        Function<Integer,String[]> fun2 = String[]::new;
        String[] arr2 = fun2.apply(10);
        System.out.println(Arrays.toString(arr2));
    }
}
