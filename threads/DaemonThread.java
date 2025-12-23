package threads;

class Daemon extends Thread{
    public  void run(){
        System.out.println("Daemon thread was started..");
        for(int i =1;i<=300;i++){
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
        System.out.println("Daemon thread was ended..");
    }
}
public class DaemonThread {
    public static void main(String[] args) {

        System.out.println("Main method was started..");
        Daemon de = new Daemon();
        Thread t1 = new Thread(de);
        t1.setName("Vijay");
        t1.setDaemon(true);
        t1.start();

        for(int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
        System.out.println("Main ended...");

    }
}
