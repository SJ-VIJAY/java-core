package Ifelse;

import java.util.Scanner;

//Input marks and print if the student has passed or failed (pass if ≥ 40).
//Input marks and print:
//Distinction (≥ 75)
//First class (60–74)
//Second class (50–59)
//pass (40–49)
//Fail (< 40)
public class if8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student mark");
        int mark =sc.nextInt();
          if (mark >=75 && mark <= 100){
              System.out.println("Distinction");
          }
          else if (mark >= 60 && mark <= 74){
              System.out.println("First class");
          }
          else if (mark >= 50 && mark <= 59){
              System.out.println("Second class");
          }
          else if (mark >= 40 && mark <= 49){
              System.out.println("pass");
          }
          else{
              System.out.println("Fail");
          }
        }
    }

