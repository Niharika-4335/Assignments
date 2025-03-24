package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListObjects {
    private Integer id;
    private String name;

    public ArrayListObjects(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return id + " "+name;
    }

    // to string
    public static void main(String xyz[]) {


        List<ArrayListObjects> list=new ArrayList<>();
        list.add(new ArrayListObjects("niharika",1));
        list.add(new ArrayListObjects("xya",2));
        list.add(new ArrayListObjects("uygfy",3));
        list.add(new ArrayListObjects("hjgsdcy",4));
        list.add(new ArrayListObjects("uygsdcyusd",5));
        list.add(new ArrayListObjects("hsgvcgds",6));
        Comparator<ArrayListObjects> emp1=(emp2, emp3)->{return emp2.getName().compareTo(emp3.getName());};
        Collections.sort(list,emp1);
        for(ArrayListObjects emp:list){
            System.out.println(emp);
        }


//        Employee emp1=new Employee("potter", 2);
//
//        List<Employee> emp2=new ArrayList<Employee>();
//        Employee emp3=new Employee("harry", 1);
//        emp2.add(emp3);
//        Employee emp4=new Employee("harry", 1);
//        emp2.add(emp4);
//
//        emp2.add(emp3);
//        for(Employee emp3:emp2) {
//            System.out.print(emp3.getId()+" "+emp3.getName());
//        }
    }

}
