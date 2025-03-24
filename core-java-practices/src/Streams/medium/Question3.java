package Streams.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question3 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("abc","anil","aabcahrika","venkatesh");
        list.stream().filter(i->i.indexOf("a")==0).forEach(i-> System.out.println(i));
        
    }
}
