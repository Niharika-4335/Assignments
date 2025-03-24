package Streams.medium;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question4 {
    public static boolean DuplicateCharacter(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    return true;
                }
            }


        }
        return false;
    }

    public static void main(String[] args) {
        List<String> list=Arrays.asList("niharika","harixyz","aa b","abc");
        List<String> list1=Arrays.asList("abc","xyz","def");
        List<Integer> list2=Arrays.asList(1,2,3,2,5,4,7,8);
//       list.stream().filter(Question4::DuplicateCharacter).forEach(i-> System.out.println(i));
//        list.stream().filter(s->s.length() !=s.chars().distinct().count()).forEach(i-> System.out.println(i));
//        //s.chars converts into intstream with ascii characters if we want to process characters maptoobj and then get characters.
//       long count= list1.stream().map(i->i.length()).distinct().count();
//       if(count==1){
//           System.out.println("same length");
//       }
//       else{
//           System.out.println("not same length");
//       }
//       list.stream().map(s->s.replaceAll(" ","")).forEach(i-> System.out.print(i+" "));
       String c="hari";
//       list.stream().filter(i->i.contains(c)).forEach(i-> System.out.println(i));
//        Map<Integer,Integer> hashMap=new HashMap<>();
//        list2.stream().forEach(i-> hashMap.put(i, hashMap.getOrDefault(i,0)+1));
//        System.out.println(hashMap);
      Map<Integer,Long>hashmap=list2.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));






    }
}
