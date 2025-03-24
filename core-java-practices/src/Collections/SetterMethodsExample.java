package Collections;

import LibraryManagement.Book;

import java.util.HashMap;
import java.util.Map;

public class SetterMethodsExample {
    public static void main(String[] args) {
        HashMap<String, Book> hashMap=new HashMap();
        Book book = new Book();
        book.setTitle("xyz");
        book.setAuthor("abx");
        book.setIsbn("def");
        hashMap.put("key1",book);
        Book book1= new Book();
        book1.setTitle("xyz");
        book1.setAuthor("abx");
        book1.setIsbn("def");
        hashMap.put("key2",book1);

        System.out.print(book1);
        for(Map.Entry<String,Book> entry:hashMap.entrySet()){
            System.out.print(entry.getKey() +" "+entry.getValue());
        }


    }
}
