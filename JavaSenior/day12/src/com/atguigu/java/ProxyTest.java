package com.atguigu.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理举例
 */

interface Human{
    String belief();

    void show();
}

//被代理类
class SuperMan implements Human{

    @Override
    public String belief() {
        return "I believe i can fly";
    }

    @Override
    public void show() {
        System.out.println("我是superMan");
    }
}

/*
要想实现动态代理，需要解决的问题
问题一：如何根据加载到内存中的被代理类，动态的创建一个代理类及其对象
问题二：当通过代理类的对象调用方法时，如何动态的去调用被代理类中的同名方法
 */

class HumanUtils{
    public void method1(){
        System.out.println("==========通用方法1==========");
    }

    public void method2(){
        System.out.println("==========通用方法2==========");
    }
}

class ProxyFactory{
    //调用此方法，返回一个代理类的对象。解决问题一
    public static Object getProxyInstance(Object obj){//obj是被代理的对象
        MyInvocationHandler handler = new MyInvocationHandler();
        handler.bind(obj);

        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),handler);
    }
}

class MyInvocationHandler implements InvocationHandler {

    private Object obj;//需要对被代理类的对象进行赋值

    public void bind(Object obj){
        this.obj = obj;
    }

    //当我们通过代理类的对象，调用方法a时，就会自动调用如下的方法：invoke()
    //将被代理类要执行的方法a的功能就声明在invoke()中
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        HumanUtils humanUtils = new HumanUtils();
        humanUtils.method1();

        //method：即为代理类对象调用的方法，此方法也就作为了被代理类对象要调用的方法
        //obj：被代理的对象
        //上述方法的返回值就作为当前类中的invoke()的返回值
        Object returnValue = method.invoke(obj, args);

        humanUtils.method2();
        return returnValue;
    }
}

public class ProxyTest {
    public static void main(String[] args) {
        Human human = new SuperMan();
        //proxyInstance：代理类的对象
        Human proxyInstance = (Human) ProxyFactory.getProxyInstance(human);
        //当通过代理类对象调用方法时，会自动的调用被代理类中的同名方法
        String belief = proxyInstance.belief();
        System.out.println(belief);
        proxyInstance.show();

        NikeFactory nikeFactory = new NikeFactory();
        ClothFactory proxyInstance1 = (ClothFactory) ProxyFactory.getProxyInstance(nikeFactory);
        proxyInstance1.produceCloth();
    }
}
