package LibraryManagement;

import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class Library {
    public static void addBook(HashMap<String,Book> hashMap){
//        Scanner sc=new Scanner(System.in);
//        String a=sc.nextLine();
        List<Book> list=new ArrayList<>(3);
            Book book = new Book();
            book.setTitle("xyz");
            book.setAuthor("abx");
            book.setIsbn("def");
            list.add(book);
//            hashMap.put(a, book);
            Book book1 = new Book();
            book1.setTitle("xyz1");
            book1.setAuthor("abx2");
            book1.setIsbn("def1");
            list.add(book1);
            for(Book b:list){
                System.out.print(b);
            }

    }

    public static String getBook(HashMap<String,Book> hashMap, String ISBN) throws BookNotFoundException {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, Book> entry : hashMap.entrySet()) {

            if (entry.getKey().equals(ISBN)) {
                stringBuilder.append(entry.getValue().toString());
                return String.valueOf(stringBuilder);
            }

        }
        throw new BookNotFoundException("book not found");
    }
    public static void removeBook(HashMap<String, Book> hashMap, String ISBN) {
        try {
            if (hashMap.containsKey(ISBN)) {
                hashMap.remove(ISBN);
                System.out.println("Book with ISBN " + ISBN + " removed successfully.");
            } else {
                throw new BookNotFoundException("Book with ISBN " + ISBN + " not found.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void displayDetails(HashMap<String,Book> hashMap){
        for (Map.Entry<String,Book> entry : hashMap.entrySet()) {
            System.out.print(entry.getValue().toString());
        }
    }

}
