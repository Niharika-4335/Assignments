package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class person{
    String name;
    Integer id;
    Integer age;

    public person(String name,Integer id,Integer age) {
        this.name = name;
        this.id=id;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }
}
public class StreamExample2 {
//    public static int sortName(List<person> list){
//        return person.name.compareTo()
//    }
    public static void main(String[] args) {

        List<person> list=new ArrayList<>();
        list.add(new person("niharika",12,13));
        list.add(new person("lavanya",19,28));
        list.add(new person("venkatesh",16,18));
        Stream<person> stream=list.stream();
        //filtering age above 25.
        stream.map(p->p.getAge()).filter(i->i>25).forEach(System.out::println);
//        Stream<person> stream1=list.stream();
//        stream1.map(person::getName).forEach(i->System.out.println(i));
//        Stream<person> stream2=list.stream();
//        stream2.map(person::getName).map(String::toUpperCase).sorted().forEach(i->System.out.println(i));

    }
}
