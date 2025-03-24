package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class EmployeeExample{
    Integer id;
    String name;
   Integer salary;

    public EmployeeExample(Integer id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String toString(){
        return  salary + " ";
    }

}
public class Example2 {
    public static void main(String[] args) {
//        EmployeeExample[] employeeExample=new EmployeeExample[4];
//       employeeExample[0]=new EmployeeExample(1,"niharika",350);
//       employeeExample[1]=new EmployeeExample(4,"xyz",400);
//      employeeExample[2]=new EmployeeExample(2,"abc",550);
//      employeeExample[3]=new EmployeeExample(3,"efgh",800);
//        Comparator<EmployeeExample> cmp1=(emp1sal,emp2sal)->{return emp1sal.salary.compareTo(emp2sal.salary);};
//        Arrays.sort(employeeExample,cmp1);
//        for(int i=0;i<)
        ArrayList<EmployeeExample> employeeExample=new ArrayList<>();
        employeeExample.add(new EmployeeExample(1,"niharika",350));
       employeeExample.add(new EmployeeExample(4,"xyz",400));
      employeeExample.add(new EmployeeExample(2,"abc",550));
      employeeExample.add(new EmployeeExample(3,"efgh",800));
        Comparator<EmployeeExample> cmp1=(emp1sal,emp2sal)->{return emp1sal.salary.compareTo(emp2sal.salary);};
        Collections.sort(employeeExample,cmp1);
        Collections.reverse(employeeExample);
        for(EmployeeExample details:employeeExample){
            System.out.println(details);
        }


    }
}
