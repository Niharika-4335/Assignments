package Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IterateExample {
    public static void main(String[] args) {
//        Stream.iterate(0,i->i+1).limit(20).sorted(Comparator.reverseOrder()).forEach(System.out::println);
//        Random random=new Random();
//        Stream<Integer> stream=Stream.generate(random::nextInt);
//        stream.forEach(System.out::println);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        double a = numbers.stream().mapToDouble(i -> i).average().orElse(0);
        System.out.println(a);
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Jane");
//        Map<String,Integer>hashMap =new TreeMap<>();
//                names.stream().forEach(i->hashMap.put(i,i.length()));
        Map<Integer, List<String>> hashMap = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(hashMap);
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 3),
                Arrays.asList(8, 6, 7));
        list.stream().flatMap(List::stream).forEach(System.out::println);
    }

    }


