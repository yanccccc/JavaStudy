package com.atguigu.team.service;

import com.atguigu.team.domain.Architect;
import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Programmer;

/**
 * 功能：关于开发团队成员的管理：添加、删除等。
 * 说明：
 * counter为静态变量，用来为开发团队新增成员自动生成团队中的唯一ID，即memberId。（提示：应使用增1的方式）
 * MAX_MEMBER：表示开发团队最大成员数
 * team数组：用来保存当前团队中的各成员对象
 * total：记录团队成员的实际人数
 */
public class TeamService {
    private static int counter = 1;
    private final int MAX_MEMBER = 5;
    private Programmer[] team = new Programmer[MAX_MEMBER];
    private int total;

    public TeamService() {
    }

    /**
     * 返回当前团队的所有对象
     * @return 包含所有成员对象的数组，数组大小与成员人数一致
     */
    public Programmer[] getTeam(){
        Programmer[] programmers = new Programmer[total];
        for (int i = 0; i < programmers.length; i++) {
            programmers[i] = team[i];
        }
        return programmers;
    }

    /**
     * 向团队中添加成员
     * 参数：待添加成员的对象
     * 异常：添加失败， TeamException中包含了失败原因
     */
    public void addMember(Employee e) throws TeamException {
        //成员已满，无法添加
        if(total == MAX_MEMBER){
            throw new TeamException("成员已满，无法添加");
        }
        //该成员不是开发人员，无法添加
        if(!(e instanceof Programmer)){
            throw new TeamException("该成员不是开发人员，无法添加");
        }
        //该员工已在本开发团队中
        if(isExit(e)){
            throw new TeamException("该员工已在本开发团队中");
        }

        Programmer p = (Programmer) e;
        //该员工已是某团队成员
        //该员正在休假，无法添加
//        if("BUSY".equalsIgnoreCase(p.getStatus().getNAME())){
//            throw new TeamException("该员工已是某团队成员");
//        }else if("VOCATION".equalsIgnoreCase(p.getStatus().getNAME())){
//            throw new TeamException("该员正在休假，无法添加");
//        }

        switch (p.getStatus()){
            case BUSY:
                throw new TeamException("该员工已是某团队成员");
            case VACATION:
                throw new TeamException("该员正在休假，无法添加");
        }

        //团队中至多只能有一名架构师
        //团队中至多只能有两名设计师
        //团队中至多只能有三名程序员
        //统计当前团队中各成员的人数
        int numOfArch = 0,numOfDes = 0,numOfPro = 0;
        for (int i = 0; i < total; i++) {
            if(team[i] instanceof Architect){
                numOfArch++;
            }else if(team[i] instanceof Designer){
                numOfDes++;
            }else if(team[i] instanceof Programmer){
                numOfPro++;
            }
        }

        if(p instanceof Architect){
            if(numOfArch >= 1){
                throw new TeamException("团队中至多只能有一名架构师");
            }
        }else if(p instanceof Designer){
            if(numOfDes >= 2){
                throw new TeamException("团队中至多只能有两名设计师");
            }
        }else if(p instanceof Programmer){
            if(numOfPro >= 3){
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }

        //添加成功
        team[total++] = p;
        //设置memberid和状态
        p.setMemberId(counter++);
        p.setStatus(Status.BUSY);

    }

    private boolean isExit(Employee e) {
        for (int i = 0; i < total; i++) {
            if(team[i].getId() == e.getId()){
                return true;
            }
        }
        return false;
    }

    /**
     * 从团队中删除成员
     * 删除成员的memberId
     * 找不到指定memberId的员工，删除失败
     */
    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for (; i < total; i++) {
            if(team[i].getMemberId() == memberId){
                break;
            }
        }
        if(i == total){
            throw new TeamException("找不到指定memberId的员工，删除失败");
        }

        for (int j = i + 1; j < total; j++) {
            team[j - 1] = team[j];
        }

        team[--total] = null;
        team[i].setStatus(Status.FREE);
    }

}
