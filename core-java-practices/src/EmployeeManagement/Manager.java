package EmployeeManagement;

public class Manager  extends Employee{
    Integer bonus;

    public Manager(Integer id,String name,String dept,Integer salary,Integer bonus) {
        super(id,name,dept,salary);
        this.bonus = bonus;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public String toString() {
        return id+" "+name+" "+dept+" "+salary+" "+bonus+"\n";
    }
}
