package com.atguigu.p2.view;

import com.atguigu.p2.bean.Customer;
import com.atguigu.p2.service.CustomerList;
import com.atguigu.p2.util.CMUtility;

/**
 * CustomerView为主模块，负责菜单的显示和处理用户操作
 */
public class CustomerView {
    public static void main(String[] args) {
        //创建CustomerView实例，并调用 enterMainMenu()方法以执行程序
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }

    CustomerList customerList = new CustomerList(10);

    public CustomerView() {
        Customer customer = new Customer("王涛",'男',22,"1398456465","123456@qq.com");
        customerList.addCustomer(customer);
    }

    /**
     * 用途：显示主菜单，响应用户输入，
     * 根据用户操作分别调用其他相应的成员方法（如addNewCustomer），以完成客户信息处理。
     */
    public void enterMainMenu() {
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("-----------------客户信息管理软件-----------------\n");
            System.out.println("\t\t\t\t1 添 加 客 户\t\t\t\t");
            System.out.println("\t\t\t\t2 修 改 客 户\t\t\t\t");
            System.out.println("\t\t\t\t3 删 除 客 户\t\t\t\t");
            System.out.println("\t\t\t\t4 客 户 列 表\t\t\t\t");
            System.out.println("\t\t\t\t5 退       出\t\t\t\t\n");
            System.out.print("\t\t\t\t请选择(1-5)：");
            //获取用户选择
            char selection = CMUtility.readMenuSelection();
            switch (selection) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.print("您是否要退出(Y/N)：");
                    if (CMUtility.readConfirmSelection() == 'Y') {
                        isFlag = false;
                    }
                    break;
            }
        }

    }

    /**
     * 用途：这四个方法分别完成“添加客户”、“修改客户”、“删除客户”和“客户列表”等各菜单功能。
     * 这四个方法仅供enterMainMenu()方法调用。
     */
    //添加客户
    private void addNewCustomer() {
        System.out.println("---------------------添加客户---------------------");
        System.out.print("姓名：");
        String name = CMUtility.readString(4);
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("电话：");
        String phone = CMUtility.readString(11);
        System.out.print("邮箱：");
        String email = CMUtility.readString(20);
        Customer customer = new Customer(name,gender,age,phone,email);
        if (customerList.addCustomer(customer)) {
            System.out.println("---------------------添加完成---------------------");
        } else {
            System.out.println("---------------------添加失败---------------------");
        }
    }

    //修改客户
    private void modifyCustomer() {
        System.out.println("---------------------修改客户---------------------");
        Customer customer;//找到需要修改的客户
        int index;//客户编号
        while (true){
            System.out.print("请选择待修改客户编号(-1退出)：");
            index = CMUtility.readInt();
            if (index == -1) {
                return;
            }
            customer = customerList.getCustomer(index - 1);
            if(customer == null){
                System.out.println("无法找到指定客户");
            } else {
                break;
            }
        }
        //修改客户信息
        System.out.print("姓名(" + customer.getName() + "):");
        String name = CMUtility.readString(4, customer.getName());
        System.out.print("性别(" + customer.getGender() + "):");
        char gender = CMUtility.readChar(customer.getGender());
        System.out.print("年龄(" + customer.getAge() + "):");
        int age = CMUtility.readInt(customer.getAge());
        System.out.print("电话(" + customer.getPhone() + "):");
        String phone = CMUtility.readString(11, customer.getPhone());
        System.out.print("邮箱(" + customer.getEmail() + "):");
        String email = CMUtility.readString(20, customer.getEmail());
        Customer newCust = new Customer(name,gender,age,phone,email);
        if (customerList.replaceCustomer(index - 1, newCust)) {
            System.out.println("---------------------修改完成---------------------");
        } else {
            System.out.println("---------------------修改失败---------------------");
        }

    }

    //删除客户
    private void deleteCustomer() {
        System.out.println("---------------------删除客户---------------------");
        int index;//客户编号
        while (true){
            System.out.print("请选择待修改客户编号(-1退出)：");
            index = CMUtility.readInt();
            if (index == -1) {
                return;
            }
            Customer customer = customerList.getCustomer(index - 1);
            if(customer == null){
                System.out.println("无法找到指定客户");
            } else {
                break;
            }
        }
        //找到了指定的客户
        System.out.print("确认是否删除(Y/N)：");
        if (CMUtility.readChar() == 'Y') {
            if (customerList.deleteCustomer(index - 1)) {
                System.out.println("---------------------删除完成---------------------");
            }else {
                System.out.println("---------------------删除失败---------------------");
            }
        }
    }

    //显示客户
    private void listAllCustomers() {
        System.out.println("\n-------------------------客户列表-------------------------");
        int total = customerList.getTotal();
        if(total == 0){
            System.out.println("没有客户记录！");
        }else {
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
            Customer[] customers = customerList.getAllCustomers();
            for (int i = 0; i < customers.length; i++) {
                System.out.println((i + 1) + "\t\t" + customers[i].getName() + "\t" + customers[i].getGender()
                        + "\t\t" + customers[i].getAge() + "\t\t" + customers[i].getPhone() +
                        "\t" + customers[i].getEmail());
            }
        }
        System.out.println("-------------------------客户列表完成-------------------------\n");
    }


}
