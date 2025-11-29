package filehandling;

import java.io.*;
import java.util.Scanner;

// 9.Move a file or folder from one directory to another directory?
public class Task9 {
    static Scanner sc = new Scanner(System.in);

    static void moveFile() throws  IOException{
        System.out.println("Enter the path 1: ");
        String path1 =sc.nextLine();
        System.out.println("Enter the path 2: ");
        String path2 =sc.nextLine();

        FileReader fr = new FileReader(path1);
        FileWriter fw = new FileWriter(path2);
        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }
        fr.close();
        fw.close();
        File fi = new File(path1);
         if( fi.delete()){
             System.out.println("File moved successfully");
         }
         else{
             System.out.println("File copy but original file not deleted");
         }

    }

    public static void main(String[] args) throws IOException{
        moveFile();
        sc.close();
    }
}
