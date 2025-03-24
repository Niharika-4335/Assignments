package basicconcepts;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=1;
        if((a & 1)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
