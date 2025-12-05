package Ifelse;

import java.util.Scanner;

// "Find the greatest of two numbers"?
public class if4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a =sc.nextInt();
        System.out.println("Enter number 2: ");
        int b =sc.nextInt();

        int max = a > b?a:b;
        System.out.println("the greatest number is: "+max);

        sc.close();
    }
}
