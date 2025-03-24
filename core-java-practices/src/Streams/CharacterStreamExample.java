package Streams;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CharacterStreamExample {
    public static void main(String[] args) {
        String a="niharika";
        IntStream stream=a.chars();//here we are changing first into intstream and then character stream.
               stream.mapToObj(c->(char)c).sorted().forEach(i-> System.out.println(i));
        IntStream stream1=IntStream.of(5,1,2,3,4)  ;
//        stream1.parallel().asDoubleStream().forEachOrdered(i-> System.out.println(i));
        stream1.parallel().asDoubleStream().forEach(i-> System.out.println(i));


    }

}
