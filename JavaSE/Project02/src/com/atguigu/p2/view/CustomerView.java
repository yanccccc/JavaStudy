package com.atguigu.p2.view;

import com.atguigu.p2.bean.Customer;
import com.atguigu.p2.service.CustomerList;
import com.atguigu.p2.util.CMUtility;

/**
 * CustomerViewΪ��ģ�飬����˵�����ʾ�ʹ����û�����
 */
public class CustomerView {
    public static void main(String[] args) {
        //����CustomerViewʵ���������� enterMainMenu()������ִ�г���
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }

    CustomerList customerList = new CustomerList(10);

    public CustomerView() {
        Customer customer = new Customer("����",'��',22,"1398456465","123456@qq.com");
        customerList.addCustomer(customer);
    }

    /**
     * ��;����ʾ���˵�����Ӧ�û����룬
     * �����û������ֱ����������Ӧ�ĳ�Ա��������addNewCustomer��������ɿͻ���Ϣ����
     */
    public void enterMainMenu() {
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("-----------------�ͻ���Ϣ�������-----------------\n");
            System.out.println("\t\t\t\t1 �� �� �� ��\t\t\t\t");
            System.out.println("\t\t\t\t2 �� �� �� ��\t\t\t\t");
            System.out.println("\t\t\t\t3 ɾ �� �� ��\t\t\t\t");
            System.out.println("\t\t\t\t4 �� �� �� ��\t\t\t\t");
            System.out.println("\t\t\t\t5 ��       ��\t\t\t\t\n");
            System.out.print("\t\t\t\t��ѡ��(1-5)��");
            //��ȡ�û�ѡ��
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
                    System.out.print("���Ƿ�Ҫ�˳�(Y/N)��");
                    if (CMUtility.readConfirmSelection() == 'Y') {
                        isFlag = false;
                    }
                    break;
            }
        }

    }

    /**
     * ��;�����ĸ������ֱ���ɡ���ӿͻ��������޸Ŀͻ�������ɾ���ͻ����͡��ͻ��б��ȸ��˵����ܡ�
     * ���ĸ���������enterMainMenu()�������á�
     */
    //��ӿͻ�
    private void addNewCustomer() {
        System.out.println("---------------------��ӿͻ�---------------------");
        System.out.print("������");
        String name = CMUtility.readString(4);
        System.out.print("�Ա�");
        char gender = CMUtility.readChar();
        System.out.print("���䣺");
        int age = CMUtility.readInt();
        System.out.print("�绰��");
        String phone = CMUtility.readString(11);
        System.out.print("���䣺");
        String email = CMUtility.readString(20);
        Customer customer = new Customer(name,gender,age,phone,email);
        if (customerList.addCustomer(customer)) {
            System.out.println("---------------------������---------------------");
        } else {
            System.out.println("---------------------���ʧ��---------------------");
        }
    }

    //�޸Ŀͻ�
    private void modifyCustomer() {
        System.out.println("---------------------�޸Ŀͻ�---------------------");
        Customer customer;//�ҵ���Ҫ�޸ĵĿͻ�
        int index;//�ͻ����
        while (true){
            System.out.print("��ѡ����޸Ŀͻ����(-1�˳�)��");
            index = CMUtility.readInt();
            if (index == -1) {
                return;
            }
            customer = customerList.getCustomer(index - 1);
            if(customer == null){
                System.out.println("�޷��ҵ�ָ���ͻ�");
            } else {
                break;
            }
        }
        //�޸Ŀͻ���Ϣ
        System.out.print("����(" + customer.getName() + "):");
        String name = CMUtility.readString(4, customer.getName());
        System.out.print("�Ա�(" + customer.getGender() + "):");
        char gender = CMUtility.readChar(customer.getGender());
        System.out.print("����(" + customer.getAge() + "):");
        int age = CMUtility.readInt(customer.getAge());
        System.out.print("�绰(" + customer.getPhone() + "):");
        String phone = CMUtility.readString(11, customer.getPhone());
        System.out.print("����(" + customer.getEmail() + "):");
        String email = CMUtility.readString(20, customer.getEmail());
        Customer newCust = new Customer(name,gender,age,phone,email);
        if (customerList.replaceCustomer(index - 1, newCust)) {
            System.out.println("---------------------�޸����---------------------");
        } else {
            System.out.println("---------------------�޸�ʧ��---------------------");
        }

    }

    //ɾ���ͻ�
    private void deleteCustomer() {
        System.out.println("---------------------ɾ���ͻ�---------------------");
        int index;//�ͻ����
        while (true){
            System.out.print("��ѡ����޸Ŀͻ����(-1�˳�)��");
            index = CMUtility.readInt();
            if (index == -1) {
                return;
            }
            Customer customer = customerList.getCustomer(index - 1);
            if(customer == null){
                System.out.println("�޷��ҵ�ָ���ͻ�");
            } else {
                break;
            }
        }
        //�ҵ���ָ���Ŀͻ�
        System.out.print("ȷ���Ƿ�ɾ��(Y/N)��");
        if (CMUtility.readChar() == 'Y') {
            if (customerList.deleteCustomer(index - 1)) {
                System.out.println("---------------------ɾ�����---------------------");
            }else {
                System.out.println("---------------------ɾ��ʧ��---------------------");
            }
        }
    }

    //��ʾ�ͻ�
    private void listAllCustomers() {
        System.out.println("\n-------------------------�ͻ��б�-------------------------");
        int total = customerList.getTotal();
        if(total == 0){
            System.out.println("û�пͻ���¼��");
        }else {
            System.out.println("���\t����\t�Ա�\t����\t�绰\t\t����");
            Customer[] customers = customerList.getAllCustomers();
            for (int i = 0; i < customers.length; i++) {
                System.out.println((i + 1) + "\t\t" + customers[i].getName() + "\t" + customers[i].getGender()
                        + "\t\t" + customers[i].getAge() + "\t\t" + customers[i].getPhone() +
                        "\t" + customers[i].getEmail());
            }
        }
        System.out.println("-------------------------�ͻ��б����-------------------------\n");
    }


}
