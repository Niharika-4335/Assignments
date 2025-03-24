package Streams.Objects.Examples;

public class Employee  extends EmailField{
    Integer id;
    String name;
    Integer salary;
    String dept;

    public Employee(Integer id, String name, Integer salary, String dept,String email) {
        super(email);
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
    public String toString(){
        return id+" "+name+" "+salary+" "+dept+" ";
    }

}
