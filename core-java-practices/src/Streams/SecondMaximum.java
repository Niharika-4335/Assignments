package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Employee{
    String name;
    Integer id;
    Integer salary;
    String dept;

    public Employee(String name, Integer id, Integer salary, String dept) {
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
public class SecondMaximum {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee("niharika",1,3000,"QA"));
        list.add(new Employee("abc",2,2000,"dev"));
        list.add(new Employee("xyz",3,1000,"dev"));
        list.add(new Employee("def",4,4000,"QA"));
        Stream<Employee> stream=list.stream();
        stream.sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).limit(1).forEach(i-> System.out.println(i));
       List<String> list2=new ArrayList<>();
       list2.add("niahrika");
       list2.add("anil");
       list2.add("satish");
       list2.add("venkatesh");
        Stream<String> stream2=list2.stream();
        stream2.map(i->i.toUpperCase()).sorted(Comparator.reverseOrder()).forEach(System.out::println);
        String a="aabcdefffghijkkkl";
        HashMap<Character,Integer> hashMap=new HashMap<>();
        a.chars().mapToObj(c->(char)c).forEach(i->hashMap.put(i, hashMap.getOrDefault(i,0)+1));
        System.out.println(hashMap);
       int avg_sum= list.stream().mapToInt(Employee::getSalary).sum();//explain this statement
//        System.out.println(avg_sum);
        int b= list.size();
       int c=avg_sum/b;
        list.stream().filter(i->i.getSalary()>c).forEach(i->System.out.println(i));
    }
}
