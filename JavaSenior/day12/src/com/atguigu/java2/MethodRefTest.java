package com.atguigu.java2;

import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 方法引用的使用
 *
 * 1.使用情境：当要传递给lambda体的操作，已经有实现的方法了，可以使用方法引用！
 *
 * 2.方法引用，本质上就是Lambda表达式，而Lambda表达式作为函数接口的实例。所以方法应用，
 * 也是函数式接口的实例。
 *
 * 3.使用格式： 类（或对象）:: 方法名
 *
 * 4.具体分为如下的三种情况
 * 		对象 :: 非静态方法
 * 		类 :: 静态方法
 *
 * 		类 :: 非静态方法
 *
 * 5.方法引用的要求：要求接口中的抽象方法的形参列表和方法引用方法的形参列表和方法引用相同
 */
public class MethodRefTest {

	// 情况一：对象 :: 实例方法
	//Consumer中的void accept(T t)
	//PrintStream中的void println(T t)
	@Test
	public void test1() {
		Consumer<String> con1 = s -> System.out.println(s);
		con1.accept("北京");

		System.out.println("*****************");

		PrintStream ps = System.out;
		Consumer<String> con2 = ps::println;
		con2.accept("beijing");
	}
	
	//Supplier中的T get()
	//Employee中的String getName()
	@Test
	public void test2() {
		Employee emp = new Employee(1001,"Tom",12,5600);
		Supplier<String> sup = () -> emp.getName();
		System.out.println(sup.get());

		System.out.println("*****************");

		Supplier<String> sup1 = emp::getName;
		System.out.println(sup1.get());
	}

	// 情况二：类 :: 静态方法
	//Comparator中的int compare(T t1,T t2)
	//Integer中的int compare(T t1,T t2)
	@Test
	public void test3() {
		Comparator<Integer> com1 = (o1,o2) -> Integer.compare(o1,o2);
		System.out.println(com1.compare(12, 32));

		System.out.println("**************");

		Comparator<Integer> com2 = Integer::compare;
		System.out.println(com1.compare(12, 6));

	}
	
	//Function中的R apply(T t)
	//Math中的Long round(Double d)
	@Test
	public void test4() {
		Function<Double, Long> fun1 = new Function<Double, Long>() {
			@Override
			public Long apply(Double aDouble) {
				return Math.round(aDouble);
			}
		};
		System.out.println("******************");

		Function<Double,Long> fun2 = d -> Math.round(d);
		System.out.println(fun2.apply(12.3));

		System.out.println("******************");
		Function<Double,Long> fun3 = Math::round;
		System.out.println(fun3.apply(12.5));

	}

	// 情况三：类 :: 实例方法 
	// Comparator中的int comapre(T t1,T t2)
	// String中的int t1.compareTo(t2)
	@Test
	public void test5() {
		Comparator<String> com1 = (s1,s2) -> s1.compareTo(s2);
		System.out.println(com1.compare("ABC", "abc"));
		System.out.println("**************");
		Comparator<String> com2 = String::compareTo;
		System.out.println(com2.compare("ABC", "abc"));
	}

	//BiPredicate中的boolean test(T t1, T t2);
	//String中的boolean t1.equals(t2)
	@Test
	public void test6() {
		BiPredicate<String,String> pre1 = (s1,s2) -> s1.equals(s2);
		System.out.println(pre1.test("abc","abc"));
		System.out.println("****************");
		BiPredicate<String,String> pre2 = String::equals;
		System.out.println(pre2.test("abc","abc"));
		
	}
	
	// Function中的R apply(T t)
	// Employee中的String getName();
	@Test
	public void test7() {
		Employee employee = new Employee(1001, "Jerry", 24, 5600);
		Function<Employee,String> fun1 = e -> e.getName();
		System.out.println(fun1.apply(employee));

		System.out.println("****************");

		Function<Employee,String> fun2 = Employee::getName;
		System.out.println(fun2.apply(employee));

	}

}
