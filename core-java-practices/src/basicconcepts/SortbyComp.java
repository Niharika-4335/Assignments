package basicconcepts;

import java.util.Arrays;
import java.util.Comparator;

class Employee2  {
    Integer id;
    String name;

    public Employee2(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SortbyComp {
    public static void main(String xyz[]) {
        Employee2[] emp = new Employee2[3];
        emp[0] = new Employee2(2, "apple");
        emp[1] = new Employee2(1, "guava");
        emp[2] = new Employee2(3, "banana");
        Comparator<Employee2> idComp = (emp1, emp2) -> {
            return emp1.id.compareTo(emp2.id);
        };
        Comparator<Employee2> nameComp = (emp1, emp2) -> {
            return emp1.name.compareTo(emp2.name);
        };
        //lambda function(parameters->expression)
        Arrays.sort(emp, idComp);
        for (int i = 0; i < emp.length; i++) {

            System.out.println(emp[i].id);
        }
    }
}

