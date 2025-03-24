package EmployeeManagement;

import java.util.ArrayList;
import java.util.List;

import static EmployeeManagement.EmployeeService.*;


public class Main {
    public static void main(String[] args) {
        List<Manager> list=new ArrayList<>();
        list.add(new Manager(1,"niharika","CSE",30000,1000));
        list.add(new Manager(6,"venkatesh","CSE",30000,1000));
        list.add(new Manager(3,"anil","CSE",30000,1000));
        list.add(new Manager(5,"pavan","CSE",30000,1000));
        list.add(new Manager(4,"praneeth","CSE",30000,1000));
        list.add(new Manager(2,"abdul","CSE",30000,1000));
//       addEmployee(list);
        remove(list,1);
        update(list,2);
        System.out.print("printing details after sorting\n");
        sort(list);
//      printDetails(list);
    }
}
