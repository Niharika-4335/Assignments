package Streams.Objects.Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingGenre {
    public static void main(String[] args) {
        List<Book> list=new ArrayList<>();
        list.add(new Book(1,"wings of fire","motivational"));
        list.add(new Book(2,"atomic habits","motivational"));
        List<Book> list1=new ArrayList<>();
        list1.add(new Book(3,"it ends with us","fictional"));
        list1.add(new Book(4,"interstellar","fictional"));
        List<Book> list2=new ArrayList<>();
        list2.add(new Book(5," A girl in room 105","thriller"));

//        Map<String,List<Book>> hashMap= list.stream().collect(Collectors.groupingBy(i->i.getGenre()));
//        System.out.println(hashMap);

        List<List<Book>> list4=List.of(list,list1,list2);

        List<Book> list5=list4.stream().flatMap(List::stream).collect(Collectors.toUnmodifiableList());
        System.out.println(list5);





    }
}
