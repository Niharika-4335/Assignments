package FunctionalInterfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodReferences {
    public static void print(String s){
        System.out.print(s);
    }
    public static void main(String[] args) {
        String[]a ={"abc","xyz","def","tuv"};
        Stream<String> stream=Stream.of(a);
        stream.forEach(MethodReferences::print);//Method reference -className:static method;
        List<Integer> list= Arrays.asList(1,2,3,10,5);
        Consumer<List<Integer>> consumer= Collections::sort;
        consumer.accept(list);
        System.out.println(list);
        List<String> list1= Arrays.asList("Joe", "Alice", "Bob", "Jane");
        String names=list1.stream().collect(Collectors.joining(","));
        System.out.println(names);
       boolean val=list1.stream().anyMatch(i->i.equalsIgnoreCase("jane"));
        System.out.println(val);





    }
}
