package com.atguigu.exer1;

import org.junit.Test;

/*
定义一个测试类：
创建 DAO 类的对象， 分别调用其 save、get、update、list、delete 方
法来操作 User 对象，
使用 Junit 单元测试类进行测试。
 */
public class DAOTest {

    @Test
    public void test1(){
        User u1 = new User(1001,18,"Tom");
        User u2 = new User(1002,15,"Jerry");
        User u3 = new User(1003,10,"Rose");
        User u4 = new User(1004,28,"Jack");

        DAO<User> dao = new DAO<>();

        dao.save("1",u1);
        dao.save("2",u2);
        dao.save("3",u3);
        dao.save("4",u4);

        System.out.println(dao.list());

        User user = dao.get("2");
        System.out.println(user);

        dao.update("3",new User(1005,35,"maYun"));
        System.out.println(dao.list());

        dao.delete("1");
        System.out.println(dao.list());
    }
}
