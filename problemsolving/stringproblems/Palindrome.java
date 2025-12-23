package problemsolving.stringproblems;

import java.util.Scanner;

public class Palindrome {
    static Scanner sc = new Scanner(System.in);
    static void isPalindrome(){
        System.out.println("Enter the String to check: ");
        String word = sc.nextLine();
        String word2 = "";

        for(int i = word.length()-1; i >= 0; i--){
            word2 += word.charAt(i);
        }
        if(word.equals(word2)){
            System.out.println("is a palindrome..");
        }
        else {
            System.out.println("is not a palindrome..");
        }
    }

    public static void main(String[] args) {
        isPalindrome();
    }
}
