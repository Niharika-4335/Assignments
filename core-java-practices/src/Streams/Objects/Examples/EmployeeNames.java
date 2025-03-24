package Streams.Objects.Examples;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeNames {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(1,"niharika",3000,"qa","abc@gmail.com"));
        list.add(new Employee(4,"abc",1000,"dev","xyz@gmail.com"));
        list.add(new Employee(2,"xyz",5000,"qa","def@gmail.com"));
        list.add(new Employee(3,"anil",2000,"dev","samar@gmail.com"));
        List<String> employeenames=list.stream().map(emp->emp.getName()).collect(Collectors.toUnmodifiableList());
        System.out.println(employeenames);


//     List<Employee> cmpsal=list.stream().sorted(Comparator.comparing(emp->emp.getSalary(), (c1, c2) -> c2.compareTo(c1))).collect(Collectors.toUnmodifiableList());
//     List<Employee> cmpsal1=list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toUnmodifiableList());
   List<Employee> cmpsal1=list.stream().sorted(Comparator.comparing(emp->emp.getSalary())).collect(Collectors.toUnmodifiableList());
        System.out.println(cmpsal1);

        Map<Integer,Employee> hashMap=new HashMap<>();
        list.stream().forEach(i->hashMap.put(i.getId(),i));
        System.out.println(hashMap);

        List<Integer> list1= list.stream().map(emp->emp.getId()).collect(Collectors.toList());
        System.out.println(list1);


        Map<String,Employee> hashMap1=new HashMap<>();
        System.out.println(list.stream().collect(Collectors.groupingBy(Employee::getDept)));

        Optional<Employee> emp=list.stream().max(Comparator.comparing(i->i.getSalary()));
        if(emp.isPresent()){
            System.out.println(emp.get());
        }
       OptionalDouble avg=list.stream().mapToInt(i->i.getSalary()).average();
        if(avg.isPresent()) {
            System.out.println(avg.getAsDouble());
        }
        List<String> uniquedept=list.stream().map(i->i.getDept()).distinct().collect(Collectors.toUnmodifiableList());
        System.out.println(uniquedept);
        long count=list.stream().filter(i->i.email.contains("gmail.com")).count();
        System.out.println(count);







    }
}
