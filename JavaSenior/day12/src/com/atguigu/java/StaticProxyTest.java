package com.atguigu.java;

/**
 * 静态代理举例
 *
 * 特点：代理类和被代理类在编译期间就确定下来了
 *
 */

interface ClothFactory{
    void produceCloth();
}

//代理类
class ProxyClothFactory implements ClothFactory{
    private ClothFactory factory;

    public ProxyClothFactory(ClothFactory factory){
        this.factory = factory;
    }

    @Override
    public void produceCloth() {
        System.out.println("生产前的准备工作");
        factory.produceCloth();
        System.out.println("生产后的后续工作");
    }
}

class NikeFactory implements ClothFactory{

    @Override
    public void produceCloth() {
        System.out.println("生产一批Nike衣服");
    }
}


public class StaticProxyTest {
    public static void main(String[] args) {

        NikeFactory factory = new NikeFactory();

        ProxyClothFactory proxyClothFactory = new ProxyClothFactory(factory);

        proxyClothFactory.produceCloth();


    }
}
