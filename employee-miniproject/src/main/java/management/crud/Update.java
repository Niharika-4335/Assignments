package management.crud;


import management.Employee;
import management.RecordNotFoundException;

import java.util.List;

public class Update {
    public static void update_records(List<Employee> list,Integer id1){
      for(Employee emp:list){
          try {
              if (emp.getId() == id1) {
                  emp.setName("sarah");
              }
          } catch (Exception e) {
              throw new RecordNotFoundException("Record not found with id" + id1);
          }
      }
    }


    public static void update_salary(List<Employee> list){
        for(Employee emp:list){
            try {
                if (emp.getPerform_score().equals("good")) {
                    emp.setSal(emp.getSal() + 2000);
                }
            }
            catch(Exception e){
                throw new ArithmeticException();
            }
        }
    }

    public static void age_based_bonus(List<Employee> list){
        for(Employee emp:list){
            if(emp.getAge()>50){
                emp.setSal(emp.getSal()+5000);
            }
            else if(emp.getAge()>60){
                emp.setSal(emp.getSal()+6000);
            }
            else{
                throw new ArithmeticException();
            }
        }
    }


}
