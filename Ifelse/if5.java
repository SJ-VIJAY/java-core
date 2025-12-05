package Ifelse;
//Find the smallest of two numbers.
import java.util.Scanner;

public class if5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a =sc.nextInt();
        System.out.println("Enter number 2: ");
        int b =sc.nextInt();

        int min = a < b?a:b;
        System.out.println("the smallest number is: "+min);

        sc.close();
    }
}
