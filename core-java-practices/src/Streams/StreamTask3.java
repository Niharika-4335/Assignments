package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTask3 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("abc");
        list.add("niharika");
        list.add("abdul");
        list.add("abdul");
        list.add("venkatesh");
        list.add("anil");
        list.add("Abdul");
        list.add("pavan");
        Stream<String> stream=list.stream();
        stream.map(i->i.toLowerCase()).distinct().forEach(i->System.out.println(i));



    }
}
