package Streams.Objects.Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GroupingByHobbies {

    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student("niharika",Arrays.asList("dancing","painting","pottery","singing")));
        list.add(new Student("anil", Arrays.asList("dancing","painting","coding","singing")));
        list.add(new Student("venkatesh",Arrays.asList("dancing","poetry","pottery","singing")));
        list.add(new Student("pavan",Arrays.asList("dancing","poetry","pottery","singing")));

        List<String> list1=list.stream().flatMap(t -> t.getHobbies().stream()).collect(Collectors.toUnmodifiableList());
        System.out.println(list1);

        List<Student> list2=list.stream().sorted(Comparator.comparing(Student::getName).reversed()).collect(Collectors.toUnmodifiableList());
        System.out.println(list2);





    }
}
