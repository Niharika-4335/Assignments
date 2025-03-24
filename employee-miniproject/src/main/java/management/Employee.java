package management;

public class Employee extends EmployeeInformation {
    Integer id;
    String name;
    Integer age;
    String dept;
    Integer sal;
    String doj;
    String gender;
    String perform_score;

    public Employee(Integer id, String name, Integer age, String dept, Integer sal, String doj, String gender, String perform_score,String email) {
        super(email);
        this.id = id;
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.sal = sal;
        this.doj = doj;
        this.gender = gender;
        this.perform_score = perform_score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPerform_score() {
        return perform_score;
    }

    public void setPerform_score(String perform_score) {
        this.perform_score = perform_score;
    }
    public String toString(){
        return id+" "+name+" ";
    }
}
