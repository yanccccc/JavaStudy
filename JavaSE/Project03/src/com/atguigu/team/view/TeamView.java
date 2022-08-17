package com.atguigu.team.view;

import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Programmer;
import com.atguigu.team.service.NameListService;
import com.atguigu.team.service.TeamException;
import com.atguigu.team.service.TeamService;

public class TeamView {

    private NameListService listSvc = new NameListService();
    private TeamService teamSvc = new TeamService();

    /**
     * ��������ʾ�����Ʒ�����
     */
    public void enterMainMenu() throws TeamException {
        boolean isFlag = true;
        char menu = 0;
        while (isFlag){

            if(menu != '1'){
                listAllEmployee();
            }

            System.out.print("1-�Ŷ��б� 2-��ӳ�Ա 3-ɾ���Ŷӳ�Ա 4-�˳� ��ѡ��(1-4):");


            menu = TSUtility.readMenuSelection();
            switch (menu){
                case '1':
                    getTeam();
                    break;
                case '2':
                    addMember();
                    break;
                case '3':
                    deleteMember();
                    break;
                case '4':
                    System.out.print("ȷ���Ƿ��˳�(Y/N):");
                    char isQuit = TSUtility.readConfirmSelection();
                    if(isQuit == 'Y') {
                        isFlag = false;
                    }
                    break;
            }
        }
    }

    //�Ա����ʽ�г���˾���г�Ա
    private void listAllEmployee(){
        System.out.println("-------------------------------------�����Ŷӵ������--------------------------------------\n");
        System.out.println("ID\t����\t����\t����\tְλ\t״̬\t����\t��Ʊ\t�����豸");
        Employee[] employees = listSvc.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    //��ʾ�Ŷӳ�Ա�б����
    private void getTeam(){
        System.out.println("--------------------�Ŷӳ�Ա�б�---------------------\n");
        Programmer[] programmers = teamSvc.getTeam();
        if(programmers == null || programmers.length == 0){
            System.out.println("�Ŷ�û�п�����Ա");
        }else {
            System.out.println("TID/ID\t����\t����\t����\tְλ\t����\t��Ʊ");
            for (int i = 0; i < programmers.length; i++) {
                System.out.println(programmers[i].getDetailsForTeam());
            }
        }
        System.out.println("-----------------------------------------------------");
    }

    //ʵ����ӳ�Ա����
    private void addMember() throws TeamException {
        System.out.println("---------------------��ӳ�Ա---------------------");
        System.out.print("������Ҫ��ӵ�Ա��id��");
        int id = TSUtility.readInt();
        try {
            Employee e = listSvc.getEmployee(id);
            teamSvc.addMember(e);
            System.out.println("��ӳɹ�");
        } catch (TeamException ex) {
            System.out.println("���ʧ�ܣ�ԭ��" + ex.getMessage());
        }
        TSUtility.readReturn();
    }

    //ʵ��ɾ����Ա����
    private void deleteMember() throws TeamException {
        System.out.println("---------------------ɾ����Ա---------------------");
        System.out.print("������Ҫɾ��Ա����TID��");
        int tid = TSUtility.readInt();
        System.out.print("ȷ���Ƿ�ɾ��(Y/N):");
        char isDelete = TSUtility.readConfirmSelection();
        if(isDelete == 'Y'){
            try {
                teamSvc.removeMember(tid);
                System.out.println("ɾ���ɹ�");
            } catch (TeamException e) {
                System.out.println("ɾ��ʧ�ܣ�ԭ��" + e.getMessage());
            }
        }else {
            return;
        }
        TSUtility.readReturn();
    }

    public static void main(String[] args) throws TeamException {
        TeamView teamView = new TeamView();
        teamView.enterMainMenu();
    }
}
