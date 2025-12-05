package Ifelse;

import java.util.Scanner;

// Check if a number is positive or negative.
public class if1 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the number: ");
        int a =sc.nextInt();

        if (a > 0){
            System.out.println("the number is positive");
        }
        else if (a < 0){
            System.out.println("the number is negative");
        }
        else {
            System.out.println("the number is zero");
        }
    }

}
