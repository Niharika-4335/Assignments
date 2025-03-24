package basicconcepts;

import java.util.*;
import java.util.stream.IntStream;

public class TwoSum {
    public static void main(String[] args) {
        int a[]={1,4,5,3,7,9};
        int k=7;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]+a[j]==k){
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }
    }
}
