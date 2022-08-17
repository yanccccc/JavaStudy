package com.atguigu.java1;

import org.junit.Test;

import java.lang.annotation.Annotation;

/**
 * 注解的使用
 * 一、理解注解
 * 1.Annotation 其实就是代码里的特殊标记, 这些标记可以在编译, 类加
 * 载, 运行时被读取, 并执行相应的处理。通过使用 Annotation, 程序员
 * 可以在不改变原有逻辑的情况下, 在源文件中嵌入一些补充信息。
 * 2.在JavaSE中，注解的使用目的比较简单，例如标记过时的功能，
 * 忽略警告等。在JavaEE/Android中注解占据了更重要的角色，例如
 * 用来配置应用程序的任何切面，代替JavaEE旧版中所遗留的繁冗
 * 代码和XML配置等。
 *
 * 二、Annotation的使用示例：
 * 1.生成文档相关的注解
 * 2.JDK内置的3个注解
 *  @Override: 限定重写父类方法, 该注解只能用于方法
 *  @Deprecated: 用于表示所修饰的元素(类, 方法等)已过时。通常是因为
 *      所修饰的结构危险或存在更好的选择
 *  @SuppressWarnings: 抑制编译器警告
 *
 *
 *  三、自定义注解
 *
 *  四、jdk提供的4种元注解
 *      元注解：用于修饰其他注解的注解
 *      Retention：指定该 Annotation 的生命周期：SOURCE\CLASS(默认)\RUNTIME
 *                  只有RUNTIME，程序可以通过反射获取该注释。
 *      Target:用于指定被修饰的 Annotation 能用于修饰哪些程序元素。
 *      ******出现频率较低******
 *      Documented：用于指定被该元 Annotation 修饰的 Annotation 类将被javadoc 工具提取成文档。
 *      Inherited：被它修饰的 Annotation 将具有继承性。
 *
 *
 *  五、jak8中注解的新特性
 *
 *
 */
public class AnnotationTest {
    public static void main(String[] args) {
        Person p = new Student();
        p.walk();

        @SuppressWarnings("unused")
        int num = 10;
    }

    @Test
    public void test(){
        Class clazz = Student.class;
        Annotation[] annotations = clazz.getAnnotations();
        for (int i = 0; i < annotations.length; i++) {
            System.out.println(annotations[i]);
        }
    }
}

@myAnnotation
class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void walk(){
        System.out.println("人走路");
    }

    public void eat(){
        System.out.println("人吃饭");
    }

}

class Student extends Person{

    @Override
    public void walk() {
        System.out.println("学生走路");
    }
}
