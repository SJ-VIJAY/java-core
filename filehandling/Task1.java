package filehandling;

import java.io.File;
import java.util.Scanner;

//1.Check the user given path is file or directory?
public class Task1 {
    static Scanner sc = new Scanner(System.in);

    static void checkFile(){
        System.out.println("Enter the path :");
        String path = sc.nextLine();
        File fi = new File(path);

        if(fi.isDirectory() || fi.isFile()){
            System.out.println("File or Directory founded ");
            System.out.println("File name "+ fi.getName());
        }
        else {
            System.out.println("File path is incorrect...");
        }

    }

}
