package Streams.tasks;

import java.util.*;
import java.util.stream.Collectors;

public class FindingDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 3, 5, 6, 1);
        Set<Integer> hashSet=new HashSet<>();
        numbers.stream().filter(i->!hashSet.add(i)).forEach(i-> System.out.println(i));
         Integer k=2;
      List<Integer> list= numbers.stream().distinct().sorted(Comparator.reverseOrder()).limit(k).skip(k-1).collect(Collectors.toUnmodifiableList());
        System.out.println(list);
        String a="niharika";
        String b="niharikaz";
        System.out.println(a==b);

    }
}
