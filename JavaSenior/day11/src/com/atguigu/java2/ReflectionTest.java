package com.atguigu.java2;

import com.atguigu.java1.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {

    //获取运行时类的属性
    @Test
    public void test1() throws Exception {
        Class<Person> clazz = Person.class;

        //创建运行时类的对象
        Person person = clazz.newInstance();

        //获取指定值的属性
        //通常不采用此方法
        Field id = clazz.getField("id");

        /*
        设置当前属性的值
        set():参数1：指明设置哪个对象的属性   参数2：将此属性设置为多少
         */
        id.set(person,1001);

        /*
        设置当前属性的值
        get():参数1：获取哪个对象的属性值
         */
        System.out.println(id.get(person));
    }

    /*
    如何去操作运行时类的属性：需要掌握
     */
    @Test
    public void test2() throws Exception{
        Class<Person> clazz = Person.class;

        //创建运行时类的对象
        Person person = clazz.newInstance();

        //1.getDeclaredField(String fileName):获取运行时指定变量名的属性
        Field name = clazz.getDeclaredField("name");

        //2.保证当前属性是可访问的
        name.setAccessible(true);
        //3.获取设置指定对象的属性值
        name.set(person,"Jerry");

        String pName = (String) name.get(person);

        System.out.println(pName);
    }

    /*
    如何去操作运行时类的方法：需要掌握
     */
    @Test
    public void test3() throws Exception {
        Class<Person> clazz = Person.class;

        //创建运行时类的对象
        Person person = clazz.newInstance();

        /*
        1.获取指定的某个方法
        getDeclaredMethod():参数一：指定获取的方法名  参数二：获取指明方法的形参列表
         */
        Method show = clazz.getDeclaredMethod("show", String.class);
        //2.保证当前方法是可访问的
        show.setAccessible(true);
        /*
        3.调用方法的invoke() 参数一：方法的调用者  参数二：给方法赋值的实参
        invoke()的返回值即为对应类中调用方法的返回者
         */
        String nation = (String) show.invoke(person, "中国");

        System.out.println(nation);

        System.out.println("***********静态方法***********");

        Method showDesc = clazz.getDeclaredMethod("showDesc");

        showDesc.setAccessible(true);
        //如果调用的运行类中的方法没有返回值，则此方法返回null
        showDesc.invoke(Person.class);

    }

    /*
    如何调用运行时类的指定的构造器
     */
    @Test
    public void test4() throws Exception{
        Class<Person> clazz = Person.class;
        //1.获取指定的构造器
        //getDeclaredConstructor()：参数：指定构造器的参数列表
        Constructor<Person> constructor = clazz.getDeclaredConstructor(String.class);

        //2.保证此构造器是可访问的
        constructor.setAccessible(true);

        //3.调用此构造器创建运行时类的对象
        System.out.println(constructor.newInstance("Tom"));
    }

}
