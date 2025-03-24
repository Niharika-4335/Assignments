package Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toMap;

class Employee8{
    String name;
    Integer id;
    Integer salary;
    String dept;

    public Employee8(String name, Integer id, Integer salary, String dept) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getDept() {
        return dept;
    }
    public String toString(){
        return name+" "+id+" "+salary+" "+dept;
    }
}

public class EmployeeObjects {
    public static void main(String[] args) {
        List<Employee8> list=new ArrayList<>();
        list.add(new Employee8("niharika",1,3000,"QA"));
        list.add(new Employee8("abc",2,2000,"dev"));
        list.add(new Employee8("xyz",3,1000,"dev"));
        list.add(new Employee8("def",4,4000,"QA"));
      HashMap<Integer,Employee8> hashMap=new HashMap<>();
//      Stream<Employee8> stream=list.stream();
//      stream.forEach(emp-> hashMap.put(emp.getId(),emp));
      for(Employee8 emp:list){
          hashMap.put(emp.getId(),emp);
      }
        System.out.println(hashMap);
//        getEmployee1(hashMap,list,"dev");
//        getEmployee2(hashMap,list);
//        findName(hashMap,list,"def");
//        maxSalary(hashMap,list);
        grpbyDept(list);

    }
    public static void getEmployee1(HashMap<Integer,Employee8> hashMap,List<Employee8>list,String a){
//        for (Map.Entry<Integer,Employee8> entry : hashMap.entrySet()) {
//            Employee8 emp=entry.getValue();
//            if(emp.getDept().equals(a)){
//                System.out.println(emp);
//            }
//            }
//        Stream<Employee8> stream=list.stream();
//      List<Employee8> list1=stream.filter(emp->emp.getDept().equals(a)).collect(Collectors.toList());
//        System.out.println(list1);
        Stream<Employee8> stream=list.stream().filter(emp->emp.getDept().equalsIgnoreCase(a));
        Map<Integer,Employee8>map=new HashMap<>();
         stream.forEach(emp->map.put(emp.getId(),emp));
         System.out.println(map);
    }
    public static void getEmployee2(HashMap<Integer,Employee8> hashMap,List<Employee8>list){
         Stream<Employee8> stream=list.stream().filter(e->e.getSalary()>1000);
         Map<Integer,Employee8> map1=new HashMap<>();
        stream.forEach(emp->map1.put(emp.getId(),emp));
//       map1=stream.collect(Collectors.toMap(emp->map1.put(emp.getId(),emp))
        System.out.println(map1);
    }
    public static void findName(HashMap<Integer,Employee8> hashMap,List<Employee8>list,String name){
        Stream<Employee8> stream=list.stream().filter(i->i.getName().equalsIgnoreCase(name));
        Map<Integer,Employee8> map1=new HashMap<>();
        stream.forEach(emp->map1.put(emp.getId(),emp));
        System.out.println(map1);
    }
    public static void maxSalary(HashMap<Integer,Employee8> hashMap,List<Employee8> list){

        Comparator<Employee8> cmp1=(emp1,emp2)->{return emp2.getSalary().compareTo(emp1.getSalary());};
        Stream<Employee8> stream= list.stream().max(cmp1).stream();
//        Stream<Employee8> stream= list.stream().max(Comparator.comparing(Employee8::getSalary)).stream();
        Map<Integer,Employee8> map1=new LinkedHashMap<>();
        stream.forEach(emp->map1.put(emp.getId(),emp));
        System.out.println(map1);//had an issue not working for if we sent cmp1.


    }
    public static void grpbyDept(List<Employee8> list){
        Map<String, List<Employee8>> map = list.stream()
                .collect(Collectors.groupingBy(Employee8::getDept));
        System.out.print(map);
    }


}
