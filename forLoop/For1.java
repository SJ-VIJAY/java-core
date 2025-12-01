package forLoop;
//Print all odd numbers from 1 to 20
//
//Print numbers from 10 to 1 in reverse
//
//Display the multiplication table of a given number (e.g., 5)
//
//Print the squares of numbers from 1 to 10
//
//Calculate the sum of first 10 natural numbers
//
//Find the factorial of a given number
//
//Print characters from A to Z

//Print the first 10 terms of the Fibonacci series


import java.util.Scanner;

public class For1 {
    static Scanner sc = new Scanner(System.in);
    // Print numbers from 1 to 10
   private static void printnum(){
        System.out.println("print 1 to 10 numbers..:");
        for (int i =1;i<=10;i++){
            System.out.println(i);
        }
    }
    //Print all even numbers from 1 to 20
    private static void printEven(){
        System.out.println("print 1 to 20 even numbers are..:");
        for (int i =1;i<=20;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    //Print all odd numbers from 1 to 20
    private static void printOdd(){
        System.out.println("print 1 to 20 odd numbers are..:");
        for (int i =1;i<=20;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
    //Print numbers from 10 to 1 in reverse
    private static void printRev(){
        System.out.println("print 10 to 1 reverse numbers are..:");
        for (int i =10;i>=1;i--){
                System.out.println(i);
        }
    }
    //Display the multiplication table of a given number (e.g., 5)
    private static void table(){
        System.out.println("Enter the number which table you want:");
        int table = sc.nextInt();
        for (int i =1;i<=10;i++){
            System.out.println(i+"x"+table+"="+(i*table));
        }
    }
    //Print the squares of numbers from 1 to 10
    private static void squareNum(){
        System.out.println("Square number of 1 to 10: ");
        for (int i =1;i<=10;i++){
            System.out.println("Square Of "+i+" is: "+(i*i));
        }
    }
    //Calculate the sum of first 10 natural numbers
    private static void sumOfNatural(){

        int sum=0;
        for (int i =1;i<=10;i++){
             sum =i+sum;

        }
        System.out.println("Sum of Natural 1 to 10 numbers is: "+sum);
    }
    //Find the factorial of a given number
    private static void factorialNum(){
        System.out.println("Enter the number to find the factorial..");
        int n = sc.nextInt();

        int fact =1;
        for (int i =1;i<=n;i++){
           fact = fact*i;

        }
        System.out.println(n+" of factorial is: "+fact);
    }
    //Print characters from A to Z
    private static void charPrint(){
        System.out.println("A to Z upper case letters..");

        for(char ch = 'A';ch<='Z';ch++){
            System.out.println(ch+"");
        }
        System.out.println("a to z lower case letters..");
        for(char ch1 = 'a';ch1<='z';ch1++){
            System.out.println(ch1+"");
        }


    }


    public static void main(String[] args) {
       // printnum();
        //printEven();
        //printOdd();
        //printRev();
       // table();
        //squareNum();
        //sumOfNatural();
        //factorialNum();
        //charPrint();
    }
}
