package problemsolving.numberproblems;

public class SumofDigits {

    static void sumDigit(int start,int end){
        int sum = 0;
        for(int i = start; i <= end; i++){
            sum += i;
        }
        System.out.println("sum of digits is: "+sum);
    }
   static int sumDigitRec(int n){
        if(n == 0){
            return 0;
        }
        return n+sumDigitRec(n-1);
   }
    public static void main(String[] args) {
        //sumDigit(1,10);
        int res = sumDigitRec(10);
        System.out.println("sum of digits is: "+res);
    }
}
