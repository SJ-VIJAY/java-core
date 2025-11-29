package filehandling;

import java.io.*;

public class DataStream {

    private static void dataReadWrite() throws IOException {

        String path = "C:\\Users\\Admin\\OneDrive\\Desktop\\Java\\Jul\\Day 58 file handle data stream object stream\\vijay\\2.txt";

        try{
            FileOutputStream fos = new FileOutputStream(path);
            DataOutputStream dos    = new DataOutputStream(fos);

            dos.writeInt(1012);
            dos.writeFloat(91.555f);
            dos.writeChar('A');
            dos.writeDouble(98.50);
            dos.writeBoolean(true);
            dos.writeUTF("He is very good student ");
            dos.writeLong(9827219734l);
            dos.writeShort(32134); // int data stored
            dos.writeByte(118);// byte data stored

            System.out.println("Data write was successfully done");
        }finally {
            System.out.println("waiting for read data");
        }
        try{
            FileInputStream fis = new  FileInputStream(path);
            DataInputStream dis    = new DataInputStream (fis);
// here same order only we read..

            int id = dis.readInt();
            float avg =  dis.readFloat();
            char grade = dis.readChar();
            double over = dis.readDouble();
            boolean msg = dis.readBoolean();
            String beh = dis.readUTF();
            long mob = dis.readLong();
            short tc = dis.readShort();// int data stored in short type also
            byte examNO = dis.readByte();   // int data stored in byte type also

            System.out.println("Data read was successfully done");
            System.out.println("Student data");
            System.out.println("...............");

            System.out.println("Student id no: "+id);
            System.out.println("Student average: "+avg);
            System.out.println("Student grade: "+grade);
            System.out.println("Student over all percentage: "+over+" %");
            System.out.println("Student was selected to ug course : "+msg);
            System.out.println("Student behaviour "+beh);
            System.out.println("Student mob no: "+mob);
            System.out.println("Student tc no: "+tc);
            System.out.println("Student exam no: "+examNO);
        }finally {
            System.out.println("Student details was fetched..");
        }
    }

    public static void main(String[] args) throws IOException{
        dataReadWrite();
    }


}
