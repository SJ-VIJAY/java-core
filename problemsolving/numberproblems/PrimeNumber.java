package problemsolving.numberproblems;

public class PrimeNumber {
   static void isPrime(int n){
       int count = 0;
       for(int i = 1; i <= n; i++){
           if(n%i == 0){
               count++;
           }
       }
       if(count == 2){
           System.out.println(n+" is a prime number");
       }
       else{
           System.out.println(n+" is not a prime number");
       }
    }
    static void isPrime2(int n){
       if(n <= 1){
           System.out.println(n+" is not a prime");
           return;
       }
       for(int i = 2; i <= Math.sqrt(n) ; i++){
           if(n%i == 0){
               System.out.println(n+" is not a prime");
               return;
           }
       }
        System.out.println(n+" is a prime number");
    }
    static void isPrime3(int n){
        int count = 0;
        for(int i = 1;i <= n;i++){
            if(n%i == 0) count++;
        }
        if(count == 2) System.out.println("is a prime");
        else System.out.println("is not a prime");
    }
    public static void main(String[] args) {
//        isPrime(11);
//        isPrime2(11);
        isPrime3(11);
    }

}
