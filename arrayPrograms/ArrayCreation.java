package arrayPrograms;

import java.util.Scanner;

public class ArrayCreation {
    static Scanner sc = new Scanner(System.in);

    static void singleDim(){
        // literal way
        int [] ar = {10,20,30,40,50};

        System.out.println("Single dimensional array literal");
        for(int i = 0; i < ar.length; i++){
            System.out.print( ar[i] + " " );
        }
        // non-literal
        System.out.println();
       int [] ar1 = new int[5];
        ar1[0] = 10;
        ar1[1] = 20;
        ar1[4] = 50;
        System.out.println("single dimensional non-literal");
        for(int i = 0; i < ar1.length; i++){
            System.out.print(ar1[i] + " ");
        }
        // with user output
        int [] ar2 = new int[5];
        System.out.println("Enter the values for array...");
        for(int i = 0; i < ar2.length; i++){
             ar2 [i] = sc.nextInt();
        }
        System.out.println("with user input array..");
        for(int j = 0; j < ar2.length; j++){
            System.out.print(ar2[j] + " ");
        }
      }
    static void multiDim(){
        //literal way
        System.out.println("Multi dimensional literal way...");
     int [][] ar = {{1,2,3},
                    {4,5,6},
                    {7,8,9}};
       for(int i = 0; i < ar.length; i++) {
         for(int j = 0; j < ar.length; j++) {
             System.out.print(ar[i][j] + " ");
         }
         System.out.println();
       }
       //non literal - way

       int [][] ar2 = new int[3][3];
        System.out.println("Multi dimensional non literal way");
        System.out.println("Enter the values for array: ");
        for(int i = 0; i < ar2.length; i++){
            for(int j = 0; j < ar2.length; j++){
                ar2 [i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < ar2.length; i++){
            for(int j = 0; j < ar2.length; j++){
                System.out.print(ar2[i][j] + " ");
            }
            System.out.println();
        }
     }
     static void multiNoMatrix(){
        int [][] ar = new int [3][2];
         System.out.println("Multi dimensional non matrix...");
         for(int i = 0; i < ar.length; i++){
             for(int j = 0; j < ar[i].length; j++){
                  ar[i][j] = sc.nextInt();
             }
         }
         for(int i = 0; i < ar.length; i++){
             for(int j = 0; j < ar[i].length; j++){
                 System.out.print(ar[i][j] + " ");
             }
             System.out.println();
         }
     }
    static void jagged(){
      int [][] ar = new int[3][];
      ar[0] = new int[2];
      ar[1] = new int[4];
      ar[2] = new int[6];

        System.out.println("jagged array enter values: ");

        for(int i = 0; i < ar.length; i++){
            for(int j = 0; j < ar[i].length; j++){
                ar[i][j] = sc.nextInt();
            }
        }
        System.out.println("jagged values:");
        for(int i = 0; i < ar.length; i++){
            for(int j = 0; j < ar[i].length; j++){
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        singleDim();
//        multiDim();
//        multiNoMatrix();
        jagged();
    }

}
