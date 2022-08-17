package com.atguigu.team.domain;

public class Designer extends Programmer{
    private double bonus;

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return getInfo() + "\t设计师\t" + getStatus() + "\t" + bonus + "\t\t\t" + getEquipment().getDescription();
    }

    //3/5	雷军	28	10000.0	设计师	5000.0
    @Override
    public String getDetailsForTeam() {
        return getBaseInfo() + "\t设计师\t" + getBonus();
    }
}
