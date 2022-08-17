package com.atguigu.team.domain;

import com.atguigu.team.service.Status;

public class Programmer extends Employee{

    private int memberId;//开发团队中的id
    private Status status = Status.FREE;
    private Equipment equipment;

    public Programmer(int id, String name, int age, double salary,Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return getInfo() + "\t程序员\t" + status + "\t\t\t\t\t" + equipment.getDescription();
    }


    public String getBaseInfo(){
        return memberId + "/" + getId() + "\t\t" + getName() + "\t" + getAge() + "\t" + getSalary();
    }

    //2/3	李彦宏	23	7000.0	程序员
    public String getDetailsForTeam(){
        return getBaseInfo() + "\t程序员";
    }
}
