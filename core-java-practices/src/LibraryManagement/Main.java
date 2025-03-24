package LibraryManagement;


import java.util.HashMap;

import static LibraryManagement.Library.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws BookNotFoundException {
        HashMap<String,Book> hashMap = new HashMap<>();
        Scanner sc=new Scanner(System.in);
//        System.out.println("adding book\n");
        addBook(hashMap);
//        displayDetails(hashMap);
//        System.out.print("retrieving data\n");
//        System.out.println(getBook(hashMap,"def"));
//        System.out.print("removing records\n");
//        removeBook(hashMap,"ghij");
//        System.out.print("displaying details\n");
//        displayDetails(hashMap);
    }

}
