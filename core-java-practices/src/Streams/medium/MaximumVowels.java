package Streams.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaximumVowels {
     public static String VowelCount(List<String> list){
         StringBuilder stringBuilder=new StringBuilder();
         for(String s:list) {
             int count = 0;
             for (int i = 0; i < s.length(); i++) {
                 char c = s.charAt(i);
                 if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                     count++;
                 }
             }
             stringBuilder.append(count);
         }
        return String.valueOf(stringBuilder);
     }

    public static void main(String[] args) {
        List<String> list1= Arrays.asList("niharika","aeiou","abc","xyz");
        System.out.println(VowelCount(list1));

    }
}
