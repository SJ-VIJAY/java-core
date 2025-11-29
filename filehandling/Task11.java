package filehandling;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// 11.Ask path and filename to read and reverse File Content?
public class Task11 {
    static Scanner sc = new Scanner(System.in);

    static void reverseFile() throws IOException {
        System.out.println("Enter the path and file name: ");
        String path = sc.nextLine();
        FileReader fr = new FileReader(path);
        StringBuilder sb = new StringBuilder();
        int ch;
        while((ch=fr.read()) != -1){
            sb.append((char)ch);
        }
         fr.close();

        System.out.println("Reverse content:");
        System.out.println(sb.reverse());

    }

    public static void main(String[] args) throws IOException{
        reverseFile();
        sc.close();
    }


}
