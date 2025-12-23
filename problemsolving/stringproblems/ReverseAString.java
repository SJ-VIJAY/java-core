package problemsolving.stringproblems;

import java.util.Scanner;

public class ReverseAString {
    static Scanner sc = new Scanner(System.in);
    static void reverse(){
        System.out.println("give a string to reverse: ");
        String s = sc.nextLine();
        for(int i = s.length()-1; i >= 0; i--){
            System.out.print(s.charAt(i));
        }
    }
    static void reverse1(){
        StringBuilder sb = new StringBuilder();
        System.out.println("give a string to reverse: ");
        String s = sc.nextLine();
        for(int i = s.length(); i > 0; i--){
            sb.append(s.charAt(i-1));
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        reverse();
        //reverse1();
    }


}
