package management.crud;

import management.Employee;
import management.RecordNotFoundException;

import java.util.List;

public class Delete {
    public static void delete_records(List<Employee> list, Integer id1) {
        try {
            for (Employee emp : list) {
                if (emp.getId()==id1) {
                    list.remove(emp);
                    break ;
                }
            }
        } catch (Exception e) {

            throw new RecordNotFoundException("Record not found with id"+ id1);
        }
    }

}
