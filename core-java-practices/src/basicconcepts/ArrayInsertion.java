package basicconcepts;

public class ArrayInsertion {
    public static void main(String[] args) {
        int[] a= {1,3,4,5,8,2};
        int index=3;
        int newArray[]=new int[a.length+1];
        for(int i=0;i<index;i++) {
            newArray[i]=a[i];
        }
        newArray[index]=7;
        for(int i=index+1;i<newArray.length;i++) {
            newArray[i]=a[i-1];
        }
        for(int i=0;i<newArray.length;i++) {
            System.out.print(newArray[i]+" ");
        }
    }
}
