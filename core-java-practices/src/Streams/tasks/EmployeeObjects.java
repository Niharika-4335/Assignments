package Streams.tasks;

import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class EmployeeObjects {
    String name;
    Integer age;
    Integer salary;

    public EmployeeObjects(String name, Integer age, Integer salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    public String toString(){
        return name+" "+age+" "+salary;
    }


    public static void main(String[] args) {
        List<EmployeeObjects> list=new ArrayList<>();
        list.add(new EmployeeObjects("niahrika",15,20000));
        list.add(new EmployeeObjects("anil",20,23000));

        List<EmployeeObjects> list1=new ArrayList<>();
        list1.add(new EmployeeObjects("pavan",35,40000));
        list1.add(new EmployeeObjects("venkatesh",20,35000));

        List<List<EmployeeObjects>> list2=List.of(list,list1);
        List<EmployeeObjects>  list3=list2.stream().flatMap(List::stream).collect(Collectors.toUnmodifiableList());
        System.out.println(list3);

      List<EmployeeObjects> list4= list3.stream().sorted(Comparator.comparing(EmployeeObjects::getName).reversed()).collect(Collectors.toUnmodifiableList());
        System.out.println(list4);


        Stream.of(list,list1).flatMap(Collection::stream).sorted(Comparator.comparing(EmployeeObjects::getName)).collect(Collectors.toList()).reversed().forEach(System.out::println);



//         Stream vs streams
           List<Integer> list5= Arrays.asList(1,2,3,4,5,6,7);
           List<Integer> list6= Arrays.asList(4,5,6,7);
           list5.stream().filter(i->list6.contains(i)).forEach(System.out::println);


    }
}
