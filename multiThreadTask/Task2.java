package multiThreadTask;

import java.util.Scanner;

class Table extends Thread{
    int num;
    public Table(int num){
        this.num=num;
    }
    public synchronized void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i+"x"+this.num+"="+(i*this.num));
        }
        System.out.println(">>>>>>>>>>>>>>>>>");
    }
}
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which 5 table you want.... ");
        System.out.println("Enter value 1: ");
        int num1 = sc.nextInt();
        Table t1 = new Table(num1);
        Thread th1 = new Thread(t1);

        System.out.println("Enter value 2: ");
        int num2 = sc.nextInt();
        Table t2= new Table(num2);
        Thread th2 = new Thread(t2);

        System.out.println("Enter value 3: ");
        int num3 = sc.nextInt();
        Table t3= new Table(num3);
        Thread th3 = new Thread(t3);

        System.out.println("Enter value 4: ");
        int num4 = sc.nextInt();
        Table t4= new Table(num4);
        Thread th4 = new Thread(t4);

        System.out.println("Enter value 5: ");
        int num5 = sc.nextInt();
        Table t5= new Table(num5);
        Thread th5 = new Thread(t5);
        try{
            th1.start();
            th1.join();
            th2.start();
            th2.join();
            th3.start();
            th3.join();
            th4.start();
            th4.join();
            th5.start();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }





    }

}
