package Streams.medium;

import com.mysql.cj.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

public class Question2 {
    public static boolean VowelCheck(String s){
       for(int i=0;i<s.length();i++){
           char c=s.charAt(i);
           if(c!='a' && c!='e' && c!='i'&& c!='o'  && c!='u'){
               return  false;
           }
       }
       return true;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("niharika", "xyz", "au", "durga","aeiou","a");

//        System.out.println(list.stream().filter(i->i.contains("a")).count());
//        System.out.println(list.stream().map(i->i.toUpperCase()).collect(Collectors.toUnmodifiableList()));
//        System.out.println(list.stream().collect(Collectors.joining()));
//        System.out.println(list.stream().max(Comparator.comparing(String::length)).get());
//        System.out.println(list.stream().max(Comparator.comparing(String::length).reversed()).get());
//
//        Boolean val= list.stream().anyMatch(i->i.contains("xyz"));
//        System.out.println(val);
//        list.stream().filter(i->i.length()>=5).forEach(i-> System.out.println(i));
//        Boolean val1=list.stream().anyMatch(Objects::nonNull);
//        System.out.println(val1);
      List<String> list1=list.stream().filter(i->i.matches("[aeiou]+")).collect(Collectors.toList());
        System.out.println(list1);
//        list.stream().map(i->i.toLowerCase()).filter(Question2::VowelCheck).forEach(i-> System.out.println(i));
         System.out.println(list.stream().collect(Collectors.joining(",")));




    }
}








