package management;

import management.crud.Delete;
import management.crud.Display;
import management.crud.Update;

import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Files.delete;

public class Main {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(1,"niharika",20,"dev",20000,"12-02-22","female","good","abc@gmail.com"));
        list.add(new Employee(3,"praneeth",30,"qa",30000,"16-02-23","male","bad","xyz@gmail.com"));
        list.add(new Employee(2,"venkatesh",40,"dev",40000,"18-02-24","female","good","niha@gmail.com"));
        list.add(new Employee(4,"anil",50,"qa",30000,"20-02-25","male","bad","wby@gmail.com"));
        list.add(new Employee(5,"pavan",60,"dev",60000,"22-02-24","female","good","abde@gmail.com"));

//       Delete delete=new Delete();
//       delete.delete_records(list,4);
//
//
//        Update update=new Update();
//        update.update_records(list,2);
//        System.out.println("after updating details");
//
//        Display display1=new Display();
//        display1.display_records(list);
//
        StreamOperations streamOperations=new StreamOperations();
//        streamOperations.CountEmployeesByDept(list);
//        streamOperations.joinDepartments(list);
//        streamOperations.averageSalary(list);
          streamOperations.filterByGender(list);


    }

}
