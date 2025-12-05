package Ifelse;
//Check if a person is eligible to vote (age ≥ 18).
import java.util.Scanner;

public class if3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int a =sc.nextInt();

        if (a>=18){
            System.out.println("your eligible for vote polling ");
        }
        else {
            System.out.println("your not eligible for vote polling ");

        }


    }
}
