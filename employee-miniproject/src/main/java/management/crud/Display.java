package management.crud;

import management.Employee;

import java.util.List;

public class Display {
  public static void display_records(List<Employee> list){
      try {
          for (Employee emp : list) {
              System.out.println(emp);
          }
      }
      catch(Exception e){
          throw  new NullPointerException();
      }
  }

}
