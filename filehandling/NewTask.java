package filehandling;

//read a data from one file and write it into another file?
//read a data from two file and write it into another single file?
//read a data from two file simultaneously and write it into another single file eg: 1 line here, then 1 line there?
//read n no of files data and write into single file?
//Retrieve text file only in the given folder?
//Retrieve user given file type in the given folder?
//Retrieve user given size file only in the given folder?
//move a file from one folder to another folder?


import java.io.*;

class FileTask {

    static void task1() {
        System.out.println("Read a data from one to another..");
        try {
            FileReader fr = new FileReader("C:\\Users\\Admin\\OneDrive\\Desktop\\New folder\\Folder1\\1.txt");
            FileWriter fw = new FileWriter("C:\\Users\\Admin\\OneDrive\\Desktop\\New folder\\Folder1\\2.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
            fr.close();
            fw.close();
        }catch (Exception e){}
        System.out.println("File Read and Write was success..");
        System.out.println(">>>>>>>>>>>>>>>>");
    }
//    static void task2(){
//        System.out.println("Read a data from two file..");
//        try{
//            FileReader fr = new FileReader("C:\\Users\\Admin\\OneDrive\\Desktop\\New folder\\Folder1\\3.txt");
//            FileReader fr1 = new FileReader("C:\\Users\\Admin\\OneDrive\\Desktop\\New folder\\Folder1\\4.txt")
//
//        } catch (Exception e) {
//
//        }



   // }









    public static void main(String[] args)  {
        //task1();

    }

}

