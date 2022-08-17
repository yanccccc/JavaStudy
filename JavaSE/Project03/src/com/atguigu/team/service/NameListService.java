package com.atguigu.team.service;

import com.atguigu.team.domain.*;

import static com.atguigu.team.service.Data.*;


/**
 * ����Data�е����ݷ�װ��Employee[]�����У�ͬʱ�ṩ��ز���Employee[]�ķ�����
 */
public class NameListService {
    private Employee[] employees;

    /**
     *��Employee��ʼ������ֵ
     */
    public NameListService() {
        //������Ŀ�ṩ��Data�๹����Ӧ��С��employees����
        //�ٸ���Data���е����ݹ�����ͬ�Ķ��󣬰���Employee��Programmer��Designer��Architect�����Լ��������Equipment����Ķ���
        //���������������
        employees = new Employee[EMPLOYEES.length];
        for (int i = 0; i < employees.length; i++) {
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);

            int type = Integer.parseInt(EMPLOYEES[i][0]);//Ա���ļ���
            double bonus;
            int stock;

            switch (type){
                case EMPLOYEE:
                    employees[i] = new Employee(id,name,age,salary);
                    break;
                case PROGRAMMER:
                    employees[i] = new Programmer(id,name,age,salary,creatEquipment(i));
                    break;
                case DESIGNER:
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id,name,age,salary,creatEquipment(i),bonus);
                    break;
                case ARCHITECT:
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id,name,age,salary,creatEquipment(i),bonus,stock);
                    break;
            }
        }
    }

    /**
     *
     * @param index ����
     * @return ��������Ҫ���豸
     */
    public Equipment creatEquipment(int index){
        int key = Integer.parseInt(EQUIPMENTS[index][0]);
        String modelOrName = EQUIPMENTS[index][1];
        switch (key){
            case PC:
                String display = EQUIPMENTS[index][2];
                return new PC(modelOrName,display);
            case NOTEBOOK:
                double price = Double.parseDouble(EQUIPMENTS[index][2]);
                return new NoteBook(modelOrName,price);
            case PRINTER:
                String type = EQUIPMENTS[index][2];
                return new Printer(modelOrName,type);
        }
        return null;
    }

    /**
     * getAllEmployees ()��������ȡ��ǰ����Ա����
     * @return ��������Ա�����������
     */
    public Employee[] getAllEmployees() {
        return employees;
    }

    /**
     * ��ȡָ��ID��Ա������
     * @param id ָ��Ա����ID
     * @return ָ��Ա������
     * �쳣���Ҳ���ָ����Ա��
     */
    public Employee getEmployee(int id) throws TeamException {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getId() == id){
                return employees[i];
            }
        }
        throw new TeamException("�Ҳ�����Ա��");
    }

}
