package Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

class Person{
    Integer id;
    String name;
    Integer salary;

    public Person(int id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
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

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}


public class PractiseProgramsStreams {
    public static boolean isPrime(Integer n) {
        if (n<=1){
            return false;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
//        List<String> list= Arrays.asList("lavanya","niharika","jyothi","abcde");
//        Optional<String> a=list.stream().max(Comparator.comparing(i->i.length()));
//        System.out.println(a);
//        List<Person> list1=new ArrayList<>();
//        list1.add(new Person(1,"niahrika",3000));
//        list1.add(new Person(4,"jyothi",2000));
//        list1.add(new Person(2,"abc",1000));
//        list1.add(new Person(3,"xyz",3000));
//        OptionalDouble avg=list1.stream().mapToDouble(Person::getSalary).average();
        List<Integer> list=Arrays.asList(1,2,3,11,7,14,17);
       list.stream().filter(PractiseProgramsStreams::isPrime).forEach(i-> System.out.println(i));
       List<Integer> list3=Arrays.asList(1,2,4,5,6);
        List<Integer> list4=Arrays.asList(6,6,7,8,10,13);
        List<Integer> mergedlist=Stream.concat(list3.stream(),list4.stream()).sorted().collect(Collectors.toList());
        System.out.println(mergedlist);
        List<Integer> intersectionList=list3.stream().filter(i->list4.contains(i)).collect(Collectors.toUnmodifiableList());
        System.out.println(intersectionList);







    }
}
