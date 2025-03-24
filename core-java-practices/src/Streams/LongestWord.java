package Streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class LongestWord {
    public static void main(String[] args) {
        String a="Java streams are very powerful for functional programming";
        String[] b=a.split(" ");
        //        for(int i=0;i<b.length;i++) {
//            list.add(b[i]);
//        }
        List<String> list = new ArrayList<>(List.of(b));
//        IntStream stream=a.chars();
        Optional<String> optional= list.stream().max(Comparator.comparing(String::length));
        System.out.println(optional);
        List<String> words = Arrays.asList("apple", "banana", "avocado", "blueberry", "cherry", "carrot");
        Function<String, Character> function=(i->i.charAt(0));//grouping by first letter of string
        Map<Character,List<String>> hashmap=words.stream().collect(Collectors.groupingBy(function));
        System.out.println(hashmap);
        String sentence = "apple banana apple cherry banana apple";//finding  most repeated word
        String[] e=sentence.split(" ");
        List<String> list1 = new ArrayList<>(List.of(e));
        Map<String, Integer> hashMap1=new HashMap<>();
                list1.stream().forEach(i->hashMap1.put(i,hashMap1.getOrDefault(i,0)+1));
        String Maximum_key = null;
        int Maximum_value = -1;
        for (Map.Entry<String, Integer> entry : hashMap1.entrySet()) {
            if (entry.getValue() > Maximum_value) {
                Maximum_value = entry.getValue();
                Maximum_key = entry.getKey();
            }
        }
        System.out.println(Maximum_key);




    }
}
