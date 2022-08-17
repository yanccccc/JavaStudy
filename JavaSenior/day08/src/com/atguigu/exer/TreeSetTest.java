package com.atguigu.exer;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 创建该类的 5 个对象，并把这些对象放入 TreeSet 集合中（下一章：TreeSet 需使用泛型来定义）
 * 分别按以下两种方式对集合中的元素进行排序，并遍历输出：
 * 1). 使 Employee 实现 Comparable 接口，并按 name 排序
 * 2). 创建 TreeSet 时传入 Comparator 对象，按生日日期的先后排序
 */
public class TreeSetTest {
    @Test
    //1.使 Employee 实现 Comparable 接口，并按 name 排序
    public void test1() {
        TreeSet<Employee> set = new TreeSet<>();

        set.add(new Employee("Tom", 15, new MyDate(2005, 8, 20)));
        set.add(new Employee("Jerry", 12, new MyDate(2007, 7, 20)));
        set.add(new Employee("Yc", 22, new MyDate(2000, 3, 30)));
        set.add(new Employee("Ljx", 21, new MyDate(2000, 3, 5)));
        set.add(new Employee("Zyh", 23, new MyDate(1998, 1, 10)));

        Iterator<Employee> iterator = set.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println(employee);
        }
    }

    //2). 创建 TreeSet 时传入 Comparator 对象，按生日日期的先后排序
    @Test
    public void test2() {
        Comparator<Employee> com = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                Employee e1 = (Employee) o1;
                Employee e2 = (Employee) o2;
                int year = e1.getBirthday().getYear() - e2.getBirthday().getYear();
                int month = e1.getBirthday().getMonth() - e2.getBirthday().getMonth();
                int day = e1.getBirthday().getDay() - e2.getBirthday().getDay();
                if (year != 0) {
                    return year;
                } else if (month != 0) {
                    return month;
                } else {
                    return day;
                }
            }
//            @Override
//            public int compare(Object o1, Object o2) {
//                if (o1 instanceof Employee && o2 instanceof Employee) {
//                    Employee e1 = (Employee) o1;
//                    Employee e2 = (Employee) o2;
//                    int year = e1.getBirthday().getYear() - e2.getBirthday().getYear();
//                    int month = e1.getBirthday().getMonth() - e2.getBirthday().getMonth();
//                    int day = e1.getBirthday().getDay() - e2.getBirthday().getDay();
//                    if (year != 0) {
//                        return year;
//                    } else if (month != 0) {
//                        return month;
//                    } else {
//                        return day;
//                    }
//                }
//                throw new RuntimeException("输入类型不一致");
//            }
        };

        TreeSet<Employee> set = new TreeSet<>(com);

        set.add(new Employee("Tom", 15, new MyDate(2005, 8, 20)));
        set.add(new Employee("Jerry", 12, new MyDate(2007, 7, 20)));
        set.add(new Employee("Yc", 22, new MyDate(2000, 3, 30)));
        set.add(new Employee("Ljx", 21, new MyDate(2000, 3, 5)));
        set.add(new Employee("Zyh", 23, new MyDate(1998, 1, 10)));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
