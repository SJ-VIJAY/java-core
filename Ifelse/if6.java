package Ifelse;


import java.util.Scanner;

//  Check if a number is divisible by both 5 and 11
public class if6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        if (a%5==0 && a%11==0){
            System.out.println("The given num is div by 5 & 11");
        }
        else{
            System.out.println("The given num not div by 5 & 11");

        }
        sc.close();
    }
}
