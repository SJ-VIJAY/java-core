package filehandling;

import java.io.File;
import java.util.Scanner;

//6.List all the files in the given path or directory?
public class Task6 {
    static Scanner sc = new Scanner(System.in);

    static  void listFiles(){
        System.out.println("Enter the file path: ");
        String path = sc.nextLine();
        File fi = new File(path);

        if(fi.exists()){
            System.out.println("All files and Folders in given path: ");
            String [] str =fi.list(); // list will return in String array
            for(int i =0;i< str.length;i++){
                System.out.println(str[i]);
            }
        }
        else {
            System.out.println("Enter the path is incorrect");
        }
    }

    public static void main(String[] args) {
        listFiles();
        sc.close();
    }


}
