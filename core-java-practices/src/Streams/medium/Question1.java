package Streams.medium;



import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question1 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,5,6,7,4,15);
        List<Integer> list1=Arrays.asList(1,10,16,17);
      IntSummaryStatistics intSummaryStatistics =list.stream().collect(Collectors.summarizingInt(i->i));
      //summarizingInt actually returns the instance  of IntSummaryStatistics we acn create object for that and retrieve the individual values.
//        System.out.println(intSummaryStatistics.getSum());
//        System.out.println(intSummaryStatistics.getMax());
//        System.out.println(intSummaryStatistics.getAverage());
//
//        Integer sum1=list.stream().mapToInt(i->i).sum();
//        System.out.println(sum1);
//        OptionalInt sum2=list.stream().mapToInt(i->i).min();
//        if(sum2.isPresent()){
//        System.out.println(sum2);}
//        OptionalDouble avg=list.stream().mapToInt(i->i).average();
//        System.out.println(avg);
//       list.stream().sorted().limit(2).forEach(i-> System.out.println(i));
//        list.stream().map(i->i*i).forEach(i-> System.out.println(i));
//        System.out.println(list.stream().reduce((a,b)->a*b).get());
//        list.stream().filter(i->i%3==0 && i%5==0).forEach(i-> System.out.println(i));
//        List<Integer> list2= list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toUnmodifiableList());
//        System.out.println(list.stream().filter(i->i%2!=0).mapToInt(i->i).sum());
//        list.stream().filter(i->list1.contains(i)).forEach(i-> System.out.println(i));
//        Integer a=4;
//        Integer b= list.indexOf(4);
//        Integer c=list.lastIndexOf(4);
//        System.out.println(b +" "+c);
//        List<Integer> list2=Stream.concat(list.stream(),list1.stream()).collect(Collectors.toUnmodifiableList());
//        System.out.println(list2);
        int max=list1.stream().mapToInt(i->i).max().getAsInt();
        int min=list1.stream().mapToInt(i->i).min().getAsInt();
        System.out.println(max-min);


    }
}
