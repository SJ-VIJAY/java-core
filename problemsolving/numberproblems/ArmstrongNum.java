package problemsolving.numberproblems;

public class ArmstrongNum {

    static void arm(int n){
        int temp = n;
        int r ;
        int sum = 0;

        while(n > 0){
            r = n % 10;
            n = n / 10;
            sum = sum + r*r*r;
        }
        if(temp == sum)
            System.out.println(temp+" is Armstrong number");
        else
            System.out.println(temp+" is not a Armstrong number");
    }

    public static void main(String[] args) {
        arm(153);
    }
}
