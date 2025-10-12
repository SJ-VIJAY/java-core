package basicnumberprograms;

public class OddOrEvenNo {
    static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(isEven(n));
    }
}
