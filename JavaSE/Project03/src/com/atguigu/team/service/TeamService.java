package com.atguigu.team.service;

import com.atguigu.team.domain.Architect;
import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Programmer;

/**
 * ���ܣ����ڿ����Ŷӳ�Ա�Ĺ�����ӡ�ɾ���ȡ�
 * ˵����
 * counterΪ��̬����������Ϊ�����Ŷ�������Ա�Զ������Ŷ��е�ΨһID����memberId������ʾ��Ӧʹ����1�ķ�ʽ��
 * MAX_MEMBER����ʾ�����Ŷ�����Ա��
 * team���飺�������浱ǰ�Ŷ��еĸ���Ա����
 * total����¼�Ŷӳ�Ա��ʵ������
 */
public class TeamService {
    private static int counter = 1;
    private final int MAX_MEMBER = 5;
    private Programmer[] team = new Programmer[MAX_MEMBER];
    private int total;

    public TeamService() {
    }

    /**
     * ���ص�ǰ�Ŷӵ����ж���
     * @return �������г�Ա��������飬�����С���Ա����һ��
     */
    public Programmer[] getTeam(){
        Programmer[] programmers = new Programmer[total];
        for (int i = 0; i < programmers.length; i++) {
            programmers[i] = team[i];
        }
        return programmers;
    }

    /**
     * ���Ŷ�����ӳ�Ա
     * ����������ӳ�Ա�Ķ���
     * �쳣�����ʧ�ܣ� TeamException�а�����ʧ��ԭ��
     */
    public void addMember(Employee e) throws TeamException {
        //��Ա�������޷����
        if(total == MAX_MEMBER){
            throw new TeamException("��Ա�������޷����");
        }
        //�ó�Ա���ǿ�����Ա���޷����
        if(!(e instanceof Programmer)){
            throw new TeamException("�ó�Ա���ǿ�����Ա���޷����");
        }
        //��Ա�����ڱ������Ŷ���
        if(isExit(e)){
            throw new TeamException("��Ա�����ڱ������Ŷ���");
        }

        Programmer p = (Programmer) e;
        //��Ա������ĳ�Ŷӳ�Ա
        //��Ա�����ݼ٣��޷����
//        if("BUSY".equalsIgnoreCase(p.getStatus().getNAME())){
//            throw new TeamException("��Ա������ĳ�Ŷӳ�Ա");
//        }else if("VOCATION".equalsIgnoreCase(p.getStatus().getNAME())){
//            throw new TeamException("��Ա�����ݼ٣��޷����");
//        }

        switch (p.getStatus()){
            case BUSY:
                throw new TeamException("��Ա������ĳ�Ŷӳ�Ա");
            case VACATION:
                throw new TeamException("��Ա�����ݼ٣��޷����");
        }

        //�Ŷ�������ֻ����һ���ܹ�ʦ
        //�Ŷ�������ֻ�����������ʦ
        //�Ŷ�������ֻ������������Ա
        //ͳ�Ƶ�ǰ�Ŷ��и���Ա������
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
                throw new TeamException("�Ŷ�������ֻ����һ���ܹ�ʦ");
            }
        }else if(p instanceof Designer){
            if(numOfDes >= 2){
                throw new TeamException("�Ŷ�������ֻ�����������ʦ");
            }
        }else if(p instanceof Programmer){
            if(numOfPro >= 3){
                throw new TeamException("�Ŷ�������ֻ������������Ա");
            }
        }

        //��ӳɹ�
        team[total++] = p;
        //����memberid��״̬
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
     * ���Ŷ���ɾ����Ա
     * ɾ����Ա��memberId
     * �Ҳ���ָ��memberId��Ա����ɾ��ʧ��
     */
    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for (; i < total; i++) {
            if(team[i].getMemberId() == memberId){
                break;
            }
        }
        if(i == total){
            throw new TeamException("�Ҳ���ָ��memberId��Ա����ɾ��ʧ��");
        }

        for (int j = i + 1; j < total; j++) {
            team[j - 1] = team[j];
        }

        team[--total] = null;
        team[i].setStatus(Status.FREE);
    }

}
