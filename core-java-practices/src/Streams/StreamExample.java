package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Student1{
int id;
String name;
int marks;

public Student1(int id, String name, int marks) {
    this.id = id;
    this.name = name;
    this.marks = marks;
}
public String toString(){
    return id+" "+name+" "+marks+"\n";
}
}
public class StreamExample {
    public static void main(String[] args) {
        List<Student1> list = new ArrayList<>();
        list.add(new Student1(1, "niharika", 96));
        list.add(new Student1(3, "abc", 97));
        list.add(new Student1(2, "def", 92));
        list.add(new Student1(4, "xyz", 91));
        System.out.print(list);
        Stream<Student1> stream=list.stream();
        stream.forEach(s->System.out.println(s));
    }
}
