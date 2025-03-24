package Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee9{
    String name;
    Integer id;
    Integer salary;
    String dept;

    public Employee9(String name, Integer id, Integer salary, String dept) {
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
public class StreamOperations {
    public static void main(String[] args) {
        List<Employee9> list=new ArrayList<>();
        list.add(new Employee9("niharika",1,3000,"QA"));
        list.add(new Employee9("abc",2,2000,"dev"));
        list.add(new Employee9("xyz",3,1000,"dev"));
        list.add(new Employee9("def",4,4000,"QA"));
        Stream stream=list.stream();
        Map<String,List<Employee9>> map=list.stream().sorted(Comparator.comparing(Employee9::getSalary).reversed()).collect(Collectors.groupingBy(Employee9::getDept));
        System.out.println(map);
//        List<Employee9> map1=list.stream().sorted(Comparator.comparing(Employee9::getSalary).reversed()).limit(2).toList();
//        System.out.print(map1);//query is to find out the maximum 2 records.
//        List<List<Integer>> listOfLists = Arrays.asList(
//                Arrays.asList(1, 2, 3),
//                Arrays.asList(4, 5),
//                Arrays.asList(6, 7, 8, 9)
//        );
//        listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
//
//                List<String> names = List.of("Alice", "Bob", "Charlie");
//
//                Optional<String> anyName = names.stream().findAny();
//
//                anyName.ifPresent(name -> System.out.println(name));
//











    }
}
