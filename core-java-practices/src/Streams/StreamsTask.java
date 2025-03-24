package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Employee6{
    Integer age;
    String name;
    String dept;

    public Employee6(Integer age, String name, String dept) {
        this.age = age;
        this.name = name;
        this.dept = dept;
    }
   public String toString(){
       return age+" "+name+" "+dept;
   }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }
}
public class StreamsTask {
    public static void main(String[] args) {
        List<Employee6> list=new ArrayList<>();
        list.add(new Employee6(12,"niharika","CSE"));
        list.add(new Employee6(20,"abc","EEE"));
        list.add(new Employee6(31,"def","CSE"));
        list.add(new Employee6(43,"xyz","ECE"));

        getName(list,"CSE");

    }
//    public static String getName(List<Employee6> list,String dept1){
//        StringBuilder stringBuilder=new StringBuilder();
//        for(Employee6 emp:list){
//            if(emp.age>30 && emp.dept.equals(dept1)){
//                stringBuilder.append(emp.name);
//            }
//        }
//        return String.valueOf(stringBuilder);//use streams here
//    }
    public static void getName(List<Employee6> list,String dept1){
        Stream<Employee6> stream=list.stream();
        stream.filter(emp->emp.getAge()>=30&&emp.getDept().equals(dept1)).forEach(emp->System.out.print(emp.getName()));
    }


}
