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
     * 主界面显示及控制方法。
     */
    public void enterMainMenu() throws TeamException {
        boolean isFlag = true;
        char menu = 0;
        while (isFlag){

            if(menu != '1'){
                listAllEmployee();
            }

            System.out.print("1-团队列表 2-添加成员 3-删除团队成员 4-退出 请选择(1-4):");


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
                    System.out.print("确认是否退出(Y/N):");
                    char isQuit = TSUtility.readConfirmSelection();
                    if(isQuit == 'Y') {
                        isFlag = false;
                    }
                    break;
            }
        }
    }

    //以表格形式列出公司所有成员
    private void listAllEmployee(){
        System.out.println("-------------------------------------开发团队调度软件--------------------------------------\n");
        System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
        Employee[] employees = listSvc.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    //显示团队成员列表操作
    private void getTeam(){
        System.out.println("--------------------团队成员列表---------------------\n");
        Programmer[] programmers = teamSvc.getTeam();
        if(programmers == null || programmers.length == 0){
            System.out.println("团队没有开发成员");
        }else {
            System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票");
            for (int i = 0; i < programmers.length; i++) {
                System.out.println(programmers[i].getDetailsForTeam());
            }
        }
        System.out.println("-----------------------------------------------------");
    }

    //实现添加成员操作
    private void addMember() throws TeamException {
        System.out.println("---------------------添加成员---------------------");
        System.out.print("请输入要添加的员工id：");
        int id = TSUtility.readInt();
        try {
            Employee e = listSvc.getEmployee(id);
            teamSvc.addMember(e);
            System.out.println("添加成功");
        } catch (TeamException ex) {
            System.out.println("添加失败，原因：" + ex.getMessage());
        }
        TSUtility.readReturn();
    }

    //实现删除成员操作
    private void deleteMember() throws TeamException {
        System.out.println("---------------------删除成员---------------------");
        System.out.print("请输入要删除员工的TID：");
        int tid = TSUtility.readInt();
        System.out.print("确认是否删除(Y/N):");
        char isDelete = TSUtility.readConfirmSelection();
        if(isDelete == 'Y'){
            try {
                teamSvc.removeMember(tid);
                System.out.println("删除成功");
            } catch (TeamException e) {
                System.out.println("删除失败，原因：" + e.getMessage());
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
