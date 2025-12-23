package problemsolving.numberproblems;

public class Fibonaci {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int third = 0;
        for(int i = 1 ; i <= 8 ;i++){
            System.out.println(first);
            third = first + second;
            first = second;
            second = third;
        }
    }
}
