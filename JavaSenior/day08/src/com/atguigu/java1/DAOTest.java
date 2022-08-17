package com.atguigu.java1;

import org.junit.Test;

public class DAOTest {

    @Test
    public void test1(){
        CustomerDAO dao = new CustomerDAO();

        dao.add(new Customer());
    }
}
