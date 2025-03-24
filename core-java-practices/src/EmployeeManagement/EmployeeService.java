package EmployeeManagement;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class EmployeeService {
    public static void main(String[] args) {
    }
    public static void addEmployee(List<Manager> list){
        Scanner sc=new Scanner(System.in);
        Integer id1=sc.nextInt();
        String name1=sc.next();
        String dept=sc.next();
        Integer salary1=sc.nextInt();
        Integer bonus1=sc.nextInt();
        list.add(new Manager(id1,name1,dept,salary1,bonus1));

    }
    public static void remove(List<Manager> list,Integer id1){
//        try {
//            for(Manager manager:list){
//                if(manager.getId().equals(id1)){
//                    list.remove(manager);
//                }
//            }
//        }
//        catch(NullPointerException e){
//            System.out.println(e.getMessage());
//        }
        list.removeIf(manager -> manager.getId().equals(id1));

    }
    public static  void update(List<Manager> list,Integer id2){
        Stream<Manager> stream=list.stream();
        stream.filter(emp->emp.getId().equals(id2)).forEach(m->m.setName("harika"));
//        try {
//            for(Manager m:list){
//                if(m.getId()==id2){
//                    m.setName("harika");
//                }
//            }
//
//        }
//        catch(NullPointerException e){
//            System.out.println(e.getMessage());
//        }
    }
    public static void sort(List<Manager> list){
         Stream<Manager> stream=list.stream();
         Comparator<Manager> cmp=(m1,m2)->{return m1.getId().compareTo(m2.getId());};
         stream.sorted(cmp).forEach(System.out::print);
    }
    public static  void printDetails(List<Manager> list){
        Stream<Manager> stream=list.stream();
        stream.forEach(i->System.out.print(i));
//        for(Manager manager:list){
//            System.out.print(manager);
//        }
    }


}
