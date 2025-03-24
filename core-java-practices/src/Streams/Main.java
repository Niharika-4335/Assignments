package Streams;

//class A{
//    public static void main(String[] args) {
//        System.out.println("hello");
//    }
//}
//
//public class Main {
//}
class A {
    public static void main(String[] args) {
        System.out.println("Hello from A");
    }
}

class B {
}
//why this runs because even though main method is not in public class jvm searches for the main method
//just to avoid ambiguity we use main method in public class.
//if there is no public class we can give any name as file name.
