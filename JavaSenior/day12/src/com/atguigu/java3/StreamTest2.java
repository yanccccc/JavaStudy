package com.atguigu.java3;

import com.atguigu.java2.Employee;
import com.atguigu.java2.EmployeeData;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest2 {

    @Test
    public void test1(){
//    allMatch(Predicate p) 检查是否匹配所有元素
        //是否所有员工的年龄都大于18
        List<Employee> employees = EmployeeData.getEmployees();
        System.out.println(employees.stream().allMatch(e -> e.getAge() > 18));

//    anyMatch(Predicate p) 检查是否至少匹配一个元素
        //是否存在员工的工资大于1000
        System.out.println(employees.stream().anyMatch(e -> e.getSalary() > 10000));

//    noneMatch(Predicate p) 检查是否没有匹配所有元素
        //检查是否有员工姓“雷”
        System.out.println(employees.stream().noneMatch(e -> e.getName().startsWith("雷")));

//    findFirst() 返回第一个元素
        System.out.println(employees.stream().findFirst());

//    findAny() 返回当前流中的任意元素
        Optional<Employee> any = employees.stream().findAny();
        System.out.println(any);

    }

    @Test
    public void test2(){
//        count() 返回流中元素总数
        List<Employee> employees = EmployeeData.getEmployees();
        long count = employees.stream().count();
        System.out.println(count);

//        max(Comparator c) 返回流中最大值
        //返回最高的工资
        Stream<Double> doubleStream = employees.stream().map(e -> e.getSalary());
        Optional<Double> max = doubleStream.max(Double::compare);
        System.out.println(max);

//        min(Comparator c) 返回流中最小值
        //返回工资最低的员工
        Optional<Employee> min = employees.stream().min((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println(min);

//        forEach(Consumer c)内部迭代(使用 Collection 接口需要用户去做迭代，
//         称为外部迭代。相反，Stream API 使用内部迭代——它帮你把迭代做了)
        employees.stream().forEach(System.out::println);
    }

    //2-归约
    @Test
    public void test3(){
//        reduce(T iden, BinaryOperator b) 可以将流中元素反复结合起来，得到一 个值。返回 T
        //计算前10个数的和
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer reduce = list.stream().reduce(0, Integer::sum);
        System.out.println(reduce);

//        reduce(BinaryOperator b) 可以将流中元素反复结合起来，得到一 个值。返回 Optional<T>
        //计算员工工资总和
        List<Employee> employees = EmployeeData.getEmployees();
        Stream<Double> doubleStream = employees.stream().map(e -> e.getSalary());
        Optional<Double> reduce1 = doubleStream.reduce(Double::sum);
        System.out.println(reduce1);

    }

    //3-收集
    @Test
    public void test4(){
//        collect(Collector c)
//        将流转换为其他形式。接收一个 Collector 接口的实现，用于给Stream中元素做汇总 的方法
        List<Employee> employees = EmployeeData.getEmployees();
        Stream<Employee> employeeStream = employees.stream().filter(e -> e.getSalary() > 6000);
        List<Employee> collect = employeeStream.collect(Collectors.toList());
        System.out.println(collect);
    }

}
