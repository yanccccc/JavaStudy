package com.atguigu.p2.service;

import com.atguigu.p2.bean.Customer;

/**
 * CustomerList为Customer对象的管理模块，内部用数组管理一组Customer对象，
 * 并提供相应的添加、修改、删除和遍历方法，供CustomerView调用
 */

public class CustomerList {
    private Customer[] customers;
    int total = 0; //记录已保存客户对象的数量

    /**
     * 用途：构造器，用来初始化customers数组
     * 参数：totalCustomer：指定customers数组的最大空间
     * @param totalCustomer
     */
    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];
    }

    /**
     * 用途：将参数customer添加到数组中最后一个客户对象记录之后
     * 参数：customer指定要添加的客户对象
     * 返回：添加成功返回true；false表示数组已满，无法添加
     */
    public boolean addCustomer(Customer customer){
        if(total >= 0 && total < customers.length){
            customers[total] = customer;
            total++;
            return true;
        }
        return false;
    }
    /**
     * 用途：用参数customer替换数组中由index指定的对象
     * 参数:customer指定替换的新客户对象
     * 		index指定所替换对象在数组中的位置，从0开始
     * 返回：替换成功返回true；false表示索引无效，无法替换
     */
    public boolean replaceCustomer(int index, Customer cust){
        if(index >= 0 && index < total){
            customers[index] = cust;
            return true;
        }
        return false;
    }

    /**
     * 用途：从数组中删除参数index指定索引位置的客户对象记录
     * 参数： index指定所删除对象在数组中的索引位置，从0开始
     * 返回：删除成功返回true；false表示索引无效，无法删除
     */
    public boolean deleteCustomer(int index){
        if(index >= 0 && index < total){
            for (int i = index; i < total - 1; i++) {
                customers[i] = customers[i + 1];
            }
            customers[total - 1] = null;
            total--;//删除后个数减1
            return true;
        }
        return false;
    }

    /**
     * 用途：返回数组中记录的所有客户对象
     * 返回： Customer[] 数组中包含了当前所有客户对象，该数组长度与对象个数相同
     */
    public Customer[] getAllCustomers(){
        //不能直接返回customers
        Customer[] cuts = new Customer[total];
        for (int i = 0; i < total; i++) {
            cuts[i] = customers[i];
        }
        return cuts;
    }

    /**
     * 用途：返回参数index指定索引位置的客户对象记录
     * 参数： index指定所要获取的客户在数组中的索引位置，从0开始
     * 返回：封装了客户信息的Customer对象
     */
    public Customer getCustomer(int index){
        if(index >= 0 && index < total){
            return customers[index];
        }
        return null;
    }

    /**
     * 获取一共有多少个客户
     * @return
     */
    public int getTotal(){
        return total;
    }
}
