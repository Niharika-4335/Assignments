package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

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
public class FunctionalInterfaceStudent {
    public static void main(String[] args) {
        List<Student1> list = new ArrayList<>();
        list.add(new Student1(1, "niharika", 96));
        list.add(new Student1(3, "abc", 97));
        list.add(new Student1(2, "def", 92));
        list.add(new Student1(4, "xyz", 91));
        Predicate<Student1> predicate=(s)->s.marks>50;
        for(Student1 s1:list) {
            if(predicate.test(s1))
            System.out.print(s1);
        }
        Function<Student1,Student1> function=(s)->
        {
            s.marks=s.marks+10;
            return s;

        };
        for(Student1 s2:list){
            System.out.print(function.apply(s2));

        }


    }

}
