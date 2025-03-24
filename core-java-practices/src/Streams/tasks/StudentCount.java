package Streams.tasks;

import Streams.Objects.Examples.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StudentCount {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(1, "Alice", "Computer Science", 1500),
                new Student(2, "Bob", "Mathematics", 1200),
                new Student(3, "Charlie", "Computer Science", 1500),
                new Student(4, "Diana", "Mathematics", 1200),
                new Student(5, "Eve", "Physics", 1300)
        );

        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getDept,Collectors.counting())));

//        Map<String,List<String>> hashMap=new HashMap<>();
        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getDept,Collectors.mapping(Student::getName,Collectors.toList()))));


        List<Integer> list=Arrays.asList(0,10,2,3,5,4,8);

        List<String> list1=Arrays.asList("niharika","anil","pavan","venkatesh");

        String test= "nihArika";
        List<String> str=IntStream.range(0,test.length()).
                mapToObj(i->(i%2 ==0)? Character.toUpperCase(test.charAt(i)):Character.toLowerCase(test.charAt(i))).map(String::valueOf).collect(Collectors.toList());
        System.out.println(str);
        System.out.println(">>>>>>>>>>>>>"+String.join(" ",str));

        //filter(i->)forEach(i-> System.out.println(i));
        list1.stream().filter(i->list1.indexOf(i)%2==0 ).forEach(i-> System.out.println(i.toUpperCase()));

        System.out.println(list.stream().collect(Collectors.partitioningBy(i->i%2==0)));





    }
}
