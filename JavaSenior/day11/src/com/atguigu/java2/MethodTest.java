package com.atguigu.java2;

import com.atguigu.java1.Person;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 获取运行时类的方法
 */
public class MethodTest {

    @Test
    public void test1(){

        Class<Person> clazz = Person.class;
        //getMethods():获取当前运行时类及其父类所有声明为public的方法
        Method[] methods = clazz.getMethods();
        for(Method m : methods){
            System.out.println(m);
        }

        System.out.println();
        //getDeclaredMethods():获取当前运行时类的所有方法
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for(Method m : declaredMethods){
            System.out.println(m);
        }
    }


    //@Xxx注解
    //权限修饰符 返回值类型 方法名(参数类型1 参数名1,....) throws xxxException{}
    @Test
    public void test2(){
        Class<Person> clazz = Person.class;
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for(Method m : declaredMethods){
            //1.注解
            Annotation[] annotations = m.getAnnotations();
            for(Annotation anno : annotations){
                System.out.println(anno);
            }
            //2.权限修饰符
            System.out.print(Modifier.toString(m.getModifiers()) + "\t");

            //3.返回值类型
            System.out.print(m.getReturnType().getName() + "\t");

            //4.方法名
            System.out.print(m.getName());

            //5.(参数类型1 参数名1,....)
            System.out.print("(");
            Class<?>[] parameterTypes = m.getParameterTypes();
            if(!(parameterTypes == null && parameterTypes.length == 0)){
                for(int i = 0;i < parameterTypes.length;i++){
                    System.out.print(parameterTypes[i].getName() + " args_" + i);
                }
            }

            System.out.print(")");

            System.out.println();
        }
    }
}
