package problemsolving.numberproblems;

public class Factorial {
    static void fact(int n){
        int factorial = 1;
        for(int i = 1; i <= n;i ++){
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args) {
          fact(5);
    }
}
