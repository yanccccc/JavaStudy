package com.atguigu.java4;
/**
 * 为了在程序中避免空指针异常创建的
 */

import org.junit.Test;

import java.util.Optional;

public class OptionTest {
    @Test
    public void test1(){

        // Optional.of(T t) : 创建一个 Optional 实例，t必须非空；
        Girl girl = new Girl();
        Optional<Girl> girl1 = Optional.of(girl);
        System.out.println(girl1);
        // Optional.empty() : 创建一个空的 Optional 实例

    }

    @Test
    public void test2(){

        // Optional.ofNullable(T t)：t可以为null
        Girl girl = new Girl();
        girl = null;
        Optional<Girl> girl1 = Optional.ofNullable(girl);
        System.out.println(girl1);

    }

    public String getGirlName(Boy boy){
        Optional<Boy> boy1 = Optional.ofNullable(boy);
        //boy2一定非空
        Boy boy2 = boy1.orElse(new Boy(new Girl("迪丽热巴")));

        Optional<Girl> girl = Optional.ofNullable(boy2.getGirl());
        //girl1一定非空
        Girl girl1 = girl.orElse(new Girl("古力娜扎"));

        return girl1.getName();
    }

    @Test
    public void test3(){
        Boy boy = new Boy();
//        boy = null;
        String girlName = getGirlName(boy);
        System.out.println(girlName);
    }
}
