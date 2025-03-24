package basicconcepts;

public class SwapNum {
    public static void main(String[] args) {
        int a=3;
        int b=6;
        a=a^b;
        b=a^b;
        a=b^a;
        System.out.println(a);
        System.out.println(b);
    }
}
