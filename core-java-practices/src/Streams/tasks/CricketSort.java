package Streams.tasks;

import java.util.*;
import java.util.stream.Collectors;

public class CricketSort {
    public static void main(String[] args)
    {
        List<Cricket> list = new ArrayList<>();
        list.add(new Cricket("rohit", Arrays.asList(50, 25, 27, 28), 3));
        list.add(new Cricket("kohli", Arrays.asList(25, 25, 27, 28), 2));
        list.add(new Cricket("pandya", Arrays.asList(23, 25, 29, 28), 1));
        list.add(new Cricket("gill", Arrays.asList(30, 25, 27, 28), 4));
        list.add(new Cricket("rahul", Arrays.asList(23, 32, 27, 28), 5));
//        Map<List<Integer>,Double> map=new HashMap<>();
//        list.stream()
//                .sorted(Comparator.comparingDouble((i->i.getList().stream().
//                        mapToInt(j->j).average().orElse(0.0))
//                        .reversed()).forEach(System.out::println);//this doesn't work because of type inference  as the jvm
        //doesn't recognize what type of object is.
//        list.stream()
//                .sorted(Comparator.comparingDouble((Cricket i) -> i.getList().stream()
//                                .mapToInt(j -> j)
//                                .average()
//                                .orElse(0.0))
//                        .reversed()) //
//                .forEach(System.out::println);


        list.stream().sorted(Comparator.comparingDouble((Cricket i) -> i.getList().stream()
                                .mapToInt(j -> j)
                                .average()
                                .orElse(0.0))).limit(1)
                .forEach(System.out::println);


    }
}
