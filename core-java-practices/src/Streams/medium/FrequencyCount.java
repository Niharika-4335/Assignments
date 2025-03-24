package Streams.medium;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FrequencyCount {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        char targetChar = 'a';
        strings.stream().filter(s -> s.chars().filter(c ->  c == targetChar).count() >= 2).forEach(i-> System.out.println(i));


        List<Integer> list=Arrays.asList(1,3,4,2,8,6);
        int k=2;
       Optional<Integer> a=list.stream().sorted().skip(k-1).findFirst();
       if(a.isPresent()){
           System.out.println(a.get());
       }
    }
}
