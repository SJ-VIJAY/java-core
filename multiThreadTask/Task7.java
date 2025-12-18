package multiThreadTask;
//Task 7:
//Create 4 Thread and print 1 to 400 make 2 thread as non daemon(1 to 200) and 2 thread as daemon(600 to 1000)

class MyThread extends Thread{
    int start ;
    int end;

    public MyThread(int start,int end){
      this.start = start;
      this.end = end;
    }

     public void run(){

         for (int i=start;i<=end;i++){
             System.out.println(Thread.currentThread().getName()+"--> "+i);
         }
    }

}
public class Task7 {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread(1,100);    // non Daemon
        MyThread mt2 = new MyThread(101,200);     // non Daemon
        MyThread mt3 = new MyThread(601,800);    // Daemon
        MyThread mt4 = new MyThread(801,1000);// Daemon

        mt1.start();
        mt2.start();

        mt3.setDaemon(true);
        mt4.setDaemon(true);
        mt3.start();
        mt4.start();
    }
}
