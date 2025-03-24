package Streams;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) {
//        List<String> list=new ArrayList<>();
//        list.add("niharika");
//        list.add("shiva");
//        list.add("venkatesh");
//        list.add("anil");
//        Stream<String> stream=list.stream();
//        stream.forEach(i->System.out.println(i));
        Integer[] arr={1,2,3,4,5,2,6};
        Stream<Integer> stream=Stream.of(arr);
        long count=stream.distinct().filter(i->i%2==0).map(i->i+2).sorted().count();
        System.out.println(count);
//        List<Integer>list=stream.map(i->i+3).collect(Collectors.toList());
//        for(Integer i:list){
//            System.out.print(i);
//        }//we are trying to perform operation on stream which is already operated.

//        Stream<Double> stream=Stream.generate(()->Math.random()).limit(4);
//        stream.forEach(i->System.out.println(i));
//        Stream<Integer> stream=Stream.iterate(1,n->n+2).limit(4).skip(1);
//        stream.forEach(i->System.out.println(i));
          //If we want to execute two terminal operations then we have to create another stream.
//        Stream<Integer> stream1=Stream.of(arr);
//        Integer sum1=Stream.of(arr).reduce(0,Integer::sum);
//        System.out.println(sum1);
        Optional<Integer>sum1=Stream.of(arr).reduce(Integer::sum);
        System.out.println(sum1);
        Integer sum2=Stream.of(arr).reduce(0,Integer::max);
        System.out.println(sum2);
        Integer sum3=Stream.of(arr).reduce(0,Integer::min);
//        sum3.ifPresent(System.out::println);
        System.out.println(sum3);






    }
}
