package multiThreadTask;
//Task 6:
//create 5 thread each thread can print
//prime or not
//fibonacci series
//find max number in the given array
//sort in the given array

import java.util.Arrays;

class MyThread1 extends Thread{

    synchronized void primeNo(){
        int n = 10;
        boolean bo =true;
        for(int i =2;i < n;i++) {
            if (n % i == 0) {
                System.out.println (n+" :is not prime number");
                bo = false;
                break;
            }
        }
            if(bo == true){
                System.out.println(n +" :is a prime number");
            }
        System.out.println(">>>>>>>>>>>>>>>>>>>");

    }
    synchronized void fibonacci(){
        System.out.println("Fibonacci series....");
        int first = 0;
        int second = 1;
        int third =0;
        for (int i =1;i<=8;i++){
            System.out.println(first);
            third = first+second;
            first = second;
            second = third;

        }
        System.out.println(">>>>>>>>>>>>>>>>>>>");
    }

 synchronized void bubbleSort(){
      System.out.println("Sorted  array....");
      int [] ar ={30,40,50,60,70};

      int temp;

        for(int i =0;i<ar.length-1;i++) {
          for(int j=0;j<ar.length-i-1;j++){
              if(ar[j] > ar[j+1]){
                  temp = ar[j];
                  ar[j] = ar[j+1];
                  ar[j+1] = temp;
              }
          }
        }
     System.out.println(Arrays.toString(ar));
     System.out.println(">>>>>>>>>>>>>>>>>>>");
 }
    synchronized void maxArray() {
        System.out.println("Maximum in given array is ..");
        int[] ar = {30, 40, 50, 60, 70};
        int max = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        System.out.println("["+max+"]");
    }

}
class PrimeNo extends Thread{
    MyThread1 mt1;
    public PrimeNo(MyThread1 mt1){
        this.mt1 = mt1;
    }
    public void run(){
        mt1.primeNo();
    }
}
class Fibonacci extends Thread{
    MyThread1 mt1;
    public Fibonacci(MyThread1 mt1){
        this.mt1 = mt1;
    }
    public void run(){
        mt1.fibonacci();
    }
}
class BubbleSort extends Thread{
    MyThread1 mt1;
    public BubbleSort(MyThread1 mt1){
        this.mt1 = mt1;
    }
    public void run(){
        mt1.bubbleSort();
    }
}
    class MaxArray extends Thread{
        MyThread1 mt1;
        public MaxArray(MyThread1 mt1){
            this.mt1 = mt1;
        }
        public void run(){
            mt1.maxArray();
        }
    }


public class Task6 {
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1();

        Thread t1 = new PrimeNo(mt1);
        Thread t2 = new Fibonacci(mt1);
        Thread t3 = new BubbleSort(mt1);
        Thread t4 = new MaxArray(mt1);
        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
            t4.start();

        }catch (InterruptedException e){
            System.out.println(e);
        }

    }
}
