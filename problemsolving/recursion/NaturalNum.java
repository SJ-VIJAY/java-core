package problemsolving.recursion;

public class NaturalNum {
    static void numOrder(int n){
        if(n==10){
            System.out.println(n);
        }
        else {
            System.out.println(n);
            numOrder(n+1);
        }
    }
    static void numRevOrder(int n){
        if(n == 1){
            System.out.println(n);
        }
        else {
            System.out.println(n);
            numRevOrder(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Number in order: ");
        numOrder(1);
        System.out.println("Number in Reverse order: ");
        numRevOrder(10);

    }
}
