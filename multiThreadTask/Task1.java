package multiThreadTask;

class PrintEvenNo extends Thread{
    @Override
    public void run(){
        for(int i =2;i<=10;i=i+2){
            System.out.println(Thread.currentThread().getName()+" Even number: "+i);
        }
    }

}
class PrintOddNo extends Thread{
    @Override
    public void run(){
        for(int i =1;i<=10;i=i+2) {
            System.out.println(Thread.currentThread().getName()+" Odd number: "+i);
        }
   }
}

public class Task1{
    public static void main(String[] args) {
        PrintEvenNo pe = new PrintEvenNo();
        PrintOddNo po = new PrintOddNo();
// we extend Thread that also one new thread created..
        Thread t1 = new Thread(pe);
        Thread t2 = new Thread(pe);

        Thread t3 = new Thread(po);
        Thread t4 = new Thread(po);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}

